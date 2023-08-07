
# if-else

the `if-else` statement is used for conditional execution. It allows you to execute different blocks of code based on a condition. Here's an example of how to use `if-else` in Java:

![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/93d4005b-d143-44a5-a4b9-336414562cb2)

```java
int x = 10;

if (x > 0) {
    System.out.println("x is positive");
} else {
    System.out.println("x is non-positive");
}
```

In this example, we have a variable `x` with a value of 10. The `if` statement checks if `x` is greater than 0. If the condition is true, the block of code inside the `if` statement will be executed, which prints "x is positive" to the console. If the condition is false, the block of code inside the `else` statement will be executed, which prints "x is non-positive" to the console.

The `if-else` statement can also be nested to handle multiple conditions. Here's an example:

```java
int x = 10;
int y = 5;

if (x > y) {
    System.out.println("x is greater than y");
} else if (x < y) {
    System.out.println("x is less than y");
} else {
    System.out.println("x is equal to y");
}
```

In this example, we compare the values of `x` and `y`. If `x` is greater than `y`, the first `if` block is executed. If `x` is less than `y`, the `else if` block is executed. If neither condition is true, the `else` block is executed.

The `if-else` statement can be extended with additional `else if` blocks to handle more conditions. It's important to note that only the first matching condition will be executed, and subsequent conditions will be skipped.

You can also use comparison operators like `==`, `!=`, `<`, `>`, `<=`, and `>=` to create more complex conditions in your `if-else` statements. Additionally, you can use logical operators like `&&` (and), `||` (or), and `!` (not) to combine multiple conditions.



###  Assignment Day 3
1. Write a  Program to Check Whether a Number is Even or Odd (user input)

```
    output : 
    Enter Number : 22
    Your Number is : Even

```
2. Write a  Program to Check Whether an Alphabet is Vowel or Consonant(user input)

```
    output : 
    Enter Alphabet : a
    A is Vowel

```
3. Write a  Program to Find the Largest Among Three Numbers(user input)

```
    Output :
    Enter Number 1 : 90
    Enter Number 2 : 91
    Enter Number 3 : 92

    Largest Number : 92

```
4. Write a  Program to Check Leap Year(user input)

```
    Enter year to check leap year ya not : 2023

    YEAR 2023 is not Leap YEAR

```
5. Write a  Program to Check Whether a Number is Positive or Negative(user input)

6. Write a  Program to Check Whether a Character is Alphabet or Not(user input)
