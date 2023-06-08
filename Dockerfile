# Use a base image with Java 17 and necessary dependencies
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file and any other necessary files to the container
COPY target/*.jar company-management.jar

# Set the entrypoint command to run your application
ENTRYPOINT ["java", "-jar", "company-management.jar"]