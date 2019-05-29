FROM openjdk:11-jre-slim

COPY ./target/mlapi-0.0.0-DEVEL.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch mlapi-0.0.0-DEVEL.jar'

ENTRYPOINT ["java","-jar","mlapi-0.0.0-DEVEL.jar"]
