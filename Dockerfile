FROM bellsoft/liberica-openjdk-alpine:latest
WORKDIR /app
COPY ./src ./java
RUN mkdir ./out
RUN javac -sourcepath ./java -d out java/ru/fadeeva/Main.java
CMD java -classpath ./out ru.fadeeva.Main
