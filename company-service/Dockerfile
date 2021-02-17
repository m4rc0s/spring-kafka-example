
FROM openjdk:11-jdk-slim AS builder
WORKDIR /src
ADD . /src
RUN ./gradlew clean bootJar

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=builder /src/build/libs/*-0.0.1-SNAPSHOT.jar .
CMD exec java -jar *.jar