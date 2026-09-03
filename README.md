# 🎬 Movie Booking System – Spring Boot

A backend REST API for a **Movie Booking System** built using **Java, Spring Boot, Spring Data JPA, Hibernate, MySQL, and Spring Security**.

The system allows users to browse movies, view theatres and show timings, select seats, book tickets, make payments, and manage their bookings. Administrators can manage movies, theatres, screens, shows, seats, and users.

---

## 🚀 Features

### 👤 User Features

* User registration and login
* JWT-based authentication
* Browse available movies
* Search movies by title
* Filter movies by genre/language
* View movie details
* View theatres
* View available shows
* View available seats
* Select seats
* Book movie tickets
* View booking history
* Cancel bookings
* View booking details
* Update user profile

### 🛠️ Admin Features

* Admin authentication
* Add movies
* Update movies
* Delete movies
* Manage movie genres
* Add theatres
* Update theatres
* Delete theatres
* Manage screens
* Add/update/delete shows
* Manage seats
* View all bookings
* View registered users
* Block/unblock users

### 🎟️ Booking Features

* Seat availability checking
* Multiple-seat booking
* Booking confirmation
* Unique booking ID
* Booking history
* Ticket price calculation
* Booking cancellation
* Prevention of double booking

---

# 🏗️ System Architecture

```text
                    ┌──────────────────────┐
                    │      Client          │
                    │ Postman / Frontend   │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │   REST Controllers   │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │   Service Layer      │
                    │ Business Logic       │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │ Repository Layer     │
                    │ Spring Data JPA      │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │       MySQL          │
                    │      Database        │
                    └──────────────────────┘
```

---

# 🛠️ Tech Stack

| Technology      | Purpose                        |
| --------------- | ------------------------------ |
| Java 17         | Programming Language           |
| Spring Boot     | Backend Framework              |
| Spring MVC      | REST APIs                      |
| Spring Data JPA | Database Access                |
| Hibernate       | ORM                            |
| MySQL           | Database                       |
| Spring Security | Authentication & Authorization |
| JWT             | Token-based Authentication     |
| Maven           | Dependency Management          |
| Lombok          | Boilerplate Reduction          |
| Bean Validation | Request Validation             |
| Postman         | API Testing                    |
| Git & GitHub    | Version Control                |
| Docker          | Containerization               |

---

# 📁 Project Structure

```text
movie-booking-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/moviebooking/
│   │   │
│   │   │   ├── MovieBookingApplication.java
│   │   │   │
│   │   │   ├── config/
│   │   │   │   ├── SecurityConfig.java
│   │   │   │   └── OpenApiConfig.java
│   │   │   │
│   │   │   ├── controller/
│   │   │   │   ├── AuthController.java
│   │   │   │   ├── UserController.java
│   │   │   │   ├── MovieController.java
│   │   │   │   ├── TheatreController.java
│   │   │   │   ├── ScreenController.java
│   │   │   │   ├── ShowController.java
│   │   │   │   ├── SeatController.java
│   │   │   │   ├── BookingController.java
│   │   │   │   └── AdminController.java
│   │   │   │
│   │   │   ├── dto/
│   │   │   │   ├── UserDTO.java
│   │   │   │   ├── LoginRequest.java
│   │   │   │   ├── LoginResponse.java
│   │   │   │   ├── MovieDTO.java
│   │   │   │   ├── TheatreDTO.java
│   │   │   │   ├── ScreenDTO.java
│   │   │   │   ├── ShowDTO.java
│   │   │   │   ├── SeatDTO.java
│   │   │   │   ├── BookingDTO.java
│   │   │   │   └── PaymentDTO.java
│   │   │   │
│   │   │   ├── entity/
│   │   │   │   ├── User.java
│   │   │   │   ├── Role.java
│   │   │   │   ├── Movie.java
│   │   │   │   ├── Genre.java
│   │   │   │   ├── Theatre.java
│   │   │   │   ├── Screen.java
│   │   │   │   ├── Seat.java
│   │   │   │   ├── Show.java
│   │   │   │   ├── Booking.java
│   │   │   │   ├── BookingSeat.java
│   │   │   │   └── Payment.java
│   │   │   │
│   │   │   ├── repository/
│   │   │   │   ├── UserRepository.java
│   │   │   │   ├── MovieRepository.java
│   │   │   │   ├── GenreRepository.java
│   │   │   │   ├── TheatreRepository.java
│   │   │   │   ├── ScreenRepository.java
│   │   │   │   ├── SeatRepository.java
│   │   │   │   ├── ShowRepository.java
│   │   │   │   ├── BookingRepository.java
│   │   │   │   └── PaymentRepository.java
│   │   │   │
│   │   │   ├── service/
│   │   │   │   ├── UserService.java
│   │   │   │   ├── MovieService.java
│   │   │   │   ├── TheatreService.java
│   │   │   │   ├── ScreenService.java
│   │   │   │   ├── SeatService.java
│   │   │   │   ├── ShowService.java
│   │   │   │   ├── BookingService.java
│   │   │   │   └── PaymentService.java
│   │   │   │
│   │   │   ├── service/impl/
│   │   │   │   ├── UserServiceImpl.java
│   │   │   │   ├── MovieServiceImpl.java
│   │   │   │   ├── TheatreServiceImpl.java
│   │   │   │   ├── ShowServiceImpl.java
│   │   │   │   ├── BookingServiceImpl.java
│   │   │   │   └── PaymentServiceImpl.java
│   │   │   │
│   │   │   ├── security/
│   │   │   │   ├── JwtService.java
│   │   │   │   ├── JwtAuthenticationFilter.java
│   │   │   │   └── CustomUserDetailsService.java
│   │   │   │
│   │   │   ├── exception/
│   │   │   │   ├── ResourceNotFoundException.java
│   │   │   │   ├── BookingException.java
│   │   │   │   ├── SeatAlreadyBookedException.java
│   │   │   │   └── GlobalExceptionHandler.java
│   │   │   │
│   │   │   └── util/
│   │   │       └── BookingIdGenerator.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   │
│   └── test/
│
├── pom.xml
├── Dockerfile
├── docker-compose.yml
└── README.md
```

---

# 🗄️ Database Design

The major entities are:

```text
User
 │
 └──── Booking
          │
          └──── BookingSeat
                     │
                     └──── Seat

Movie
 │
 └──── Show
          │
          ├──── Theatre
          │
          └──── Screen
                    │
                    └──── Seat
```

## Main Tables

### Users

```text
users
-----------------------
id
name
email
password
phone
role
created_at
updated_at
```

### Movies

```text
movies
-----------------------
id
title
description
language
genre
duration
release_date
rating
poster_url
status
```

### Theatres

```text
theatres
-----------------------
id
name
location
city
address
```

### Screens

```text
screens
-----------------------
id
screen_name
capacity
theatre_id
```

### Seats

```text
seats
-----------------------
id
seat_number
seat_type
price
screen_id
```

### Shows

```text
shows
-----------------------
id
movie_id
screen_id
show_date
start_time
end_time
price
```

### Bookings

```text
bookings
-----------------------
id
booking_reference
user_id
show_id
total_amount
booking_status
booking_time
```

### Booking Seats

```text
booking_seats
-----------------------
id
booking_id
seat_id
```

### Payments

```text
payments
-----------------------
id
booking_id
amount
payment_method
payment_status
transaction_id
payment_time
```

---

# 🔗 Entity Relationships

```text
User
 |
 | 1
 |
 | *
Booking
 |
 | 1
 |
 | *
BookingSeat
 |
 | *
 |
Seat
```

```text
Movie
 |
 | 1
 |
 | *
Show
 |
 | *
 |
Screen
 |
 | *
 |
Seat
```

A user can have multiple bookings.

A movie can have multiple shows.

A theatre can have multiple screens.

A screen can contain multiple seats.

A show can have multiple booked seats.

---

# 🔐 Authentication

The application uses **JWT-based authentication**.

### Registration

```http
POST /api/auth/register
```

Request:

```json
{
  "name": "John Doe",
  "email": "john@gmail.com",
  "password": "password123",
  "phone": "9876543210"
}
```

### Login

```http
POST /api/auth/login
```

Request:

```json
{
  "email": "john@gmail.com",
  "password": "password123"
}
```

Response:

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "userId": 1,
  "role": "USER"
}
```

The JWT token should then be sent with protected requests:

```http
Authorization: Bearer <JWT_TOKEN>
```

---

# 🎬 Movie APIs

### Add Movie

```http
POST /api/movies
```

### Get All Movies

```http
GET /api/movies
```

### Get Movie By ID

```http
GET /api/movies/{movieId}
```

### Search Movie

```http
GET /api/movies/search?keyword=avatar
```

### Update Movie

```http
PUT /api/movies/{movieId}
```

### Delete Movie

```http
DELETE /api/movies/{movieId}
```

---

# 🏢 Theatre APIs

### Add Theatre

```http
POST /api/theatres
```

### Get All Theatres

```http
GET /api/theatres
```

### Get Theatre

```http
GET /api/theatres/{theatreId}
```

### Update Theatre

```http
PUT /api/theatres/{theatreId}
```

### Delete Theatre

```http
DELETE /api/theatres/{theatreId}
```

---

# 🖥️ Screen APIs

### Add Screen

```http
POST /api/screens
```

### Get Screens By Theatre

```http
GET /api/theatres/{theatreId}/screens
```

### Update Screen

```http
PUT /api/screens/{screenId}
```

### Delete Screen

```http
DELETE /api/screens/{screenId}
```

---

# 🎞️ Show APIs

### Create Show

```http
POST /api/shows
```

Example:

```json
{
  "movieId": 1,
  "screenId": 2,
  "showDate": "2026-09-10",
  "startTime": "18:30",
  "endTime": "21:00",
  "price": 250
}
```

### Get Shows For Movie

```http
GET /api/movies/{movieId}/shows
```

### Get Shows For Theatre

```http
GET /api/theatres/{theatreId}/shows
```

### Get Shows By Date

```http
GET /api/shows?date=2026-09-10
```

---

# 💺 Seat APIs

### Get Seats

```http
GET /api/shows/{showId}/seats
```

Example response:

```json
[
  {
    "seatId": 1,
    "seatNumber": "A1",
    "seatType": "PREMIUM",
    "price": 350,
    "available": true
  },
  {
    "seatId": 2,
    "seatNumber": "A2",
    "seatType": "PREMIUM",
    "price": 350,
    "available": false
  }
]
```

---

# 🎟️ Booking APIs

### Create Booking

```http
POST /api/bookings
```

Request:

```json
{
  "showId": 10,
  "seatIds": [1, 2, 3]
}
```

Response:

```json
{
  "bookingId": 101,
  "bookingReference": "MOV-20260904-101",
  "movie": "Avengers",
  "theatre": "PVR Cinemas",
  "showDate": "2026-09-10",
  "showTime": "18:30",
  "seats": [
    "A1",
    "A2",
    "A3"
  ],
  "totalAmount": 1050,
  "status": "CONFIRMED"
}
```

---

# ❌ Cancel Booking

```http
PUT /api/bookings/{bookingId}/cancel
```

---

# 📋 Booking History

```http
GET /api/bookings/my-bookings
```

---

# 🔍 Get Booking Details

```http
GET /api/bookings/{bookingId}
```

---

# 💳 Payment APIs

### Make Payment

```http
POST /api/payments
```

Request:

```json
{
  "bookingId": 101,
  "paymentMethod": "UPI"
}
```

Response:

```json
{
  "paymentId": 501,
  "bookingId": 101,
  "transactionId": "TXN123456789",
  "amount": 1050,
  "status": "SUCCESS"
}
```

> For a portfolio project, payment processing can initially be simulated rather than connected to a real payment gateway.

---

# 🔄 Booking Flow

```text
User Login
    ↓
Browse Movies
    ↓
Select Movie
    ↓
Select Theatre
    ↓
Select Date
    ↓
Select Show
    ↓
View Available Seats
    ↓
Select Seats
    ↓
Check Seat Availability
    ↓
Calculate Total Price
    ↓
Create Booking
    ↓
Payment
    ↓
Confirm Booking
    ↓
Generate Booking Reference
```

---

# ⚠️ Preventing Double Booking

One of the most important parts of this project is preventing two users from booking the same seat.

Before booking:

```text
User A ──► Select A1
             │
             ▼
       Check Availability
             │
             ▼
       A1 Available?
             │
             ▼
        Create Booking
```

The booking operation should be transactional.

Example:

```java
@Transactional
public BookingDTO createBooking(Long userId, BookingRequest request) {

    // 1. Find show

    // 2. Find requested seats

    // 3. Verify seats are available

    // 4. Calculate total amount

    // 5. Create booking

    // 6. Create booking-seat records

    // 7. Process payment

    // 8. Confirm booking

    return bookingDTO;
}
```

Database constraints and appropriate transaction/locking strategies should be used to protect against concurrent bookings.

---

# 📦 Maven Dependencies

The project requires dependencies for:

```xml
Spring Web
Spring Data JPA
Spring Security
MySQL Driver
JWT
Lombok
Validation
Spring Boot Test
```

Example dependency structure:

```xml
<dependencies>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>

    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

</dependencies>
```

---

# ⚙️ Configuration

Create:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.application.name=movie-booking-system

server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/movie_booking_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

jwt.secret=your-secret-key
jwt.expiration=86400000
```

---

# 🗃️ Create Database

Open MySQL:

```sql
CREATE DATABASE movie_booking_db;
```

Then start the Spring Boot application.

Hibernate can create/update the tables automatically when:

```properties
spring.jpa.hibernate.ddl-auto=update
```

is configured.

For production environments, database migrations using a tool such as Flyway or Liquibase are preferable.

---

# ▶️ How To Run

## 1. Clone Repository

```bash
git clone https://github.com/yourusername/movie-booking-system.git
```

## 2. Navigate Into Project

```bash
cd movie-booking-system
```

## 3. Configure MySQL

Create:

```sql
CREATE DATABASE movie_booking_db;
```

Update:

```properties
spring.datasource.username=root
spring.datasource.password=your_password
```

## 4. Build Project

```bash
mvn clean install
```

## 5. Run Application

```bash
mvn spring-boot:run
```

Application will start at:

```text
http://localhost:8080
```

---

# 🧪 Testing With Postman

Recommended testing sequence:

```text
1. Register User
       ↓
2. Login
       ↓
3. Copy JWT Token
       ↓
4. Add Authorization Header
       ↓
5. Get Movies
       ↓
6. Select Movie
       ↓
7. Get Shows
       ↓
8. Get Available Seats
       ↓
9. Select Seats
       ↓
10. Create Booking
       ↓
11. Make Payment
       ↓
12. Check Booking
```

Header:

```http
Authorization: Bearer <TOKEN>
Content-Type: application/json
```

---

# 🛡️ Exception Handling

The project uses centralized exception handling.

Example:

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleNotFound(
            ResourceNotFoundException ex) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }
}
```

Possible exceptions:

```text
ResourceNotFoundException
UserAlreadyExistsException
InvalidCredentialsException
SeatAlreadyBookedException
BookingException
PaymentException
InvalidBookingException
```

---

# 📄 Standard API Response

A common response format can be used:

```json
{
  "success": true,
  "message": "Booking created successfully",
  "data": {
    "bookingId": 101,
    "bookingReference": "MOV-20260904-101"
  },
  "timestamp": "2026-09-04T18:30:00"
}
```

Error response:

```json
{
  "success": false,
  "message": "Selected seat is already booked",
  "status": 409,
  "timestamp": "2026-09-04T18:31:00"
}
```

---

# 🔐 Role-Based Authorization

Two primary roles:

```text
ROLE_USER
ROLE_ADMIN
```

Example:

```text
/api/movies/**       → USER + ADMIN
/api/bookings/**     → USER
/api/admin/**        → ADMIN
```

Admin-only operations include:

```text
Create Movie
Update Movie
Delete Movie
Create Theatre
Create Screen
Create Show
View All Users
View All Bookings
```

---

# 📊 Pagination & Sorting

Movie listing can support pagination:

```http
GET /api/movies?page=0&size=10
```

Sorting:

```http
GET /api/movies?page=0&size=10&sort=title,asc
```

Spring Data JPA:

```java
Pageable pageable =
        PageRequest.of(page, size, Sort.by("title").ascending());

Page<Movie> movies =
        movieRepository.findAll(pageable);
```

---

# 🔎 Search & Filtering

Search by movie title:

```http
GET /api/movies/search?keyword=avengers
```

Filter by:

```text
Genre
Language
City
Movie
Date
Theatre
```

Example:

```http
GET /api/movies?genre=ACTION&language=ENGLISH
```

---

# 🧠 Important Backend Concepts Implemented

This project demonstrates:

* REST API development
* CRUD operations
* Layered architecture
* DTO pattern
* Entity relationships
* One-to-One relationship
* One-to-Many relationship
* Many-to-Many relationship
* Spring Data JPA
* Hibernate
* MySQL
* Transactions
* Pagination
* Sorting
* Searching
* Validation
* Global exception handling
* JWT authentication
* Role-based authorization
* Password encryption
* Concurrent booking handling
* Database constraints
* API testing
* Git/GitHub
* Docker

---

# 🧪 Unit & Integration Testing

Recommended test cases:

### User

```text
Register user
Login user
Invalid login
Duplicate email
```

### Movie

```text
Create movie
Get movie
Update movie
Delete movie
Search movie
```

### Booking

```text
Book available seat
Book multiple seats
Book already booked seat
Cancel booking
Invalid show
Invalid seat
```

Example:

```java
@Test
void shouldCreateBookingSuccessfully() {

    // Arrange

    // Act

    // Assert
}
```

---

# 🐳 Docker

Example Docker services:

```text
Movie Booking Application
        │
        ▼
Spring Boot Container
        │
        ▼
MySQL Container
```

Build application:

```bash
mvn clean package
```

Build Docker image:

```bash
docker build -t movie-booking-system .
```

Run:

```bash
docker run -p 8080:8080 movie-booking-system
```

---

# 📈 Future Improvements

The project can be extended with:

* Real payment gateway integration
* Email booking confirmation
* SMS notifications
* QR-code tickets
* Movie reviews and ratings
* Wishlist
* Offers and coupons
* Multiple cities
* Multiple languages
* Redis caching
* Kafka event processing
* Elasticsearch movie search
* AWS deployment
* Docker Compose
* Kubernetes
* CI/CD pipeline
* Prometheus monitoring
* Grafana dashboards
* API documentation with Swagger/OpenAPI

---

# 🔮 Advanced Architecture

For a more advanced version:

```text
                    API Gateway
                         │
          ┌──────────────┼──────────────┐
          │              │              │
          ▼              ▼              ▼
     User Service   Movie Service   Theatre Service
          │              │              │
          │              ▼              │
          │         Show Service        │
          │              │              │
          └──────────────┼──────────────┘
                         ▼
                  Booking Service
                         │
                         ▼
                  Payment Service
                         │
                         ▼
                       Kafka
                         │
              ┌──────────┴──────────┐
              ▼                     ▼
       Notification Service    Analytics
```

This can later be converted from a monolithic Spring Boot application into a **Spring Boot microservices architecture**.

---

# 📌 Git Commands

Initialize repository:

```bash
git init
```

Add files:

```bash
git add .
```

Commit:

```bash
git commit -m "Initial commit"
```

Add remote:

```bash
git remote add origin https://github.com/yourusername/movie-booking-system.git
```

Push:

```bash
git branch -M main
git push -u origin main
```

---

# 👨‍💻 Author

**Your Name**

Java Backend Developer

### Skills Demonstrated

```text
Java
Spring Boot
Spring Security
REST API
JPA/Hibernate
MySQL
JWT
Maven
Git
Docker
DSA
Design Patterns
```

---

# ⭐ Why This Project?

The Movie Booking System is a strong backend portfolio project because it demonstrates more than simple CRUD.

It covers real-world backend problems such as:

```text
Authentication
Authorization
Database relationships
Seat availability
Concurrent bookings
Transactions
Payments
Exception handling
Pagination
Searching
Scalable architecture
```

These concepts make the project suitable for demonstrating **Java + Spring Boot backend development skills** in interviews and on GitHub.

---

# 📜 License

This project is created for educational and portfolio purposes.
# Movie-Booking-System
