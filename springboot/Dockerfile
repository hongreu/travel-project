FROM openjdk:8
ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 1904
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]