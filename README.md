# 📌 Spring Boot CRUD API with MongoDB & OpenAPI (Swagger UI)

A simple and clean **CRUD REST API** built using **Spring Boot** and **MongoDB**, with **OpenAPI/Swagger UI** enabled for automatic API documentation.  
This project demonstrates how to build a modern backend service using Spring Boot 4.0.6 with the new built‑in OpenAPI support.

---

## 🚀 Features

- ✔ Spring Boot 4.0.6  
- ✔ MongoDB integration using Spring Data MongoDB  
- ✔ CRUD operations (Create, Read, Update, Delete)  
- ✔ OpenAPI 3 documentation (no springdoc needed)  
- ✔ Swagger UI enabled via Actuator  
- ✔ Validation using Jakarta Validation  
- ✔ Hot reload with Spring DevTools  

---

## 🛠️ Tech Stack

| Layer | Technology |
|------|------------|
| Backend | Spring Boot 4.0.6 |
| Database | MongoDB |
| API Docs | OpenAPI + Swagger UI (Actuator) |
| Build Tool | Maven |
| Language | Java 17+ |

---

## 📂 Project Structure
```
demo/
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── exception/
│   │   │   ├── mapper/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── DemoApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
│   └── test/
├── target/
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```
---

## ⚙️ Configuration

### application.properties

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/your_database_name
```
---
## 📘 API Documentation (Swagger UI)
Once the application is running, open:
```bash
http://localhost:8080/swagger-ui/index.html
```
---

## 🧪 Example Endpoints

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | ``/api/people`` | Create a new record |
| GET | ``/api/people`` | Get all records |
| GET | ``/api/people/{id}`` | Get a record by ID |
| PUT | ``/api/people/{id}`` | Update a record |
| DELETE | ``/api/people/{id}`` | Delete a record |
---

# 📦 Key Dependencies (pom.xml)
```bash
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```



