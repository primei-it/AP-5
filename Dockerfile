# Używamy obrazu bazowego z JDK 23
FROM eclipse-temurin:23-jdk-alpine

# Ustawiamy katalog roboczy
WORKDIR /app

# Kopiujemy pliki projektu do kontenera
COPY . .

# Instalujemy Gradle Wrapper

# Download previously built artifact from "build" task (GitHub Actions)
COPY build/libs/AP-5-0.0.1-SNAPSHOT.jar /app/app.jar
# Budujemy projekt z wykorzystaniem Gradle

# Ustawiamy domyślną komendę uruchamiającą aplikację
CMD ["java", "-jar", "/app/app.jar"]