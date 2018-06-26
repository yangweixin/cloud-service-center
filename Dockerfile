FROM maven:latest

WORKDIR /var/data/maven/cloud-service-center

COPY ./ /var/data/maven/cloud-service-center

RUN mvn package

FROM java:latest

WORKDIR /usr/local/web/

COPY --from=0 /var/data/maven/cloud-service-center/target/cloud-service-center.jar .

CMD [ "java" "-jar" "cloud-service-center.jar"]

