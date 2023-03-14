FROM openjdk:17
EXPOSE 8080
ADD target/com-wipro-docker-project.jar com-wipro-docker-project.jar
ENTRYPOINT ["java","-jar","/com-wipro-docker-project.jar"]