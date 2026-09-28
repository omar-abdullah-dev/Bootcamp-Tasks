# Task 2: Constructor & Setter Dependency Injection

## 📌 Overview
This task demonstrates the two primary forms of **Dependency Injection (DI)** in Spring:
1. **Constructor-based Dependency Injection**: Used for mandatory dependencies.
2. **Setter-based Dependency Injection**: Used for optional or mutable dependencies.

---

## 🎯 Learning Objectives
- Injecting collaborator beans (`Draw2dShape`, `Draw3dShape`) into target beans.
- Configuring `<constructor-arg ref="..."/>` for constructor injection.
- Configuring `<property name="..." ref="..."/>` for setter injection.
- Observing how Spring resolves and wires bean dependencies automatically.

---

## 🏗️ Architecture & Class Structure

```
src/com/ConstructorAndSetterInjection/
├── Shape.java               # Interface defining draw2d() and draw3d()
├── Draw2dShape.java         # Dependency helper for 2D rendering
├── Draw3dShape.java         # Dependency helper for 3D rendering
├── CircleShape.java         # Shape utilizing Constructor Injection
├── SquareShape.java         # Shape utilizing Setter Injection
├── Main.java                # Application runner demonstrating both DI types
└── applicationContext.xml   # Spring XML dependency wiring
```

### Dependency Injection Pattern
- **`CircleShape`**:
  ```java
  public CircleShape(Draw2dShape draw2dShape, Draw3dShape draw3dShape) {
      this.draw2dShape = draw2dShape;
      this.draw3dShape = draw3dShape;
  }
  ```
- **`SquareShape`**:
  ```java
  public void setDraw2dSquare(Draw2dShape draw2dSquare) {
      this.draw2dSquare = draw2dSquare;
  }
  ```

---

## ⚙️ Configuration (`applicationContext.xml`)
```xml
<!-- Helper Beans -->
<bean id="draw2dShape" class="com.ConstructorAndSetterInjection.Draw2dShape"/>
<bean id="draw3dShape" class="com.ConstructorAndSetterInjection.Draw3dShape"/>

<!-- Constructor Injection -->
<bean id="circle" class="com.ConstructorAndSetterInjection.CircleShape">
    <constructor-arg ref="draw2dShape"/>
    <constructor-arg ref="draw3dShape"/>
</bean>

<!-- Setter Injection -->
<bean id="square" class="com.ConstructorAndSetterInjection.SquareShape">
    <property name="draw2dSquare" ref="draw2dShape"/>
    <property name="draw3dSquare" ref="draw3dShape"/>
</bean>
```

---

## ▶️ How to Run
Run `com.ConstructorAndSetterInjection.Main.java`:
```bash
# Output:
Drawing 2D Circle
Drawing 3D Circle
Drawing 2D Square
Drawing 3D Square
```
