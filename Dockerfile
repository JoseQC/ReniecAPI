FROM openjdk:8-jdk-alpine
COPY "./target/ReniecAPI-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]
