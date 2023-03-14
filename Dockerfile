FROM openjdk:17
EXPOSE 8080
ADD target/com-wipro-docker-jenkins.jar com-wipro-docker-jenkins.jar
ENTRYPOINT ["java","-jar","/com-wipro-docker-jenkins.jar"]