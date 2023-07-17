# Java Inheritance

Java inheritance is a fundamental concept in object-oriented programming that allows classes to inherit properties and behaviors from other classes. Inheritance enables code reuse and promotes the creation of hierarchical relationships between classes.

In Java, inheritance is implemented using the `extends` keyword. The class that is being inherited from is called the superclass or parent class, and the class that inherits from the superclass is called the subclass or child class.

Here's an example to illustrate the basic syntax of Java inheritance:

```java
class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Max");
        dog.eat();  // Inherited method from the Animal class
        dog.bark(); // Method specific to the Dog class
    }
}
```

In this example, the `Animal` class serves as the superclass, and the `Dog` class is the subclass. The `Dog` class extends the `Animal` class using the `extends` keyword. This means that the `Dog` class inherits all the members (fields and methods) of the `Animal` class.

The `Dog` class adds a new method `bark()`, which is specific to dogs. It can also access the `name` field and the `eat()` method from the `Animal` class because they are inherited.

Inheritance supports the concept of polymorphism, which means that a subclass can be treated as an instance of its superclass. In the example above, a `Dog` object can be assigned to an `Animal` reference:

```java
Animal animal = new Dog();
```

This allows for flexibility and abstraction in programming, as you can work with a general type (e.g., `Animal`) while still having access to the specific behavior of the subclass (e.g., `Dog`).

Java supports single inheritance, which means a class can only inherit from one superclass. However, multiple levels of inheritance can be created by extending subclasses further. Additionally, Java provides the `super` keyword to access members of the immediate superclass.

It's important to note that not all members of a superclass are accessible in the subclass. The accessibility depends on the access modifiers used in the superclass. The `private` members are not accessible, while `public` and `protected` members can be accessed directly in the subclass.

Overall, Java inheritance is a powerful mechanism for code reuse and building hierarchical relationships between classes, allowing for flexibility and extensibility in object-oriented programming.

-----------------------------

##  there are several types of inheritance that can be used to establish relationships between classes. The main types of inheritance in Java are:

1. Single inheritance: Java supports single inheritance, which means that a class can inherit from only one superclass. This establishes a "is-a" relationship between the classes, where the subclass is a specialized version of the superclass.

2. Multilevel inheritance: In multilevel inheritance, a class extends another class, which in turn extends another class, and so on. This creates a chain of inheritance where each subclass inherits properties and behaviors from its immediate superclass. It allows for creating a hierarchy of classes.

3. Hierarchical inheritance: Hierarchical inheritance occurs when multiple classes inherit from a single superclass. In this type of inheritance, one superclass is extended by multiple subclasses, each of which can have its own additional properties and behaviors.

4. Multiple inheritance (through interfaces): While Java doesn't support multiple inheritance of classes, it does support multiple inheritance of interfaces. An interface in Java can be implemented by multiple classes, allowing them to inherit multiple sets of methods declarations. This is known as multiple inheritance through interfaces.

5. Hybrid inheritance: Hybrid inheritance is a combination of multiple inheritance and hierarchical inheritance. It involves a mix of single and multiple inheritance, where classes inherit from multiple classes, and those classes can further be inherited by other subclasses.

-----------------------------

# 1 Single inheritance :

Single inheritance in Java refers to the ability of a class to inherit properties and behaviors from only one superclass. In other words, a class can extend or inherit from a single class.

When a class inherits from a superclass, it gains access to all the non-private members (methods and fields) of the superclass. The subclass can then add its own unique methods and fields or override the inherited ones to modify their behavior.

Here's an example to illustrate single inheritance in Java:

```java
class Vehicle {
    protected String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving the vehicle.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openDoors() {
        System.out.println("Opening the car doors.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota"); // Inherited method from Vehicle class
        car.setNumberOfDoors(4); // Method specific to Car class
        car.drive(); // Inherited method from Vehicle class
        car.openDoors(); // Method specific to Car class
    }
}
```

In this example, the `Vehicle` class is the superclass, and the `Car` class is the subclass. The `Car` class extends the `Vehicle` class using the `extends` keyword, indicating that `Car` inherits from `Vehicle`.

The `Car` class adds its own field `numberOfDoors` and methods `setNumberOfDoors()` and `openDoors()`. It can also access the `brand` field and the `drive()` method from the `Vehicle` class because they are inherited.

By using single inheritance, the `Car` class is able to inherit the common properties and behaviors defined in the `Vehicle` class while adding its own specialized features.

It's important to note that Java's single inheritance ensures a simpler class hierarchy and avoids the complications that can arise from multiple inheritance. However, it also means that a class can inherit from only one superclass, limiting the direct reuse of code from multiple sources.


---------------------
# 2 Multilevel inheritance : 

Multilevel inheritance in Java refers to a scenario where a class extends another class, and that subclass is further extended by another class. This creates a chain or hierarchy of inheritance, with each subclass inheriting properties and behaviors from its immediate superclass.

Here's an example to demonstrate multilevel inheritance in Java:

```java
class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

class GermanShepherd extends Dog {
    public void guard() {
        System.out.println("The German Shepherd is guarding.");
    }
}

public class Main {
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd();
        dog.setName("Max");
        dog.eat();  // Inherited method from Animal class
        dog.bark(); // Inherited method from Dog class
        dog.guard(); // Method specific to GermanShepherd class
    }
}
```

In this example, the `Animal` class is the superclass, the `Dog` class is the immediate subclass, and the `GermanShepherd` class is the final subclass in the chain.

The `Dog` class extends the `Animal` class, inheriting its `name` field and `eat()` method. It adds its own method, `bark()`, which is specific to dogs.

The `GermanShepherd` class further extends the `Dog` class, inheriting the `name` field, `eat()` method, and `bark()` method. It adds its own method, `guard()`, which is specific to German Shepherds.

By using multilevel inheritance, the `GermanShepherd` class inherits properties and behaviors from both its immediate superclass (`Dog`) and the superclass of the superclass (`Animal`). This allows for code reuse and the creation of a hierarchical relationship between classes.

It's important to note that multilevel inheritance should be used judiciously, as an excessively deep inheritance chain can lead to complex class relationships and potential code maintenance challenges.


------------------------------

# 3 Hierarchical inheritance :

Hierarchical inheritance in Java refers to a situation where multiple classes inherit from a single superclass. In this type of inheritance, one superclass serves as the base class for multiple subclasses, each of which can have its own additional properties and behaviors.

Here's an example to illustrate hierarchical inheritance in Java:

```java
class Shape {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing the shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Red"); // Inherited method from Shape class
        circle.setRadius(5.0); // Method specific to Circle class
        circle.draw(); // Inherited method from Shape class
        double circleArea = circle.calculateArea(); // Method specific to Circle class
        System.out.println("Circle area: " + circleArea);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue"); // Inherited method from Shape class
        rectangle.setDimensions(4.0, 6.0); // Method specific to Rectangle class
        rectangle.draw(); // Inherited method from Shape class
        double rectangleArea = rectangle.calculateArea(); // Method specific to Rectangle class
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
```

In this example, the `Shape` class serves as the superclass, and both the `Circle` and `Rectangle` classes are subclasses inheriting from `Shape`.

The `Shape` class has a `color` field and methods `setColor()` and `draw()`. The `Circle` class extends `Shape` and adds its own `radius` field, along with methods `setRadius()` and `calculateArea()` specific to circles.

Similarly, the `Rectangle` class extends `Shape` and adds its own `length` and `width` fields, along with methods `setDimensions()` and `calculateArea()` specific to rectangles.

By using hierarchical inheritance, both the `Circle` and `Rectangle` classes inherit common properties and behaviors defined in the `Shape` class, while also having their own specialized features.

Hierarchical inheritance allows for code reuse and promotes the creation of a hierarchy of related classes. It enables the organization of classes into a logical structure, where common characteristics and behaviors are defined in the superclass, and specific variations are introduced in the subclasses.

# 4 Multiple inheritance (through interfaces) : 

multiple inheritance of classes is not directly supported, meaning a class cannot inherit from multiple classes. However, Java does support multiple inheritance through interfaces, which allows a class to implement multiple interfaces.

An interface in Java is a collection of abstract methods (methods without an implementation) and constants. It defines a contract that a class must adhere to if it implements that interface. By implementing multiple interfaces, a class can inherit the method declarations from all those interfaces.

Here's an example to illustrate multiple inheritance through interfaces in Java:

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Inherited method from Flyable interface

        Fish fish = new Fish();
        fish.swim(); // Inherited method from Swimmable interface

        Duck duck = new Duck();
        duck.fly(); // Inherited method from Flyable interface
        duck.swim(); // Inherited method from Swimmable interface
    }
}
```

In this example, there are two interfaces: `Flyable` and `Swimmable`. The `Bird` class implements the `Flyable` interface, and the `Fish` class implements the `Swimmable` interface. Each class provides an implementation for the methods declared in their respective interfaces.

The `Duck` class demonstrates multiple inheritance by implementing both the `Flyable` and `Swimmable` interfaces. This allows the `Duck` class to inherit the method declarations from both interfaces.

Through multiple inheritance with interfaces, the `Duck` class gains the ability to both fly and swim. It inherits the `fly()` method from the `Flyable` interface and the `swim()` method from the `Swimmable` interface.

Using interfaces for multiple inheritance allows for achieving code reuse and defining common behavior across unrelated classes. It promotes flexibility and extensibility in Java's object-oriented programming paradigm.


# 5 Hybrid inheritance:


Hybrid inheritance is a combination of multiple inheritance and hierarchical inheritance. It involves a mix of single and multiple inheritance, where classes inherit from multiple classes, and those classes can further be inherited by other subclasses.

While Java doesn't directly support hybrid inheritance, you can achieve a similar effect by utilizing a combination of interfaces and class inheritance.

Here's an example that demonstrates a form of hybrid inheritance in Java:

```java
interface Swimmable {
    void swim();
}

class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dolphin extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("The dolphin is swimming.");
    }
}

class FlyingBird {
    public void fly() {
        System.out.println("The bird is flying.");
    }
}

class Sparrow extends FlyingBird {
    public void chirp() {
        System.out.println("The sparrow is chirping.");
    }
}

class FlyingDolphin extends Dolphin {
    public void fly() {
        System.out.println("The flying dolphin is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.setName("Flipper");
        dolphin.eat();  // Inherited method from Animal class
        dolphin.swim(); // Inherited method from Swimmable interface

        Sparrow sparrow = new Sparrow();
        sparrow.fly();  // Inherited method from FlyingBird class
        sparrow.chirp(); // Method specific to Sparrow class

        FlyingDolphin flyingDolphin = new FlyingDolphin();
        flyingDolphin.fly();  // Inherited method from Dolphin class
    }
}
```

In this example, there are several classes and interfaces involved:

- The `Animal` class serves as the superclass and provides common properties and behaviors for animals.
- The `Swimmable` interface declares the `swim()` method, which is implemented by the `Dolphin` class.
- The `Dolphin` class extends the `Animal` class and implements the `Swimmable` interface, inheriting properties and behaviors from both the superclass and interface.
- The `FlyingBird` class provides a `fly()` method for birds that can fly, which is inherited by the `Sparrow` class.
- The `Sparrow` class extends the `FlyingBird` class and adds its own behavior with the `chirp()` method.
- The `FlyingDolphin` class extends the `Dolphin` class, effectively combining features of a dolphin and a flying animal.

While not a strict implementation of hybrid inheritance, this example demonstrates the idea of combining multiple inheritance and hierarchical inheritance by using a combination of class inheritance and interface implementation.

It's important to carefully design and consider the class hierarchy when dealing with hybrid inheritance-like scenarios to avoid complications and potential issues.
