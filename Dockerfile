FROM openjdk:17-jdk-slim

COPY build/libs/docker_cicd-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=prod", "app.jar"]