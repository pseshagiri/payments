FROM openjdk:17-alpine
ADD ./target/payments.jar app.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","app.jar"]
