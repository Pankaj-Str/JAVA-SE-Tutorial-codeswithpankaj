# Java Interfaces

An interface is a blueprint for a class that defines a set of abstract methods (methods without implementations) that any class implementing the interface must provide. Interfaces allow you to define a contract that classes must adhere to, ensuring a consistent structure for implementing classes. They are an important part of Java's object-oriented programming (OOP) model and support multiple inheritance through multiple interface implementation.

Here are some key points about Java interfaces:

1. **Declaration:** You declare an interface using the `interface` keyword, followed by the interface name and a list of abstract method signatures.

   ```java
   interface Drawable {
       void draw();
   }
   ```

2. **Methods:** Interfaces can contain abstract methods, which are methods without a body. These methods are implicitly `public` and `abstract`, so you don't need to use those modifiers explicitly.

3. **Implementing Interfaces:** A class implements an interface using the `implements` keyword. A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.

   ```java
   class Circle implements Drawable {
       @Override
       public void draw() {
           System.out.println("Drawing a circle.");
       }
   }
   ```

4. **Default Methods (Java 8+):** Starting with Java 8, interfaces can also have default methods with implementations. These methods can be overridden by implementing classes or used as-is.

   ```java
   interface Shape {
       void draw();

       default void displayInfo() {
           System.out.println("This is a shape.");
       }
   }
   ```

5. **Static Methods (Java 8+):** Java 8 introduced static methods in interfaces. These methods are associated with the interface itself, not with instances of implementing classes.

   ```java
   interface MathOperations {
       static int add(int a, int b) {
           return a + b;
       }
   }
   ```

6. **Functional Interfaces (Java 8+):** A functional interface is an interface with a single abstract method. These interfaces can be used with lambda expressions and method references.

   ```java
   @FunctionalInterface
   interface Calculator {
       int calculate(int a, int b);
   }
   ```

7. **Marker Interfaces:** Some interfaces in Java do not contain any methods and are used as markers. A marker interface indicates a specific capability or characteristic of a class. Examples include `Serializable` and `Cloneable`.

Here's an example that demonstrates the use of an interface in Java:

```java
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
```

In this example:

- We have an interface `Drawable` with an abstract method `draw()`.

- Two classes, `Circle` and `Rectangle`, implement the `Drawable` interface and provide their own implementations of the `draw()` method.

- In the `main` method, we create instances of `Circle` and `Rectangle`, treating them as `Drawable` objects and calling the `draw()` method on each. This demonstrates polymorphism, as different objects provide different implementations of the same interface method.