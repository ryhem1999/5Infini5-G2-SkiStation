FROM openjdk:8-jdk-alpine
WORKDIR /APP
COPY target/gestion-station-ski-1.0.jar skitest.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/skitest.jar"]