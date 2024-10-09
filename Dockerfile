FROM gradle:7.5.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build --no-daemon

FROM openjdk:17-slim
EXPOSE 8000
EXPOSE 443
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/dagobah.jar
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/dagobah.jar"]