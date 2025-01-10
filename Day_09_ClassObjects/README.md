# Classes and Objects in Java - The Basics

## 1. What is a Class?
Think of a class as a blueprint or template. Just like a blueprint for a house tells what features the house will have, a class defines what properties and actions its objects will have.

### Simple Class Example:
```java
// This is a class named 'Car'
public class Car {
    // Properties (what a car has)
    String color;
    String brand;
    int year;

    // Actions (what a car can do)
    public void startEngine() {
        System.out.println("Car engine started!");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped!");
    }
}
```

## 2. What is an Object?
An object is an actual instance created from a class. If a class is a blueprint for a house, then an object is the actual house built from that blueprint. You can create many objects from one class.

### Creating and Using Objects:
```java
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();  // First car object
        Car car2 = new Car();  // Second car object

        // Setting properties for car1
        car1.color = "Red";
        car1.brand = "Toyota";
        car1.year = 2024;

        // Setting properties for car2
        car2.color = "Blue";
        car2.brand = "Honda";
        car2.year = 2023;

        // Using object methods
        car1.startEngine();  // Output: Car engine started!
        car2.stopEngine();   // Output: Car engine stopped!
    }
}
```

## 3. Real-World Example
Let's use something familiar - a Student class:

```java
// Class definition
public class Student {
    // Properties
    String name;
    int age;
    
    // Actions
    public void study() {
        System.out.println(name + " is studying");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Using the Student class
public class Main {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Setting values for student1
        student1.name = "John";
        student1.age = 15;
        
        // Setting values for student2
        student2.name = "Mary";
        student2.age = 16;
        
        // Using the objects
        student1.study();  // Output: John is studying
        student2.sleep();  // Output: Mary is sleeping
    }
}
```

## 4. Key Points to Remember:

1. **Class:**
   - Is a template or blueprint
   - Contains properties (variables) and methods (functions)
   - Starts with `public class ClassName`

2. **Object:**
   - Is an instance of a class
   - Created using `new` keyword
   - Can have its own values for properties
   - Can use all methods defined in the class

3. **Creating Objects:**
   ```java
   ClassName objectName = new ClassName();
   ```

4. **Using Objects:**
   ```java
   objectName.propertyName = value;    // Set property
   objectName.methodName();            // Call method
   ```