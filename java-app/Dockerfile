FROM maven:3-jdk-8
WORKDIR /app
COPY . /app
RUN mvn package
ENV http_proxy http://proxy:3128
ENV https_proxy http://proxy:3128
CMD ["java", "-Dhttp.proxyHost=proxy", "-DproxyPort=3128", "-jar", "target/docker-http-proxy-1.0-SNAPSHOT-shaded.jar"]
