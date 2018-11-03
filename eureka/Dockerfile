FROM 192.168.56.60:5000/java:8
VOLUME /tmp
ADD target/scloudk8s.eureka-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]