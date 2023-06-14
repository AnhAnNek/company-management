# Stage 1: Build the application
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /company-management
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests

# Stage 2: Set up the runtime environment
FROM openjdk:17-jdk-slim AS runtime
WORKDIR /company-management

# Copy the built JAR file from the previous stage
COPY --from=build /company-crud/target/company-management.jar .

# Specify the command to run the application
CMD ["java", "-jar", "company-management.jar"]
