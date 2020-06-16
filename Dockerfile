FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/project-Kar-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 6200
ENV JAVA_OPTS=""
RUN sh -c "touch project-Kar-0.0.1-SNAPSHOT.jar"
ENTRYPOINT [ "java", "-jar", "project-Kar-0.0.1-SNAPSHOT.jar" ]