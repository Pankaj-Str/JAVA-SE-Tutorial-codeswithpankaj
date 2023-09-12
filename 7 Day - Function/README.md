# Methods

Example of how to define and use a simple method in Java:

```java
public class Example {

    // Define a method named "addNumbers" that takes two integers as parameters
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Return the result of adding num1 and num2
    }

    public static void main(String[] args) {
        // Call the "addNumbers" method and store the result in a variable
        int result = addNumbers(5, 7);

        // Print the result
        System.out.println("The sum of 5 and 7 is: " + result);
    }
}
```

In this example:

1. We define a class called "Example."
2. Inside the class, we define a method named "addNumbers" that takes two integer parameters, "num1" and "num2."
3. Within the method, we calculate the sum of "num1" and "num2" and store it in the "sum" variable.
4. We use the "return" statement to send the result back to the caller.
5. In the "main" method, we call the "addNumbers" method with the arguments 5 and 7 and store the result in the "result" variable.
6. Finally, we print the result to the console.

When you run this Java program, it will output:

```
The sum of 5 and 7 is: 12
```
# Type of Methods
```yaml
- Non Return type and Non Arguments 
- Non Return type and With Arguments 
- With Return type and Non Arguments 
- With Return type and With Arguments 
```

Here are examples of Java methods for each of the specified cases:

1. Non-Return Type and Non-Arguments:

```java
public class Example {
    public static void main(String[] args) {
        // Calling a method with no return type and no arguments
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello, World!");
    }
}
```

2. Non-Return Type and With Arguments:

```java
public class Example {
    public static void main(String[] args) {
        // Calling a method with no return type and with arguments
        printMessage("Java is fun!");
    }

    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}
```

3. With Return Type and Non-Arguments:

```java
public class Example {
    public static void main(String[] args) {
        // Calling a method with a return type and no arguments
        int result = generateRandomNumber();
        System.out.println("Random Number: " + result);
    }

    public static int generateRandomNumber() {
        // Generate and return a random number between 1 and 100
        return (int) (Math.random() * 100) + 1;
    }
}
```

4. With Return Type and With Arguments:

```java
public class Example {
    public static void main(String[] args) {
        // Calling a method with a return type and with arguments
        int sum = addNumbers(5, 7);
        System.out.println("Sum: " + sum);
    }

    public static int addNumbers(int num1, int num2) {
        // Calculate the sum of two numbers and return the result
        return num1 + num2;
    }
}
```
## Question

```
-- User input section
Enter Product 1 -
Do you want to add - More [Y/N]
Y
Samosa
Enter Product 2 -
Do you want to add - More [Y/N]
Y
Kachori
Enter Product 3 -
Do you want to add - More [Y/N]
Y
Fafda
Enter Product 4 -
Do you want to add - More [Y/N]
Y
Jalebi
Do you want to add - More [Y/N]
N
Enter Samosa Price :
300/-
Enter Kachori Price :
100/-
Enter Fafda Price :
100/-
Enter Jalebi Price :
200/-

Do You Want to add GST [Y/N]
[note : if user select `N` Print bill without GST]
[Note User select yes `Y`]
Enter GST % = 18
-------Out put -------

1. Samosa = 300/-
2. Kachori = 100/-
3. Fafda = 100/-
4. Jalebi = 200/-
-------------------
Total = 700
GST = 18%
-------------------
Final Total = 826/-
-------------------

```



