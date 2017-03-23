FROM marvambass/oracle-java8
RUN mkdir -p /usr/src/myapp
COPY target/coe-spring-data-mongo-rest-0.0.1-SNAPSHOT.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
EXPOSE 8080
