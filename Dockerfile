# Use a base image with JDK
FROM openjdk:17-jdk

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/*.jar app.jar


# Expose the port that the application runs on
EXPOSE 8080:8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]