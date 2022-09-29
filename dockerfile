FROM openjdk:latest
COPY spring-boot-rest-data-bms-maven-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]