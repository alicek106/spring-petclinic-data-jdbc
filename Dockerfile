FROM gradle:7.4-jdk17-alpine as builder
WORKDIR /app

COPY . /app
RUN gradle build -x test --parallel

## 
FROM openjdk:17.0-slim
WORKDIR /app

COPY --from=builder /app/build/libs/spring-petclinic-data-jdbc-3.0.0.BUILD-SNAPSHOT.jar .

CMD ["java", "-jar", "./build/libs/spring-petclinic-data-jdbc-3.0.0.BUILD-SNAPSHOT.jar"]

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-petclinic-data-jdbc-3.0.0.BUILD-SNAPSHOT.jar"]
