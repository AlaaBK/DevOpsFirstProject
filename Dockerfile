FROM openjdk:8-jdk-alpine

EXPOSE 8086

ADD target/*.jar Ges-F.jar

ENTRYPOINT ["java","-jar","Ges-F.jar"]