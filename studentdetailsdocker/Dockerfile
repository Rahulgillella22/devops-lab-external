# Use an OpenJDK base image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy the Java source file into the image
COPY studentdetails.java .

# Compile the Java program
RUN javac studentdetails.java

# Default command; we’ll override this via Python
ENTRYPOINT ["java", "studentdetails"]

#docker build -t "studentdetails"
#docker run studentdetails Rahul 25 cse-iot