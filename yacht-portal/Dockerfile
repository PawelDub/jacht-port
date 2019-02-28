FROM openjdk:8-alpine

ADD build/libs/*.jar yacht-portal.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "yacht-portal.jar"]
