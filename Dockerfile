FROM maven:3.8.5-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/EspnScraper-1.0-SNAPSHOT.jar espn.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","espn.jar"]