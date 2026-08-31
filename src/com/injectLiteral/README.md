# Task 3: Literal Value Injection & External Property Files

## 📌 Overview
This task demonstrates how to inject **literal values** (Strings, primitives) into Spring beans, both directly in XML and dynamically from an external `.properties` configuration file using Spring's `PropertySourcesPlaceholderConfigurer` (`<context:property-placeholder/>`).

---

## 🎯 Learning Objectives
- Externalizing application configuration into `application.properties`.
- Using `${property.key}` placeholders to inject database credentials.
- Injecting both object collaborators and literal values into the same bean.
- Decoupling configuration from application code.

---

## 🏗️ Architecture & Class Structure

```
src/com/injectLiteral/
├── Vehicle.java                 # Interface defining saveToDB() and getBrand()
├── Car.java                     # Implements Vehicle with constructor injection
├── Plane.java                   # Implements Vehicle with setter injection
├── config/
│   └── DBOperations.java        # Database simulation bean holding url, username, password
├── application.properties       # Database credentials & connection properties
├── applicationContext.xml       # XML configuration loading properties & wiring beans
└── Main.java                    # Runner testing literal injection and DB save operations
```

---

## ⚙️ Configuration

### `application.properties`
```properties
database.url=jdbc:mysql://localhost:3306/demo
database.username=root
database.password=admin
```

### `applicationContext.xml`
```xml
<!-- Load external properties file -->
<context:property-placeholder location="com/injectLiteral/application.properties"/>

<!-- Inject literal values from properties file -->
<bean id="dbOperation" class="com.injectLiteral.config.DBOperations">
    <property name="url" value="${database.url}"/>
    <property name="username" value="${database.username}"/>
    <property name="password" value="${database.password}"/>
</bean>

<bean id="car" class="com.injectLiteral.Car">
    <constructor-arg ref="dbOperation"/>
</bean>

<bean id="plane" class="com.injectLiteral.Plane">
    <property name="dbOps" ref="dbOperation"/>
</bean>
```

---

## ▶️ How to Run
Run `com.injectLiteral.Main.java`:
```bash
# Output:
Connecting to database with properties...
Url: jdbc:mysql://localhost:3306/demo userName: root password: admin
Saving BMW Car to DB...
Saved to DB Successfully
Connecting to database with properties...
Url: jdbc:mysql://localhost:3306/demo userName: root password: admin
Saving AirBus Plane to DB...
Saved to DB Successfully
```
