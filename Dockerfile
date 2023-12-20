FROM openjdk:17
WORKDIR /app
COPY target/docker-0.0.1-SNAPSHOT.jar /app/app.jar
ENV DB_URL=jdbc:postgresql://host.docker.internal:5432/thongnguyen
ENV DB_USERNAME=postgres
ENV DB_PASSWORD=Anhhung789zxc!
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
