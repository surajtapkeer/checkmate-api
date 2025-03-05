# 📌 Checkmate API

A **Spring Boot API** for managing tasks efficiently. Users can create, update, delete, and categorize tasks into different lists.

## 🚀 Features

- ✅ **Task Management**: Create, update, delete, and retrieve tasks.
- 📂 **Task Categorization**: Organize tasks into lists.
- 📅 **Due Dates**: Assign due dates to tasks.
- 🔍 **Filtering & Searching**: Fetch tasks based on categories.

## 🏗️ Tech Stack

- **Backend**: Java 17, Spring Boot, Spring Data JPA
- **Database**: MySQL
- **Tools**: Maven, Hibernate
- **API Testing**: Postman

## 🛠️ Setup & Installation

### 1️⃣ Prerequisites

- Install **Java 21**
- Install **Maven**
- Set up **MySQL**

### 2️⃣ Clone the Repository

```sh
git clone https://github.com/yourusername/checkmate-api.git
cd checkmate-api
```

### 3️⃣ Configure Database

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/checkmate
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 4️⃣ Build and Run

```sh
mvn clean install
mvn spring-boot:run
```

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/task` | Create a new task |
| `GET` | `/task/{id}` | Get task by ID |
| `PUT` | `/task/{id}` | Update task by ID |
| `DELETE` | `/task/{id}` | Delete task by ID |
| `GET` | `/task/list/{listName}` | Get tasks by list name |

**Example Request (POST /task)**
```json
{
  "name": "Complete Angular Module",
  "dueDate": "2025-03-10",
  "status": false,
  "listName": "Work"
}
```

Happy Coding! 🚀
