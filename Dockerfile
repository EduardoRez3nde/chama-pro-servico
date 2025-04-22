FROM gradle:8.5-jdk21 AS build

WORKDIR /app

COPY --chown=gradle:gradle gradlew /app/
COPY --chown=gradle:gradle gradle /app/gradle
RUN ./gradlew build -x test || return 0

COPY --chown=gradle:gradle . /app
RUN ./gradlew build -x test

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
