# Use official OpenJDK image
FROM openjdk:17

# Create a directory inside container
WORKDIR /app

# Copy your java file into the container
COPY sumoftwo.java .

# Compile Java program
RUN javac sumoftwo.java

# Run Java program
CMD ["java", "sumoftwo"]


#to run the docker build -t sumoftwo .
#to run the docker run sumoftwo
