FROM gradle:7.5.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ls /home/gradle/src/build/libs/
RUN ./gradlew build --no-daemon

FROM openjdk:24-jdk-slim
EXPOSE 8000
EXPOSE 443
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/dagobah.jar
RUN chmod +x /app/dagobah.jar
RUN ls /app/
ENTRYPOINT ["java", "-jar" ,"/app/dagobah.jar"]