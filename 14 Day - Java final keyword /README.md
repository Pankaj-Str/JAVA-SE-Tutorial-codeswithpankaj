# Java final keyword

The `final` keyword is used to declare a constant, restrict inheritance, and prevent method overriding. It is a modifier that can be applied to classes, methods, variables, and even parameters. Here's a breakdown of how the `final` keyword is used in various contexts:

1. **Final Variables:**
   - When applied to a variable, the `final` keyword indicates that the variable's value cannot be changed (it becomes a constant).
   - A `final` variable must be assigned a value when it is declared or within the constructor of the class where it's defined.
   - It is a common practice to use uppercase letters for the names of `final` variables.

   ```java
   public class Constants {
       final int MAX_VALUE = 100; // Final instance variable (constant)
       static final double PI = 3.14159; // Final static variable (constant)

       public void printConstants() {
           System.out.println("Max Value: " + MAX_VALUE);
           System.out.println("PI: " + PI);
       }
   }
   ```

2. **Final Methods:**
   - When applied to a method, the `final` keyword indicates that the method cannot be overridden by subclasses.
   - It is often used in the context of method implementation to ensure that a specific behavior cannot be changed by subclasses.

   ```java
   public class Parent {
       public final void finalMethod() {
           System.out.println("This method cannot be overridden.");
       }
   }

   public class Child extends Parent {
       // Cannot override finalMethod
   }
   ```

3. **Final Classes:**
   - When applied to a class, the `final` keyword indicates that the class cannot be extended (subclassed).
   - It prevents other classes from inheriting from the final class.

   ```java
   final public class FinalClass {
       // Class content
   }

   // Cannot extend FinalClass
   // public class Subclass extends FinalClass { ... }
   ```

4. **Final Parameters:**
   - When applied to method parameters, the `final` keyword indicates that the parameter's value cannot be modified within the method.

   ```java
   public void process(final int num) {
       // num = 42; // Error: Cannot assign a value to final variable 'num'
       System.out.println("Received parameter: " + num);
   }
   ```

The `final` keyword helps improve code readability, maintainability, and security by ensuring that certain elements of your code remain constant and unmodified. It's commonly used for constants, ensuring method behavior, and preventing class inheritance when needed.