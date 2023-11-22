FROM openjdk:17
MAINTAINER Pratima Shah

WORKDIR /app

COPY target/news-service-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

CMD ["java", "-jar", "news-service-0.0.1-SNAPSHOT.jar"]