FROM openjdk:8-jdk-alpine

EXPOSE 8086

ADD target/*.jar Ges-F.jar

ENTRYPOINT ["java","-jar","Ges-F.jar"]

FROM maven:3.8.3-jdk-8
WORKDIR /GesFormation
COPY . .
RUN mvn clean install
CMD mvn spring-boot:run