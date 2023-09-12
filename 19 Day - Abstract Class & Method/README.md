# Abstract Class & Method

An abstract class is a class that cannot be instantiated on its own and is typically used as a base for other classes. It may contain abstract methods, which are declared without an implementation in the abstract class and must be implemented by concrete (non-abstract) subclasses. Abstract classes and methods are fundamental to Java's object-oriented programming (OOP) model and are used to define a common structure for a group of related classes.

Here are the key concepts related to abstract classes and methods:

1. **Abstract Class:**
   - An abstract class is declared using the `abstract` keyword.
   - You cannot create objects (instances) of an abstract class.
   - It can contain both abstract methods and regular (concrete) methods with implementations.
   - Subclasses of an abstract class must implement all of its abstract methods unless they are also declared as abstract.

   ```java
   abstract class Shape {
       abstract void draw(); // Abstract method
       
       void move() {
           System.out.println("Moving the shape.");
       }
   }
   ```

2. **Abstract Method:**
   - An abstract method is declared using the `abstract` keyword and has no method body (no implementation).
   - Abstract methods must be implemented by any concrete subclass that extends the abstract class.

   ```java
   abstract class Animal {
       abstract void makeSound(); // Abstract method
   }
   ```

3. **Concrete Subclass:**
   - A concrete subclass is a class that extends an abstract class and provides implementations for all of its abstract methods.
   - You can create objects (instances) of concrete subclasses.

   ```java
   class Circle extends Shape {
       @Override
       void draw() {
           System.out.println("Drawing a circle.");
       }
   }
   ```

Here's an example that demonstrates the use of abstract classes and methods:

```java
abstract class Shape {
    abstract void draw(); // Abstract method

    void move() {
        System.out.println("Moving the shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        circle.move();

        rectangle.draw();
        rectangle.move();
    }
}
```

In this example:

- We have an abstract class `Shape` with an abstract method `draw()` and a concrete method `move()`. Subclasses `Circle` and `Rectangle` extend `Shape` and provide implementations for the `draw()` method.

- In the `main` method, we create instances of `Circle` and `Rectangle`, and we can call both the `draw()` and `move()` methods on them.

Abstract classes and methods allow you to create a common structure for a group of related classes while enforcing that certain methods must be implemented by their concrete subclasses.