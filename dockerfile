# this is the base image
FROM openjdk:latest

#copy the jar file from the local to the container which will created be created in future
COPY target/spring-boot-rest-data-bms-maven-0.0.1-SNAPSHOT.jar app.jar

# the entrypoint commancd to be run once the caontainer is started
ENTRYPOINT ["java", "-jar", "/app.jar"]