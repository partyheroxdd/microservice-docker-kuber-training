FROM openjdk
EXPOSE 8080
ADD target/microservice-docker-kuber-training-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar", "/spring-boot-docker.jar"]