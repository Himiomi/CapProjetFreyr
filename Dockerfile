FROM openjdk:11-jdk-slim
COPY . /app
COPY src/main/resources/sqlite /app/src/main/resources/sqlite
COPY src/test/resources/sqlite /app/src/main/test/sqlite
WORKDIR /app
RUN ./mvnw package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/target/CapProjetFreyr-0.0.1-SNAPSHOT.jar"]
