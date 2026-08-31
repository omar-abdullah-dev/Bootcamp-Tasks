# Task 3.3: Inversion of Control with Annotations

## 📌 Overview
This task demonstrates **Annotation-driven IoC Configuration** in Spring using `@Component` and `<context:component-scan/>`. Instead of manually declaring every bean in XML, Spring automatically detects and registers beans through classpath scanning.

---

## 🎯 Learning Objectives
- Enabling component scanning with `<context:component-scan base-package="..."/>`.
- Marking Java classes with `@Component` for automatic registration.
- Retrieving beans by interface / class type from the `ApplicationContext`.
- Reducing XML boilerplate with modern Spring annotations.

---

## 🏗️ Architecture & Class Structure

```
src/com/shapesWithAnnotations/
├── Shape.java               # Interface defining getArea()
├── Circle.java              # Annotated with @Component
├── Square.java              # Annotated with @Component
├── Main.java                # Runner testing scanned beans with user input
└── applicationContext.xml   # Configures context:component-scan
```

---

## ⚙️ Configuration (`applicationContext.xml`)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- Automatically detect and register @Component classes -->
    <context:component-scan base-package="com.shapesWithAnnotations"/>

</beans>
```

---

## ▶️ How to Run
Run `com.shapesWithAnnotations.Main.java`:
```bash
# Enter circle radius: 5
Circle area is: 78.53981633974483
# Enter square side: 4
Square area is: 16.0
```
