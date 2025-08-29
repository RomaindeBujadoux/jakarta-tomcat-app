# jakarta-tomcat-app

Projet d'exemple **Tomcat 10 + JSP/Servlet + Hibernate (JPA) + PostgreSQL** avec **Docker**.

## Prérequis
- Java 17+
- Maven 3.8+
- Docker + Docker Compose

## Build
```bash
mvn clean package
```

## Lancement (Docker)
```bash
docker-compose up --build
```
- Application : http://localhost:8080/jakarta-tomcat-app/users
- Adminer : http://localhost:8081 (Server: `postgres`, User: `myuser`, Password: `mypassword`, DB: `mydb`)

## Structure
- `src/main/java` : code Java (Entity, DAO, Servlet)
- `src/main/webapp` : JSP + WEB-INF
- `src/main/resources/META-INF/persistence.xml` : config JPA
- `Dockerfile` : image Tomcat custom
- `docker-compose.yml` : Postgres + Adminer + Tomcat

## Notes
- Dans Docker, l'hôte de la base est `postgres` (service docker-compose), pas `localhost`.
- `hibernate.hbm2ddl.auto=update` pour démo. En prod, utiliser `validate` ou des migrations (Flyway).
