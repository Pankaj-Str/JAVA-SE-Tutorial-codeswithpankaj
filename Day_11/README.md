# Methods

Methods  are blocks of code that perform specific tasks or computations. They are used to organize and encapsulate functionality within a class. Methods can have input parameters (arguments) and can also return a value.

Here's a breakdown of the components of a Java method:

1. Method Signature: The method signature consists of the method's name and parameter list. It defines the method's unique identifier within the class. For example: `public static int sum(int num1, int num2)`. The method name is `sum`, and it takes two `int` parameters, `num1` and `num2`.

2. Method Return Type: The return type specifies the type of value that the method returns, or `void` if the method does not return anything. In the example above, the return type is `int`, indicating that the method returns an integer value.

3. Method Parameters: Parameters are variables declared within the parentheses of the method signature. They allow you to pass values into the method. In the `sum` method example, `num1` and `num2` are the parameters of type `int`.

4. Method Body: The method body is enclosed within curly braces `{}`. It contains the actual code that is executed when the method is called. This code can perform calculations, manipulate data, or perform any other desired operations.

5. Return Statement: If a method has a return type other than `void`, it must include a `return` statement that specifies the value to be returned. The `return` statement exits the method and sends the value back to the caller. In the `sum` method example, the `return` statement `return num1 + num2;` calculates the sum of `num1` and `num2` and returns the result.

Here's an example of a simple method that calculates the factorial of a number:

```java
public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

In this method, if the input `n` is 0 or 1, the method immediately returns 1. Otherwise, it recursively calls itself with `n - 1` as the argument and multiplies the result by `n`. This continues until the base case is reached (when `n` is 0 or 1), and the result is returned.

Methods allow you to modularize your code, improve readability, and reuse functionality. By breaking down complex tasks into smaller, manageable methods, you can create more maintainable and organized code.

## methods can be categorized into different types based on their characteristics and behavior. Here are some common types of methods in Java:

1. Instance Methods: Instance methods are associated with an instance of a class and can access instance variables and other instance methods. They are called on an object of the class using the dot (`.`) operator. Instance methods are typically used to perform operations specific to an instance of the class.

```java
public class MyClass {
    public void instanceMethod() {
        // Method body
    }
}

// Calling an instance method
MyClass obj = new MyClass();
obj.instanceMethod();
```

2. Static Methods: Static methods belong to the class itself rather than an instance of the class. They can be accessed directly through the class name without creating an object. Static methods cannot access instance variables or instance methods directly, but they can access other static variables or methods.

```java
public class MathUtils {
    public static int sum(int a, int b) {
        return a + b;
    }
}

// Calling a static method
int result = MathUtils.sum(3, 5);
```

3. Constructor Methods: Constructors are special methods used to initialize objects of a class. They have the same name as the class and do not have a return type (not even `void`). Constructors are called when an object is created using the `new` keyword and can be used to set initial values for the object's instance variables.

```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

// Creating an object and calling the constructor
Person person = new Person("John");
```

4. Getter and Setter Methods: Getter methods (also known as accessor methods) and setter methods (also known as mutator methods) are used to retrieve and modify the values of instance variables, respectively. They provide encapsulated access to the object's properties and follow the naming convention of `getVariableName()` and `setVariableName()`.

```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Using getter and setter methods
Person person = new Person();
person.setName("John");
String name = person.getName();
```

These are some common types of methods in Java. Each type serves a different purpose and provides specific functionality to help organize and manipulate data within a class.