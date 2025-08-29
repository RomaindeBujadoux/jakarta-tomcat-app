# Image Tomcat 10 avec JDK 17
FROM tomcat:10.1-jdk17

# Supprimer les apps par défaut de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Déploiement automatique du WAR (géré par docker-compose)
EXPOSE 8080
