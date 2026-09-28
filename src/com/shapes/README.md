# Task 3.1: Spring Bean Scopes (Singleton vs Prototype)

## 📌 Overview
This task demonstrates the difference between Spring's default **Singleton** bean scope and the **Prototype** bean scope.

---

## 🎯 Learning Objectives
- Understanding the difference in bean lifecycle between `singleton` and `prototype`.
- Configuring `scope="singleton"` vs `scope="prototype"` in XML.
- Verifying memory addresses and object identity using Java equality `==`.

---

## 🏗️ Architecture & Class Structure

```
src/com/shapes/
├── Shape.java               # Shape interface
├── Draw2D.java              # 2D drawing collaborator
├── Draw3D.java              # 3D drawing collaborator
├── Circle.java              # Singleton scoped bean
├── Square.java              # Prototype scoped bean
├── Main.java                # Runner testing bean instances and memory references
└── applicationContext.xml   # Scope configurations
```

---

## ⚙️ Configuration (`applicationContext.xml`)
```xml
<!-- Circle is Singleton: One shared instance per Spring IoC container -->
<bean id="circle" class="com.shapes.Circle" scope="singleton">
    <constructor-arg ref="draw2d"/>
    <constructor-arg ref="draw3d"/>
</bean>

<!-- Square is Prototype: A new instance is created every time it is requested -->
<bean id="square" class="com.shapes.Square" scope="prototype">
    <property name="draw2D" ref="draw2d"/>
    <property name="draw3D" ref="draw3d"/>
</bean>
```

---

## ▶️ How to Run
Run `com.shapes.Main.java`:
```bash
# Output:
Are Circle instances identical (Singleton)? true
Circle 1 memory location: com.shapes.Circle@548b7f67
Circle 2 memory location: com.shapes.Circle@548b7f67
Drawing 2D Circle
Drawing 3D Circle
Are Square instances identical (Prototype)? false
Square 1 memory location: com.shapes.Square@7ca484e7
Square 2 memory location: com.shapes.Square@1bce4f0a
Drawing 2D Square
Drawing 3D Square
```
