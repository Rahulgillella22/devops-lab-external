# Use official Python image
FROM python:3

# Set working directory
WORKDIR /app

# Copy Python file into container
COPY sumoftwo.py .

# Run the Python program (but override this at runtime using CMD args)
ENTRYPOINT ["python", "sumoftwo.py"]
