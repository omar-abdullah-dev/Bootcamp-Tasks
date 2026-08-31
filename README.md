# 🚀 Java & Spring Backend Bootcamp Tasks

Welcome to the **Java & Spring Backend Bootcamp** repository. This workspace contains all hands-on assignments, architectural exercises, and backend projects completed throughout the bootcamp journey.

Each task is fully encapsulated within its own dedicated package under `src/com/` to guarantee modularity, clear separation of concerns, and conflict-free version control across branches.

---

## 📁 Tasks Index & Package Guide

| # | Task | Package / Location | Concept / Stack | Details |
|:---:|---|---|---|:---:|
| **01** | **IoC Container** | [`src/com/IoCTask`](src/com/IoCTask) | Inversion of Control, XML Configuration, Bean Factory | [Task 1 Guide](src/com/IoCTask/README.md) |
| **02** | **Constructor & Setter DI** | [`src/com/ConstructorAndSetterInjection`](src/com/ConstructorAndSetterInjection) | Dependency Injection, Collaborator Wiring | [Task 2 Guide](src/com/ConstructorAndSetterInjection/README.md) |
| **03** | **Literal Value Injection** | [`src/com/injectLiteral`](src/com/injectLiteral) | External `.properties` files, Property Placeholder | [Task 3 Guide](src/com/injectLiteral/README.md) |
| **04** | **Bean Scopes** | [`src/com/shapes`](src/com/shapes) | Singleton vs. Prototype Scopes, Instance Lifecycle | [Task 3.1 Guide](src/com/shapes/README.md) |
| **05** | **Bean Lifecycle Callbacks** | [`src/com/vehicles`](src/com/vehicles) | Custom `init-method` & `destroy-method` Hooks | [Task 3.2 Guide](src/com/vehicles/README.md) |
| **06** | **IoC with Annotations** | [`src/com/shapesWithAnnotations`](src/com/shapesWithAnnotations) | `@Component`, `@Autowired`, Component Scanning | [Task 3.3 Guide](src/com/shapesWithAnnotations/README.md) |
| **07** | **Age Calculator** | [`src/com/agecalculator`](src/com/agecalculator) | Spring MVC, Request Parameters, Dynamic JSP Views | [Task 4 Guide](src/com/agecalculator/README.md) |
| **08** | **User Profile System** | [`src/com/profile`](src/com/profile) | Spring MVC, `@ModelAttribute`, Form Tag Library | [Task 5 Guide](src/com/profile/README.md) |
| **09** | **Form Validation & Database** | [`src/com/validation`](src/com/validation) | Hibernate Validator (JSR 380), JDBC DAO, Layered Architecture | [Task 6 Guide](src/com/validation/README.md) |

---

## 🛠️ Technology Stack

- **Core Language**: Java (JDK 17 / 8 compatible)
- **Framework**: Spring Framework 5.3+ (Core, Context, Beans, AOP, Web MVC, ORM, JDBC)
- **Validation**: Hibernate Validator 6.0+ & Java Bean Validation API (JSR 380)
- **Database & Persistence**: PostgreSQL / MySQL JDBC Drivers, `PreparedStatement` DAO
- **Web & Views**: JavaServer Pages (JSP), JSTL, Spring Form Tags, Apache Tomcat 9/10
- **Frontend & Styling**: Vanilla CSS, Dark Glassmorphism, Bootstrap 5

---

## 🌿 Branching Strategy & Pull Requests

Every task is isolated in its own dedicated branch to ensure independent reviews and zero merge conflicts:

| Branch Name | Task | Pull Request Reviewer |
|---|---|---|
| `IOC_Task` | Task 1: Inversion of Control with XML | `@SWEAhmedSalah` |
| `constructor_setter_DI_task` | Task 2: Constructor & Setter DI | `@SWEAhmedSalah` |
| `Literal_Injection` | Task 3: Literal Value Injection | `@SWEAhmedSalah` |
| `BeanScopes_Lifecycle` | Task 3.1: Bean Scopes | `@SWEAhmedSalah` |
| `Bean-Init-and-destroy-methods` | Task 3.2: Bean Lifecycle | `@SWEAhmedSalah` |
| `IoC-with-Annotations` | Task 3.3: IoC with Annotations | `@SWEAhmedSalah` |
| `age-calculator` | Task 4: Age Calculator Web App | `@SWEAhmedSalah` |
| `user-profile` | Task 5: User Profile Management System | `@SWEAhmedSalah` |
| `form-validation-with-hibernate` | Task 6: Form Validation with Hibernate | `@SWEAhmedSalah` |

---

## 💻 How to Build & Run Locally

### Compiling All Modules
```powershell
# Compile all source files
$libs = (Get-ChildItem -Path libs/*.jar | Where-Object { $_.Name -notlike "*-sources.jar" -and $_.Name -notlike "*-javadoc.jar" } | ForEach-Object { $_.FullName }) -join ";"
$sources = (Get-ChildItem -Path src -Filter *.java -Recurse | ForEach-Object { $_.FullName })
javac -cp "$libs" -d "out/production/Bootcamp-Tasks" $sources
```

### Running Spring Core Tasks (Tasks 1 to 6)
```powershell
# Example: Running Task 2 (Constructor & Setter DI)
java -cp "out/production/Bootcamp-Tasks;$libs" com.ConstructorAndSetterInjection.Main
```

### Running Spring MVC Web Tasks (Tasks 7 to 9)
Deploy the respective web folder to Apache Tomcat using IntelliJ IDEA / Smart Tomcat plugin with context path `/`.