# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the project's build file and dependencies
COPY target/ServiceRegistry-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8761

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]