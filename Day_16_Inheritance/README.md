# Java Inheritance - A Detailed Guide

Welcome to **Codes With Pankaj**! In this tutorial, we will dive deep into **Java Inheritance**, a fundamental concept in object-oriented programming (OOP). This guide will help you understand different types of inheritance in Java, how they work, and how to use them effectively.

## What is Inheritance in Java?

Inheritance is one of the four pillars of OOP (along with Encapsulation, Polymorphism, and Abstraction). It allows a class (subclass/child class) to acquire the properties and behaviors of another class (superclass/parent class). This promotes code reuse and enhances maintainability.

### Syntax of Inheritance in Java:
```java
class ParentClass {
    // Parent class properties and methods
}

class ChildClass extends ParentClass {
    // Child class properties and methods
}
```

## Types of Inheritance in Java
Java supports the following types of inheritance:

### 1. **Single Inheritance**
In **single inheritance**, a class inherits from only one parent class. This is the simplest form of inheritance.

#### Example:
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited method
        myCar.drive();  // Own method
    }
}
```

### 2. **Multilevel Inheritance**
In **multilevel inheritance**, a class inherits from another class, which in turn inherits from another class, forming a chain.

#### Example:
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric Car is charging...");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.start();   // Inherited from Vehicle
        myCar.drive();   // Inherited from Car
        myCar.charge();  // Own method
    }
}
```

### 3. **Hierarchical Inheritance**
In **hierarchical inheritance**, multiple child classes inherit from a single parent class.

#### Example:
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden...");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        
        Bike myBike = new Bike();
        myBike.start();
        myBike.ride();
    }
}
```

### 4. **Multiple Inheritance (Using Interfaces)**
Java does not support multiple inheritance with classes to avoid the **Diamond Problem**, but it allows multiple inheritance using **interfaces**.

#### Example:
```java
interface Engine {
    void start();
}

interface Transmission {
    void changeGear();
}

class Car implements Engine, Transmission {
    public void start() {
        System.out.println("Car engine starting...");
    }
    public void changeGear() {
        System.out.println("Car changing gears...");
    }
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.changeGear();
        myCar.drive();
    }
}
```

## Why Use Inheritance?
### Benefits of Inheritance:
- **Code Reusability** – Common methods and properties need not be rewritten in each class.
- **Improved Maintainability** – Changes in the parent class automatically apply to child classes.
- **Polymorphism Support** – Promotes dynamic method dispatch.

## Conclusion
Inheritance is a powerful feature in Java that promotes code reuse and scalability. Understanding its types and applications will help you design efficient Java programs.

For more Java tutorials, visit **[Codes With Pankaj](www.codeswithpankaj.com)**. Happy coding!

