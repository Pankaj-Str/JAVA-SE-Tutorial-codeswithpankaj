# Java Static Class

static class is not a class with the `static` keyword in its declaration. Instead, it's a class that contains only static members, such as static fields and static methods. In other words, a static class is a class that cannot be instantiated, and its members are accessed directly through the class itself, without the need for an instance of the class.

Here's how you can create a static class in Java:

```java
public class StaticClassExample {
    // Static fields
    public static int staticField1 = 10;
    public static String staticField2 = "Hello, World!";

    // Static methods
    public static void staticMethod1() {
        System.out.println("Static method 1");
    }

    public static void staticMethod2() {
        System.out.println("Static method 2");
    }
}
```

In this example:

- `StaticClassExample` is a class that contains only static members. It cannot be instantiated, and you don't need to create an instance of it to access its static members.

- `staticField1` and `staticField2` are static fields (class variables) that can be accessed using the class name, e.g., `StaticClassExample.staticField1`.

- `staticMethod1` and `staticMethod2` are static methods that can be called using the class name, e.g., `StaticClassExample.staticMethod1()`.

Here's how you can use the static members of the static class:

```java
public class StaticClassUsage {
    public static void main(String[] args) {
        System.out.println("Static field 1: " + StaticClassExample.staticField1);
        System.out.println("Static field 2: " + StaticClassExample.staticField2);

        StaticClassExample.staticMethod1();
        StaticClassExample.staticMethod2();
    }
}
```

When you run the `StaticClassUsage` class, it will output:

```
Static field 1: 10
Static field 2: Hello, World!
Static method 1
Static method 2
```

Static classes are often used for utility classes that provide common functionality or constants that are used throughout an application. They are convenient because you don't need to create instances of the class to access their members.