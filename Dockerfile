FROM openjdk:21
COPY target/*.jar application.jar
EXPOSE 8080
CMD ["java", "-jar", "application.jar"]