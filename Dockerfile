# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="alfonso.jari@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 5018

# The application's jar file
ARG JAR_FILE=target/SpringBootJwtAuthentication-0.0.1.jar

# Add the application's jar to the container
ADD ${JAR_FILE} restapi-proyecto.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/restapi-proyecto.jar"]

# docker build
# sudo docker build -t alfonsojari/restapi-proyecto .

# docker run
# sudo docker run --name mayahaj-RESTAPI -p 5018:8080 -d alfonsojari/restapi-proyecto
