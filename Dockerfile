FROM gradle:7.5.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build --no-daemon
RUN ls /home/gradle/src/build/libs/

FROM openjdk:17-jdk-slim
EXPOSE 8000
EXPOSE 443
RUN mkdir /app
# Explicitly copy the correct JAR file to /app/dagobah.jar
COPY --from=build /home/gradle/src/build/libs/Dagobah-0.0.1-SNAPSHOT.jar /app/dagobah.jar
# List files to ensure it's correctly copied
RUN ls -l /app/
# Ensure the file is executable
RUN chmod +x /app/dagobah.jar
# Set the entry point to run the JAR
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/dagobah.jar"]
