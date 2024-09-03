FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} preety.jar
ENTRYPOINT ["java","-jar","/preety.jar"]