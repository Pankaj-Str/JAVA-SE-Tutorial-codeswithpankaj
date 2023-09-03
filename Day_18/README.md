# Java Method Overriding

Method overriding is a fundamental concept in Java's object-oriented programming (OOP) that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a subclass defines a method with the same name, return type, and parameters as a method in its superclass, it is said to be overriding that method.

Here are the key points to understand about method overriding in Java:

1. **Inheritance**: Method overriding is closely related to inheritance. It enables a subclass to inherit a method from its superclass and then customize or extend its behavior.

2. **Rules for Method Overriding**:
   - The method in the subclass must have the same method signature (i.e., the same name, return type, and parameter list) as the method in the superclass.
   - The access level of the overriding method cannot be more restrictive than the access level of the overridden method. It can be the same or less restrictive.
   - The overriding method cannot throw checked exceptions that are broader than the exceptions thrown by the overridden method. However, it can throw narrower or unchecked exceptions.
   - The `@Override` annotation is optional but recommended for clarity. It helps you ensure that you are indeed overriding a method from the superclass.

3. **Use Cases for Method Overriding**:
   - Polymorphism: Method overriding is a key mechanism for achieving polymorphism in Java. It allows you to write code that can work with objects of different subclasses through a common interface.
   - Customization: Subclasses can provide specialized implementations of methods to meet their specific needs.
   - Extension: Subclasses can extend the behavior of their superclass by adding additional functionality to overridden methods.

Here's an example of method overriding in Java:

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // Calls the draw method in Circle
        shape2.draw(); // Calls the draw method in Rectangle
    }
}
```

In this example, `Circle` and `Rectangle` are subclasses of `Shape` and override the `draw()` method to provide their own implementations. Polymorphism is demonstrated when we create objects of the subclasses and call the `draw()` method on them. The appropriate overridden method is invoked based on the actual object type.