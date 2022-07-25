FROM openjdk:8
EXPOSE 8080
ADD target/Spring-Docker-Demo.jar Spring-Docker-Demo.jar
ENTRYPOINT ["java","-jar","/Spring-Docker-Demo.jar"]