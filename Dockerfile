FROM gradle:7.5.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build --no-daemon

FROM openjdk:17-jdk-slim
EXPOSE 8080
EXPOSE 443
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/Dagobah-0.0.1-SNAPSHOT.jar /app/dagobah.jar
RUN chmod +x /app/dagobah.jar
ENTRYPOINT ["java", "-jar", "/app/dagobah.jar", "--spring.data.mongodb.uri=${SPRING_DATASOURCE_URL}"]
