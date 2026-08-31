# Task 1: Inversion of Control (IoC) with XML Configuration

## 📌 Overview
This task demonstrates the core principle of **Inversion of Control (IoC)** using Spring Framework's `ClassPathXmlApplicationContext`. Instead of creating objects manually using `new`, the Spring IoC Container manages object creation, configuration, and lifecycle.

---

## 🎯 Learning Objectives
- Understanding Inversion of Control (IoC) vs traditional object instantiation.
- Defining beans in Spring XML configuration (`applicationContext.xml`).
- Retrieving beans dynamically via `ApplicationContext.getBean()`.
- Leveraging polymorphism and interfaces to achieve loose coupling.

---

## 🏗️ Architecture & Class Structure

```
src/com/IoCTask/
├── Shape.java               # Interface with abstract draw() and default draw(Shape) methods
├── CircleShape.java         # Implementation of Shape for Circle
├── RectangleShape.java      # Implementation of Shape for Rectangle
├── TriangleShape.java       # Implementation of Shape for Triangle
├── Main.java                # Application runner demonstrating IoC container usage
└── applicationContext.xml   # Spring bean definitions
```

### UML Concept
```
           <<interface>>
               Shape
             +draw(): void
             +draw(Shape): void
                   ▲
      ┌────────────┼────────────┐
      │            │            │
CircleShape  RectangleShape TriangleShape
```

---

## ⚙️ Configuration (`applicationContext.xml`)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="circle" class="com.IoCTask.CircleShape"/>
    <bean id="rectangle" class="com.IoCTask.RectangleShape"/>
    <bean id="triangle" class="com.IoCTask.TriangleShape"/>

</beans>
```

---

## ▶️ How to Run
Run `com.IoCTask.Main.java`:
```bash
# Output:
OVRDN: Drawing Circle Shape
OVRDN: Drawing Rectangle Shape
OVRDN: Drawing triangle Shape
```
