# Java Polymorphism

Polymorphism is one of the four core concepts of object-oriented programming (OOP), along with encapsulation, inheritance, and abstraction. The term **polymorphism** is derived from Greek, meaning "many forms." In Java, polymorphism allows objects to be treated as instances of their parent class rather than their actual class. This enables a single method to work in different ways depending on the object it is acting upon. This guide will delve into the concept of polymorphism in Java, exploring its types, benefits, and practical applications with detailed examples.

## **Table of Contents**

1. [Introduction to Polymorphism in Java](#introduction-to-polymorphism-in-java)
2. [Types of Polymorphism](#types-of-polymorphism)
   - [Compile-Time Polymorphism (Method Overloading)](#compile-time-polymorphism-method-overloading)
   - [Runtime Polymorphism (Method Overriding)](#runtime-polymorphism-method-overriding)
3. [Examples of Polymorphism](#examples-of-polymorphism)
   - [Method Overloading Example](#method-overloading-example)
   - [Method Overriding Example](#method-overriding-example)
4. [Benefits of Polymorphism](#benefits-of-polymorphism)
5. [Polymorphism in Java Interfaces](#polymorphism-in-java-interfaces)
6. [Common Use Cases](#common-use-cases)
7. [Best Practices and Common Mistakes](#best-practices-and-common-mistakes)
8. [Conclusion](#conclusion)

---

## **1. Introduction to Polymorphism in Java**

### **Understanding Polymorphism**

Polymorphism in Java allows methods to do different things based on the object it is acting upon, even though they share the same name. This is achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).

Polymorphism enables Java developers to design flexible and reusable code, making it easier to maintain and extend.

### **Why is Polymorphism Important?**

Polymorphism is crucial in Java for several reasons:
- **Code Reusability:** Write methods that work for any subclass of a superclass.
- **Flexibility:** Allows for the implementation of a method in different ways depending on the object.
- **Extensibility:** Adding new classes and methods becomes easier without affecting the existing code.

---

## **2. Types of Polymorphism**

### **2.1. Compile-Time Polymorphism (Method Overloading)**

**Compile-time polymorphism**, also known as **method overloading**, occurs when multiple methods in the same class have the same name but different parameters. The compiler determines which method to execute based on the method signature.

**Example:**
```java
// codeswithpankaj.com
class Calculator {
    // Method overloading by changing the number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading by changing the type of parameters
    double add(double a, double b) {
        return a + b;
    }
}

class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 20)); // Calls first method
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30)); // Calls second method
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5)); // Calls third method
    }
}
```

**Explanation:**
- The `Calculator` class has three `add()` methods with different parameter lists. The method that gets executed depends on the arguments passed during the method call.

### **2.2. Runtime Polymorphism (Method Overriding)**

**Runtime polymorphism**, also known as **method overriding**, occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method that gets executed is determined at runtime based on the object type.

**Example:**
```java
// codeswithpankaj.com
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog(); // Animal reference but Dog object
        Animal myCat = new Cat(); // Animal reference but Cat object

        myAnimal.sound(); // Calls method in Animal class
        myDog.sound(); // Calls overridden method in Dog class
        myCat.sound(); // Calls overridden method in Cat class
    }
}
```

**Explanation:**
- The `Dog` and `Cat` classes override the `sound()` method from the `Animal` class. At runtime, Java determines which method to invoke based on the object type.

---

## **3. Examples of Polymorphism**

### **3.1. Method Overloading Example**

Method overloading allows different methods with the same name to perform different tasks based on the input parameters.

**Example:**
```java
// codeswithpankaj.com
class PrintExample {
    void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(double number) {
        System.out.println("Printing double: " + number);
    }
}

class TestPrint {
    public static void main(String[] args) {
        PrintExample print = new PrintExample();
        print.print(10); // Prints integer
        print.print("Hello"); // Prints string
        print.print(10.5); // Prints double
    }
}
```

**Explanation:**
- The `PrintExample` class has three `print()` methods with different parameter types. The appropriate method is chosen at compile time based on the type of argument passed.

### **3.2. Method Overriding Example**

Method overriding allows a subclass to provide a specific implementation of a method already defined in its superclass.

**Example:**
```java
// codeswithpankaj.com
class Bank {
    int getInterestRate() {
        return 0;
    }
}

class HDFCBank extends Bank {
    @Override
    int getInterestRate() {
        return 7;
    }
}

class ICICIBank extends Bank {
    @Override
    int getInterestRate() {
        return 8;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank bank;
        bank = new HDFCBank();
        System.out.println("HDFC Bank Interest Rate: " + bank.getInterestRate());

        bank = new ICICIBank();
        System.out.println("ICICI Bank Interest Rate: " + bank.getInterestRate());
    }
}
```

**Explanation:**
- The `HDFCBank` and `ICICIBank` classes override the `getInterestRate()` method from the `Bank` class. At runtime, the method of the actual object type (`HDFCBank` or `ICICIBank`) is executed.

---

## **4. Benefits of Polymorphism**

### **4.1. Flexibility**

Polymorphism provides flexibility by allowing a single interface to represent different types of objects. This means you can write code that works on the superclass type, but at runtime, the correct subclass method is executed.

### **4.2. Code Reusability**

By using polymorphism, you can reuse code and avoid redundancy. Methods can be written to operate on the superclass type, making them applicable to any subclass type.

### **4.3. Maintainability**

Polymorphism simplifies code maintenance and expansion. Adding new functionality or classes requires minimal changes to existing code.

---

## **5. Polymorphism in Java Interfaces**

### **5.1. Polymorphism through Interfaces**

Interfaces in Java are a powerful way to achieve polymorphism. A class can implement multiple interfaces, and methods in those interfaces can be used polymorphically.

**Example:**
```java
// codeswithpankaj.com
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class TestDrawable {
    public static void main(String[] args) {
        Drawable d;
        d = new Circle();
        d.draw(); // Draws a circle

        d = new Rectangle();
        d.draw(); // Draws a rectangle
    }
}
```

**Explanation:**
- The `Drawable` interface is implemented by both `Circle` and `Rectangle` classes. The `draw()` method is called polymorphically, depending on the object type.

---

## **6. Common Use Cases**

### **6.1. Collections and Polymorphism**

Polymorphism is extensively used in Java collections. For example, the `List` interface is implemented by classes like `ArrayList`, `LinkedList`, etc. You can write methods that work with `List` without worrying about the specific implementation.

**Example:**
```java
// codeswithpankaj.com
import java.util.*;

class TestCollection {
    public static void main

(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Polymorphism");

        printList(list);
    }

    static void printList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
```

**Explanation:**
- The `printList()` method works with any `List` implementation (`ArrayList`, `LinkedList`, etc.), demonstrating polymorphism.

### **6.2. Factory Design Pattern**

The Factory design pattern often uses polymorphism to return objects of different classes based on input parameters.

**Example:**
```java
// codeswithpankaj.com
interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Cat meows");
    }
}

class AnimalFactory {
    static Animal getAnimal(String type) {
        if (type.equals("Dog")) {
            return new Dog();
        } else if (type.equals("Cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}

class TestFactory {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("Dog");
        if (animal != null) {
            animal.speak();
        }
    }
}
```

**Explanation:**
- The `AnimalFactory` returns an instance of `Dog` or `Cat` based on the input. The `speak()` method is called polymorphically.

---

## **7. Best Practices and Common Mistakes**

### **7.1. Best Practices**

- **Use Polymorphism for Extensibility:** Design your classes to take advantage of polymorphism, allowing for easier extension of your codebase.
- **Favor Composition Over Inheritance:** While polymorphism is often achieved through inheritance, consider using composition when it makes your design simpler and more flexible.
- **Keep Methods Simple:** Polymorphic methods should be kept simple to ensure that subclasses can easily override them.

### **7.2. Common Mistakes**

- **Overusing Polymorphism:** Not every situation requires polymorphism. Overusing it can lead to complex and difficult-to-maintain code.
- **Ignoring Method Contracts:** When overriding methods, make sure to respect the method contract (e.g., return types, exceptions).
- **Assuming Object Type:** Polymorphism should avoid assumptions about the actual object type. Use the `instanceof` check sparingly and only when necessary.

---

## **8. Conclusion**

Polymorphism is a powerful concept in Java that allows for flexible and reusable code. By understanding and properly implementing polymorphism, you can design more maintainable and extensible systems. Whether you're using method overloading, method overriding, or interfaces, polymorphism enables you to write cleaner and more efficient code.

### **Key Takeaways:**

- **Polymorphism** allows methods to perform different tasks based on the object they are acting upon.
- **Compile-time polymorphism** is achieved through method overloading, while **runtime polymorphism** is achieved through method overriding.
- **Interfaces** are a common way to implement polymorphism in Java.
- Use polymorphism wisely to create flexible and maintainable code.

By mastering polymorphism in Java, you’ll be well-equipped to tackle complex coding challenges and design robust, scalable applications. Happy coding with **codeswithpankaj.com**!

---
