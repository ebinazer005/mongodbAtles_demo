# Use Java 21
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy all project files
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port (Render will override with $PORT)
EXPOSE 8080

# Run the jar
CMD ["java", "-jar", "target/*.jar"]
