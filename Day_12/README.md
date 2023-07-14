# Java Constructor

A Constructor is a special method that is used to create and initialize objects of a class. It is called automatically when an object is created using the `new` keyword. Constructors have the same name as the class and do not have a return type (not even `void`).

Here's an example of a constructor in Java:

```java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

In this example, we have a `Person` class with two instance variables: `name` and `age`. The constructor takes two parameters, `name` and `age`, and initializes the corresponding instance variables with the provided values using the `this` keyword.

To create an object of the `Person` class and initialize its properties using the constructor, you would do the following:

```java
Person person = new Person("John", 30);
```

The above code creates a `Person` object named `person` and passes the values `"John"` and `30` to the constructor. The constructor initializes the `name` and `age` instance variables of the `person` object with these values.

Constructors can also be overloaded, which means you can have multiple constructors with different parameter lists. This allows you to create objects in different ways or with different sets of initial values.

Here's an example of a class with overloaded constructors:

```java
public class Rectangle {
    private int width;
    private int height;

    // Default constructor
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
```

In this example, the `Rectangle` class has two constructors. The default constructor sets the `width` and `height` to `0`, while the parameterized constructor allows you to specify custom values for `width` and `height` when creating an object.

```java
Rectangle defaultRectangle = new Rectangle();
Rectangle customRectangle = new Rectangle(10, 20);
```

The first line creates a `Rectangle` object using the default constructor, and the second line creates a `Rectangle` object with a width of `10` and a height of `20` using the parameterized constructor.

Constructors are used to ensure that objects are properly initialized when they are created and provide a way to set initial values for their instance variables.