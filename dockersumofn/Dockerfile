FROM openjdk:11

WORKDIR /app

COPY sumofn.java .

RUN javac sumofn.java

CMD ["java","sumofn"]




# to run the docker 
# docker build -t sumofn . ( include the dot at end)
# docker run sumofn