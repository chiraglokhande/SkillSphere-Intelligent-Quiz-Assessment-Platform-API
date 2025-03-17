# SkillSphere-Intelligent-Quiz-Assessment-Platform-API

## Overview
This is the backend of the **SkillSphere IQ Test Platform**, developed using **Spring Boot** and **Hibernate**. This project provides APIs for user authentication, course management, and quiz functionality.

## Features
### User Features:
- Register and login with secure authentication.
- View course roadmaps.
- View available courses.
- Take quizzes on various subjects.

### Admin Features:
- Login with a separate admin credential.
- View all registered users, edit user details, and delete users.
- Manage quizzes by adding, viewing, editing, and deleting them.
- Add, update, and delete questions.

## Tech Stack
- **Java** (Spring Boot, Hibernate)
- **MySQL** (Database)
- **Spring Security** (Authentication & Authorization)
- **JPA & Hibernate** (ORM)
- **Maven** (Build Tool)
- **Postman** (API Testing)

## API Endpoints

### Authentication APIs
| Method | Endpoint       | Description |
|--------|---------------|-------------|
| POST   | `/user/register` | Register a new user |
| POST   | `/user/login`    | Login as a user |

### User APIs
| Method | Endpoint       | Description |
|--------|---------------|-------------|
| GET    | `/course/getRoadmap/{courseId}` | Get course roadmap by course ID |
|--------|---------------|-------------|
| GET    | `/course/getCourse` | Get all available courses |
| GET    | `/quiz/get-quiz` | Get all available quizzes |
| GET    | `/question/get-questions` | Get all available questions |
| GET    | `/question/get-questionsByQuizTitle/{title}` | Get questions by quiz title |
| POST   | `/question/check-marks` | Calculate quiz marks |

### Admin APIs
| Method | Endpoint       | Description |
|--------|---------------|-------------|
| GET    | `/user/get` | Get all users |
| PUT    | `/user/update` | Edit user details |
| DELETE | `/user/delete/{username}` | Delete a user |
| POST   | `/quiz/add-quiz` | Add a new quiz |
| DELETE | `/quiz/delete-quiz/{title}` | Delete a quiz by title |
| POST   | `/question/add-question` | Add a new question |
| PUT    | `/question/update-questions` | Update questions |
| DELETE | `/answer/delete/{id}` | Delete an answer by ID |

## Setup & Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-repo/SkillSphere-IQ-Test-Platform.git
   cd SkillSphere-IQ-Test-Platform
   ```

2. **Configure Database:**
   - Update `application.properties` with your MySQL configuration.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build & Run the Application:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access API Endpoints:**
   - Base URL: `http://localhost:8080`

## Tools Used
- **Spring Boot** for backend development.
- **Hibernate & JPA** for ORM.
- **MySQL** for database.
- **Spring Security** for authentication.
- **Postman** for API testing.

## Contribution
If you wish to contribute, feel free to create a pull request or report issues.

## License
This project is licensed under the MIT License.

