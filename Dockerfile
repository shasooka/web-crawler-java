FROM openjdk:8-alpine

COPY target/web-crawler-java-*.jar /web-crawler.jar

CMD ["java", "-jar", "/web-crawler.jar"]