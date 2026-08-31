# Task 4: Age Calculator Web Application (Spring MVC)

## 📌 Overview
This task is a **Spring MVC Web Application** that calculates a user's age based on their birth date (year, month, day). It showcases Spring MVC request handling, `@RequestParam` extraction, controller logic, and model data passing to modern JSP views.

---

## 🎯 Learning Objectives
- Setting up Spring MVC `DispatcherServlet` in `web.xml`.
- Configuring `InternalResourceViewResolver` and static resource mappings.
- Creating `@Controller` classes with `@RequestMapping` and `@RequestParam`.
- Passing data to views via `org.springframework.ui.Model`.
- Building interactive JSP views with modern CSS aesthetics.

---

## 🏗️ Architecture & Directory Structure

```
src/com/agecalculator/
├── controller/
│   └── AgeController.java              # Handles / and /resultView requests
└── webapp/
    ├── WEB-INF/
    │   ├── application-context.xml     # Spring MVC config, view resolver, resource handler
    │   ├── web.xml                     # DispatcherServlet configuration
    │   └── view/
    │       ├── home.jsp                # Landing page
    │       ├── ageCalculatorForm.jsp   # Input form for birth date
    │       └── resultView.jsp          # Celebration result card showing age
    └── resources/
        └── css/
            └── style.css               # Modern glassmorphism UI styling
```

---

## 🌐 Endpoints & Flow

```
User GET / ──────► AgeController.showForm() ──────► ageCalculatorForm.jsp
                         │
              (User submits form: year, month, day)
                         ▼
User GET /resultView ──► AgeController.calculateMyAge() ──► Calculates Age ──► resultView.jsp
```

---

## ▶️ Deployment & Testing
1. Deploy the web module to Tomcat using IntelliJ Smart Tomcat or standalone Tomcat server.
2. Navigate to `http://localhost:8080/` to open the Age Calculator form.
3. Enter birth date parameters and submit to view the result card.
