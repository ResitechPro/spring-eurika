FROM maven:3.9.5-amazoncorretto-17 AS build
COPY . /app
WORKDIR /app
RUN mvn package -DskipTests

FROM openjdk:17
COPY --from=build /app/target/spring-eurika.jar spring-eurika
ENTRYPOINT ["java", "-jar","spring-eurika"]