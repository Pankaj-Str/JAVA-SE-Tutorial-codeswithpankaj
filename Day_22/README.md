# Java Polymorphism

Polymorphism is one of the four fundamental principles of object-oriented programming (OOP), along with encapsulation, inheritance, and abstraction. In Java, polymorphism is a concept that allows objects of different classes to be treated as objects of a common superclass. It enables you to write code that can work with objects of various types through a common interface or base class, making your code more flexible and reusable.

There are two main types of polymorphism in Java:

1. **Compile-Time Polymorphism (Static Binding):**
   - Also known as method overloading.
   - Occurs when two or more methods in the same class have the same name but different parameters (different method signatures).
   - The appropriate method to execute is determined at compile time based on the method signature.

   ```java
   class MathOperations {
       int add(int a, int b) {
           return a + b;
       }

       double add(double a, double b) {
           return a + b;
       }
   }
   ```

2. **Run-Time Polymorphism (Dynamic Binding):**
   - Also known as method overriding.
   - Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
   - The method to execute is determined at runtime based on the actual object type.
   - Achieved through inheritance and interface implementation.

   ```java
   class Animal {
       void makeSound() {
           System.out.println("Animal makes a sound.");
       }
   }

   class Dog extends Animal {
       @Override
       void makeSound() {
           System.out.println("Dog barks.");
       }
   }
   ```

Here's an example illustrating run-time polymorphism (method overriding):

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Polymorphic reference

        myAnimal.makeSound(); // Calls the 'makeSound' method of Dog at runtime
    }
}
```

In this example:

- We have a superclass `Animal` with a method `makeSound()`.
- The `Dog` class is a subclass of `Animal` and overrides the `makeSound()` method with its own implementation.
- In the `main` method, we create an instance of `Dog` and assign it to a reference of type `Animal`. This is an example of polymorphism.
- When we call `myAnimal.makeSound()`, it calls the `makeSound()` method of the `Dog` class at runtime, demonstrating dynamic binding.

Polymorphism is a powerful concept that allows you to write flexible and extensible code by working with objects based on their common interfaces or base classes, rather than their specific types.