FROM python:3.11-slim

WORKDIR /app
COPY . .
RUN pip install -r requirements.txt

CMD ["python", "app.py"]



#docker build -t my-login-app .
#docker run -p 5000:5000 my-login-app