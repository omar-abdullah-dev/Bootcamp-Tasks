# Task 6: Form Validation with Hibernate Validator & Database Persistence

## 📌 Overview
This task is a comprehensive **Enterprise Spring MVC Application** combining **JSR 380 / Hibernate Bean Validation**, a multi-tiered architecture (Controller, Service, DAO, Repository), and PostgreSQL / MySQL database persistence via JDBC.

---

## 🎯 Learning Objectives
- Implementing robust input validation using `@NotBlank`, `@Size`, `@Email`.
- Integrating Spring's `@Valid` annotation and inspecting `BindingResult` for field errors.
- Sanitizing input using `StringTrimmerEditor` in `@InitBinder`.
- Structuring applications cleanly into layered tiers (Controller ➔ Service ➔ DAO ➔ Database).
- Connecting and executing SQL statements with JDBC `PreparedStatement` and connection pooling principles.

---

## 🏗️ Architecture & Directory Structure

```
src/com/validation/
├── model/
│   └── Employee.java                  # Validated model with @NotBlank, @Size, @Email
├── controller/
│   └── RegisterEmployee.java          # Handles validation, @InitBinder, and routing
├── services/
│   └── RegistrationService.java       # Business service layer
├── dao/
│   └── EmployeeDAO.java               # Data Access Object executing SQL inserts
├── repository/
│   ├── Database.java                  # Repository interface
│   └── DatabaseOperations.java        # Repository implementation
├── config/
│   └── DBConnection.java              # Database connection manager with property injection
├── application.properties             # Database connection credentials (PostgreSQL / MySQL)
└── webapp/
    ├── WEB-INF/
    │   ├── application-context.xml    # Spring MVC context, view resolver, property placeholder
    │   ├── web.xml                    # DispatcherServlet deployment descriptor
    │   └── view/
    │       ├── registerForm.jsp       # Registration form displaying field-level validation errors
    │       └── formDetails.jsp        # Confirmation view upon successful database insertion
    └── resources/
        └── css/
            ├── style.css              # Custom styling with validation error highlighting
            └── bootstrap.min.css      # Bootstrap 5 stylesheet
```

---

## 🔒 Validation Rules in `Employee.java`

```java
@NotBlank(message = "This field cannot be empty or null")
@Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
private String username;

@NotBlank(message = "Email is required")
@Email(message = "Please enter a valid email address")
private String email;

@NotBlank(message = "Password is required")
@Size(min = 6, message = "Password must be at least 6 characters")
private String password;

@NotBlank(message = "Confirm Password is required")
@Size(min = 6, message = "Confirm Password must be at least 6 characters")
private String confirmPassword;
```

---

## 🔄 Multi-Tier Execution Flow

```
   Browser (JSP Form)
          │
          │ POST /registerEmployee (with @Valid Employee)
          ▼
┌─────────────────────────┐
│ RegisterEmployee        │ ──[if bindingResult.hasErrors()]──► Return to registerForm.jsp with errors
│ (Controller Layer)      │
└───────────┬─────────────┘
            │ [Validation Succeeded]
            ▼
┌─────────────────────────┐
│ RegistrationService     │ (Service Layer)
└───────────┬─────────────┘
            │
            ▼
┌─────────────────────────┐
│ EmployeeDAO             │ (DAO Layer)
└───────────┬─────────────┘
            │
            ▼
┌─────────────────────────┐
│ DBConnection            │ (Database: PostgreSQL / MySQL)
└─────────────────────────┘
```

---

## ▶️ Deployment & Testing
1. Configure database connection parameters in `src/com/validation/application.properties`.
2. Ensure the target database contains the `employee` table:
   ```sql
   CREATE TABLE employee (
       id SERIAL PRIMARY KEY,
       username VARCHAR(50) NOT NULL,
       email VARCHAR(100) NOT NULL,
       password VARCHAR(100) NOT NULL
   );
   ```
3. Run the application in Tomcat.
4. Test submitting invalid inputs to see validation messages rendered inline.
5. Submit valid inputs to persist to the database and view `formDetails.jsp`.
