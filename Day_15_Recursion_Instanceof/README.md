# 1 Recursion 
# 2 instanceof Operator
-------------
# 1 Recursion 

Recursion in Java refers to a programming technique where a method calls itself to solve a problem. It is a powerful concept that allows you to solve complex problems by breaking them down into smaller, more manageable subproblems.

Here's an example of a recursive method in Java that calculates the factorial of a number:

```java
public class Factorial {
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: factorial of n is n multiplied by factorial of (n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
```

In this example, the `factorial` method calculates the factorial of a given number `n`. It uses recursion by calling itself with a smaller input `(n - 1)` until it reaches the base case `(n == 0)`. The base case specifies the termination condition for the recursion and ensures that the method eventually stops calling itself.

The recursive case multiplies the current number `n` with the factorial of `(n - 1)`. As the recursive calls unfold, the method builds up the factorial by multiplying the current number with the factorial of the previous number until it reaches the base case.

When you run the above code, it will output:

```
Factorial of 5 is: 120
```


# 2 instanceof Operator

the `instanceof` operator is used to check whether an object is an instance of a particular class or implements a particular interface. It allows you to determine the type of an object at runtime.

The `instanceof` operator has the following syntax:

```java
object instanceof type
```

Here, `object` is the object you want to check, and `type` is the class or interface you want to compare it with.

The `instanceof` operator returns a boolean value: `true` if the object is an instance of the specified type, and `false` otherwise.

Here's an example to illustrate its usage:

```java
class Vehicle {
    // Vehicle class implementation
}

class Car extends Vehicle {
    // Car class implementation
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        // Check if the object is an instance of the Vehicle class
        boolean isVehicle = vehicle instanceof Vehicle;
        System.out.println("Is Vehicle? " + isVehicle);  // Output: Is Vehicle? true

        // Check if the object is an instance of the Car class
        boolean isCar = vehicle instanceof Car;
        System.out.println("Is Car? " + isCar);  // Output: Is Car? true

        // Check if the object is an instance of the Object class
        boolean isObject = vehicle instanceof Object;
        System.out.println("Is Object? " + isObject);  // Output: Is Object? true
    }
}
```

In this example, we have a `Vehicle` class and a `Car` class that extends `Vehicle`. In the `main` method, we create an object `vehicle` of type `Car`. We then use the `instanceof` operator to check if `vehicle` is an instance of `Vehicle`, `Car`, and `Object` classes. The respective boolean values are printed to the console.

Note that the `instanceof` operator also considers the inheritance hierarchy. In the example, since `Car` extends `Vehicle`, the `vehicle` object is considered an instance of both `Vehicle` and `Car` classes. Similarly, since all classes implicitly inherit from `Object`, the object is also considered an instance of `Object`.