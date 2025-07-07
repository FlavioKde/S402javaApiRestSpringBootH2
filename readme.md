## 🍓 REST API with Spring Boot & H2 Database

This project is a basic CRUD REST API built with Spring Boot and Java 19, designed to manage fruits in an in-memory H2 database. It's part of a training task focused on mastering HTTP verbs, database integration, and structured exception handling.

## 🧾 Project Overview

- Implements a complete Create, Read, Update, Delete (CRUD) application 🎯
- Uses H2 as the in-memory database 💾
- Built following the Model-Service-Controller architecture 🧱
- Includes a centralized `GlobalExceptionHandler` for clean error responses 🛡️
- Integrates Swagger for live API documentation and testing 💬

## 🚀 Technologies Used

- Java 19 ☕
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database 🧠
- Gradle
- Swagger UI (via Springdoc OpenAPI)
- Global Exception Handling with `@RestControllerAdvice`

## 📦 Package Structure

cat.itacademy.s04.t02.n01.controllers cat.itacademy.s04.t02.n01.model cat.itacademy.s04.t02.n01.services cat.itacademy.s04.t02.n01.repository cat.itacademy.s04.t02.n01.exception


## 🍍 Entity: Fruit

```java
public class Fruit {
    private int id;
    private String name;
    private int quantityKilos;
}

## 🔧 API Endpoints

### 🟢 POST → `/fruita/add`
_Adds a new fruit to the database._

```json
{
  "name": "Strawberry",
  "quantityKilos": 10
}
🟡 PUT → /fruita/update
Updates an existing fruit based on its ID.

json
{
  "id": 3,
  "name": "Apple",
  "quantityKilos": 15
}
🔴 DELETE → /fruita/delete/{id}
Deletes a fruit by its ID.

Example: /fruita/delete/2

🔍 GET → /fruita/getOne/{id}
Returns a single fruit by its ID.

Example: /fruita/getOne/5

📄 GET → /fruita/getAll
Returns a list of all fruits stored.

##  📚 Resources Used
Spring Boot with H2 Database

ResponseEntity in Spring

🛡️ Error Handling
All errors are managed through a custom GlobalExceptionHandler, which returns consistent JSON responses for exceptions like:

Entity not found

Invalid input data

Duplicate entries

📖 Swagger UI
You can explore and test the API using Swagger at:

http://localhost:8080/swagger-ui/index.html
Swagger is powered by Springdoc OpenAPI and automatically generates documentation based on your controller methods.

🧪 How to Run
bash
./gradlew bootRun
Access H2 console:

http://localhost:8080/h2-console
