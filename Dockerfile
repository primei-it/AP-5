# Używamy obrazu bazowego z JDK 23
FROM eclipse-temurin:23-jdk-alpine

# Ustawiamy katalog roboczy
WORKDIR /app

# Kopiujemy pliki projektu do kontenera
COPY . .

# Instalujemy Gradle Wrapper
RUN ./gradlew wrapper

# Budujemy projekt z wykorzystaniem Gradle
RUN ./gradlew build

# Ustawiamy domyślną komendę uruchamiającą aplikację
CMD ["java", "-jar", "build/libs/AP-5-0.0.1-SNAPSHOT.jar"]