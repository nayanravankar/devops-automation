FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/docker-practice-0.0.1-SNAPSHOT.jar docker-practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-practice-0.0.1-SNAPSHOT.jar"]