# Java Loop

In Java, loops are used to repeatedly execute a block of code until a certain condition is met. They provide a way to perform repetitive tasks efficiently and with less code. Java provides three types of loops: `for`, `while`, and `do-while`. Let's explain each of them:

1. `for` Loop:
   The `for` loop is used when the number of iterations is known beforehand or when iterating over a collection/array. It consists of three parts: initialization, condition, and iteration expression.

   ```java
   for (initialization; condition; iteration) {
       // Code to be executed in each iteration
   }
   ```

   The `initialization` statement is executed only once at the beginning. The `condition` is checked before each iteration, and if it evaluates to `true`, the code block is executed. After each iteration, the `iteration` statement is executed, and then the condition is checked again. The loop continues until the condition evaluates to `false`.

   ![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/c92fad6e-d7a1-40c0-81c4-4d2db70cc3f6)



3. `while` Loop:
   The `while` loop is used when the number of iterations is not known beforehand and depends on a condition. It repeatedly executes the code block as long as the condition is `true`.

   ```java
   while (condition) {
       // Code to be executed in each iteration
   }
   ```

   The `condition` is evaluated before each iteration. If it evaluates to `true`, the code block is executed. If it evaluates to `false` initially, the code block is never executed.

   ![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/bcb4f2fd-4541-43eb-a5ae-a7f339dcb2d2)



5. `do-while` Loop:
   The `do-while` loop is similar to the `while` loop, but the condition is checked at the end of the loop, ensuring that the code block is executed at least once.

   ```java
   do {
       // Code to be executed in each iteration
   } while (condition);
   ```

   The code block is executed first, and then the `condition` is checked. If the condition evaluates to `true`, the loop continues for subsequent iterations. If the condition evaluates to `false`, the loop terminates.

   ![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/aa1c5dff-5d3a-461f-9543-f77e56b82115)



Loop control statements like `break` and `continue` can be used to control the flow of execution within loops. `break` is used to exit the loop completely, while `continue` skips the rest of the current iteration and proceeds to the next iteration.

Here's an example that demonstrates the use of different loops:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Value of i: " + i);
}

int j = 1;
while (j <= 5) {
    System.out.println("Value of j: " + j);
    j++;
}

int k = 1;
do {
    System.out.println("Value of k: " + k);
    k++;
} while (k <= 5);
```

In this example, each loop prints the values of a variable (`i`, `j`, and `k`) from 1 to 5. The output will display:

```
Value of i: 1
Value of i: 2
Value of i: 3
Value of i: 4
Value of i: 5

Value of j: 1
Value of j: 2
Value of j: 3
Value of j: 4
Value of j: 5

Value of k: 1
Value of k: 2
Value of k: 3
Value of k: 4
Value of k: 5
```

Loops provide a powerful mechanism for automating repetitive tasks and iterating over collections, making them an essential part of programming in Java.


# Assignment Day 5
  1. Java Program to Display Alphabets (A to Z) using loop
  ```
    A,B,C.....

  ```
  2. Java Program to Count Number of Digits in an Integer
  ```
    Enter Number : 9876
    your digits count : 4

  ```
  3. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
  ```
    Enter Number : 9876
    your Recerse Number : 6789

  ```
  4. Program to print half pyramid using alphabets<br>
  ```
      A
      B B
      C C C
      D D D D
      E E E E E
      
   ```
   5. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.(noote : also find sum of the total number : )

   ```
    Enter Start Loop Number : 1
    Emter End Loop Number : 10

    Sum of the total Number = 55
    Sum of the Even Number = 30
    Sum of the Odd Number = 25
   ```

   8. Write a program to print table : 

   ```
    Enter Print Table : 2
    2 x 1 = 2
    2 x 2 = 4
    .
    .
    2 x 10 = 20

   ```

   9. Write a program to print following :<br>
       ![loopQuestion](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/84109b67-24b6-4d43-b27b-2b9adb1770fa)
   
