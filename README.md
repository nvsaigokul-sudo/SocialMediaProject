# Social Media Project

## Project Overview

Social Media Project is a Spring Boot backend application implementing core social media functionalities such as user management, posts, likes, and comments. The project follows a layered architecture and uses REST APIs, JPA (Hibernate), JWT-based authentication, and PostgreSQL for data persistence.

---

## Features

* User registration and login
* JWT-based authentication and authorization
* Create, update, and delete posts
* Like and unlike posts
* Add and manage comments
* Secure APIs using Spring Security
* Global exception handling
* Database operations using Spring Data JPA and Hibernate

---

## Architecture

```
Controller → Service → Repository → Database
```

### Layers

* Controller Layer: Handles REST API requests and responses
* Service Layer: Contains business logic
* Repository Layer: Performs database operations using JPA
* Model Layer: Defines entity classes mapped to database tables

---

## Technologies Used

* Java 21
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

---

## Authentication Flow

1. User logs in using `/auth/login`
2. Server validates credentials
3. JWT token is generated and returned
4. Client sends token in the Authorization header
5. JwtFilter validates the token for secured endpoints

Example header:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## Main Modules

### Controllers

* AuthController
* UserController
* PostController
* LikeController
* CommentController

### Security

* SecurityConfig
* JwtFilter
* JwtUtil
* CustomUserDetailsService

### Exception Handling

* GlobalExceptionHandler
* ResourceNotFoundException
* ErrorResponse

---

## Database Entities

* User
* Post
* Comment
* Like

---

## Running the Project

1. Clone the repository:

```
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA or Eclipse.

3. Configure PostgreSQL database settings in `application.properties`.

4. Run:

```
SocialMediaProjectApplication.java
```

---

## API Testing

Use Postman to test APIs.

Sample endpoints:

* POST /auth/login
* POST /posts
* GET /posts
* POST /likes
* POST /comments

---

## Future Improvements

* Pagination for posts
* Image upload support
* Notification system
* Role-based admin access
* Microservice architecture

---

## Author

Developed as a backend project to implement real-world social media functionality using Spring Boot.
