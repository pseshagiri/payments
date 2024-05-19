FROM openjdk:17-alpine
ADD ./target/payments.jar app.jar
EXPOSE 9003:9003
ENTRYPOINT ["java","-jar","app.jar"]
