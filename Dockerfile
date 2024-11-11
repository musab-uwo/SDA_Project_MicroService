
FROM openjdk:23-jdk-slim

WORKDIR /app

COPY target/dummy-microservice-0.0.1-SNAPSHOT.jar app.jar

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
