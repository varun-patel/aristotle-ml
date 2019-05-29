FROM openjdk:11-jre-slim

COPY ./target/loginapi-0.0.0-DEVEL.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch loginapi-0.0.0-DEVEL.jar'

ENTRYPOINT ["java","-jar","loginapi-0.0.0-DEVEL.jar"]
