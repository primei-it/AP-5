FROM openjdk:21-jdk-slim

WORKDIR /app

COPY . .

RUN ./gradlew build

CMD ["java", "-jar", "build/libs/AP-5-0.0.1-SNAPSHOT.jar"]