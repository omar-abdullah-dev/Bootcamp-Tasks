# Bootcamp-Tasks

This repository contains all Java & Spring Backend Bootcamp tasks and assignments.
Each task is organized into its own dedicated package and directory structure under `src/com/` to ensure modularity, clear separation of concerns, and conflict-free version control.

---

## 📁 Repository Structure & Tasks Overview

| # | Task / Concept | Package / Directory | Description |
|---|---|---|---|
| 1 | **IoC Container** | `src/com/IoCTask` | Inversion of control demonstration with Shape classes (`CircleShape`, `RectangleShape`, `TriangleShape`) and Spring XML configuration. |
| 2 | **Constructor & Setter DI** | `src/com/ConstructorAndSetterInjection` | Dependency injection using both constructor and setter injection for 2D & 3D shape drawing services. |
| 3 | **Literal Injection** | `src/com/injectLiteral` | Injection of literal values and database configuration loaded from external `application.properties`. |
| 4 | **Bean Scopes** | `src/com/shapes` | Demonstrating singleton vs. prototype bean scopes in Spring container lifecycle. |
| 5 | **Bean Lifecycle (Init / Destroy)** | `src/com/vehicles` | Custom initialization (`init-method`) and cleanup (`destroy-method`) callbacks for bean management. |
| 6 | **IoC with Annotations** | `src/com/shapesWithAnnotations` | Annotation-driven component scanning using `@Component`, `@Autowired`, and `@Qualifier`. |
| 7 | **Age Calculator (Spring MVC)** | `src/com/agecalculator` | Spring MVC web application calculating age from user input with custom JSP views and CSS styling. |
| 8 | **User Profile System (Spring MVC)** | `src/com/profile` | Spring MVC web application handling user profile registration and data presentation with form binding. |
| 9 | **Form Validation with Hibernate** | `src/com/validation` | Spring MVC application with Hibernate validation annotations (`@NotBlank`, `@Size`, `@Email`), service layer, and PostgreSQL/MySQL DAO integration. |

---

## 🛠️ Technologies & Libraries
- **Language**: Java (JDK 17 / 8 compatible)
- **Framework**: Spring Framework 5.3+ (Core, Context, Beans, AOP, MVC, ORM)
- **Validation**: Hibernate Validator & Java Validation API (JSR 380)
- **View Engine**: JSP / JSTL
- **Styling**: Vanilla CSS & Glassmorphism UI / Bootstrap 5
- **Database**: PostgreSQL / MySQL JDBC Drivers

---

## 🌿 Branching & Pull Requests
Each task is developed in its own dedicated branch:
- `IOC_Task`
- `constructor_setter_DI_task`
- `Literal_Injection`
- `BeanScopes_Lifecycle`
- `Bean-Init-and-destroy-methods`
- `IoC-with-Annotations`
- `age-calculator`
- `user-profile`
- `form-validation-with-hibernate`

All pull requests are reviewed by `@SWEAhmedSalah`.