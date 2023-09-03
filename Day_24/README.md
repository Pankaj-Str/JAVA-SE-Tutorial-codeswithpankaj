# Nested & Inner Class

You can define classes within other classes. These are known as nested classes or inner classes. Nested classes are used to group related classes together and provide better encapsulation. There are four types of nested classes in Java:

1. **Static Nested Class (Static Inner Class):** A static nested class is a nested class that is associated with the outer class, but it doesn't have access to the instance-specific data or methods of the outer class. It can be instantiated without an instance of the outer class.

2. **Inner Class (Non-Static Nested Class):** An inner class is a non-static nested class that has access to the instance-specific data and methods of the outer class. To instantiate an inner class, you typically need an instance of the outer class.

3. **Local Inner Class:** A local inner class is defined within a method or a block of code. It has limited scope and is not visible outside the method or block where it is defined.

4. **Anonymous Inner Class:** An anonymous inner class is a special type of local inner class that doesn't have a name. It is defined and instantiated in a single expression. Anonymous inner classes are often used for event handling and interfaces.

Here's an example that demonstrates static nested class, inner class, local inner class, and anonymous inner class:

```java
class Outer {
    private int outerField = 10;

    // Static nested class
    static class StaticNested {
        void display() {
            System.out.println("StaticNested class");
        }
    }

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class: " + outerField);
        }
    }

    // Method with a local inner class
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("LocalInner class");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    // Anonymous inner class (implementing Runnable)
    Runnable anonymousInner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous inner class (Runnable)");
        }
    };
}

public class NestedClassExample {
    public static void main(String[] args) {
        // Static nested class
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();

        // Inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Local inner class
        outer.outerMethod();

        // Anonymous inner class (Runnable)
        Runnable runnable = outer.anonymousInner;
        runnable.run();
    }
}
```

In this example:

- We have an `Outer` class that contains examples of all four types of nested classes.

- The `StaticNested` class is a static nested class that can be accessed directly using the outer class name.

- The `Inner` class is an inner class that requires an instance of the outer class to be instantiated.

- The `outerMethod` of the `Outer` class defines a local inner class `LocalInner` and instantiates it within the method.

- An anonymous inner class is defined and instantiated as a `Runnable` object.

When you run this Java program, it will output:

```
StaticNested class
Inner class: 10
LocalInner class
Anonymous inner class (Runnable)
```

This demonstrates the usage of various types of nested classes in Java.