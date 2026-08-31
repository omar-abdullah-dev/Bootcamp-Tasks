# Task 3.2: Spring Bean Lifecycle (Init & Destroy Methods)

## 📌 Overview
This task demonstrates custom **Bean Lifecycle Callbacks** in Spring. When a bean is instantiated and configured, Spring triggers its custom `init-method`. When the container is closed, Spring triggers its `destroy-method` for cleanup.

---

## 🎯 Learning Objectives
- Understanding the Spring Bean Lifecycle phases.
- Declaring custom initialization methods (`init-method="connectToDatabase"`).
- Declaring custom cleanup methods (`destroy-method="disconnectFromDatabase"`).
- Explicitly closing `ClassPathXmlApplicationContext` to trigger destruction hooks.

---

## 🏗️ Architecture & Class Structure

```
src/com/vehicles/
├── Vehicle.java                 # Vehicle interface with saveToDB() and getModel()
├── Car.java                     # Car implementation
├── Plane.java                   # Plane implementation
├── config/
│   └── DBOperations.java        # Holds lifecycle callbacks connectToDatabase() / disconnectFromDatabase()
├── application.properties       # Database credentials
├── applicationContext.xml       # Configures init-method and destroy-method
└── Main.java                    # Runner demonstrating full bean lifecycle execution
```

---

## ⚙️ Configuration (`applicationContext.xml`)
```xml
<bean id="dbOperations" class="com.vehicles.config.DBOperations"
      init-method="connectToDatabase"
      destroy-method="disconnectFromDatabase">
    <property name="url" value="${database.url}"/>
    <property name="userName" value="${database.username}"/>
    <property name="password" value="${database.password}"/>
</bean>
```

---

## ▶️ How to Run
Run `com.vehicles.Main.java`:
```bash
# Output:
connection to database established ……
Connecting to database using configurations :  
Url: jdbc:mysql://localhost:3306/demo Username: root Password: admin
Saving ....
Tesla Model 3 Car Saved to DB Successfully
Connecting to database using configurations :  
Url: jdbc:mysql://localhost:3306/demo Username: root Password: admin
Saving ....
Boeing 777 Plane Saved to DB Successfully
connection to database closed……
```
