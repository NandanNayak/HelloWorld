FROM maven:3.9-amazoncorretto-8

WORKDIR /app

COPY ./src /app/src

COPY ./pom.xml /app

RUN mvn package && \
    rm -rf ./src && \
    rm ./pom.xml

# Comment the below line and run "docker run -it helloworld:1.0 /bin/bash" to exec into the container
ENTRYPOINT ["java", "-jar", "./target/HelloWorld-1.0-SNAPSHOT.jar"]


