# Use a imagem base do Java
FROM openjdk:11-jdk-slim
COPY target/demo-11-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

# Defina o comando de inicialização da aplicação
CMD ["java", "-jar", "/app.jar"]
