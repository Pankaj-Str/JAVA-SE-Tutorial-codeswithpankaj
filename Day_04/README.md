# The `switch` statement

The `switch` statement in Java is used for multi-way branching, allowing you to execute different blocks of code based on the value of an expression. It provides a more concise and readable alternative to multiple nested `if-else` statements. Here's the general syntax of a `switch` statement:

```java
switch (expression) {
    case value1:
        // Code to execute if expression matches value1
        break;
    case value2:
        // Code to execute if expression matches value2
        break;
    case value3:
        // Code to execute if expression matches value3
        break;
    // ...
    default:
        // Code to execute if expression doesn't match any case
        break;
}
```

Here's how the `switch` statement works:

1. The `expression` is evaluated, and its value is compared against the values specified in each `case`.

2. If the value of the `expression` matches a `case` value, the corresponding block of code is executed. Execution continues until a `break` statement is encountered, which exits the `switch` block.

3. If no `case` values match the `expression`, the code inside the `default` block is executed. The `default` block is optional and acts as a catch-all case for unmatched values.

4. The `break` statement is used to terminate the execution of a `case` block. Without it, execution would continue into the next `case` block. However, if you want multiple cases to execute the same block of code, you can omit the `break` statement.

Here's an example to illustrate the usage of the `switch` statement:

```java
int dayOfWeek = 2;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    default:
        dayName = "Weekend";
        break;
}

System.out.println("Today is " + dayName);
```

In this example, the `switch` statement matches the value of `dayOfWeek` against different cases. Since `dayOfWeek` has a value of `2`, the code inside the `case 2:` block is executed, assigning the string "Tuesday" to the `dayName` variable. Finally, the result is printed to the console.

It's important to note that the `switch` statement can be used with `int`, `char`, `byte`, `short`, `String`, and `enum` types. Additionally, starting from Java 14, the `switch` statement supports enhanced `switch` expressions with a simplified syntax that allows returning a value directly.

Remember to include the `break` statement to exit the `switch` block after executing the desired code to avoid falling through to the next case unintentionally.






# Assignment Day 4

1. Write a  Program to Make a Simple Calculator Using switch...case

```java
Enter Number 1 : 23
Enter Number 2 : 2

Select Operator + , - , x , / , %
 +

--- Your Result is + : 25       

```
-------
2. Password Checker 

Example : <br><br>
```java
    Set your password :
    p4n@in
    Enter your Password : 
    p4n
    wrong password ... try 2 more time out of 2
    p4n@
    wrong password ... try 1 more time 1
    p4n@34
    wrong password ... try 0 more time 0
    note : user select right password
    then start MCQ EXAM...

    
    1. Who invented Java Programming?
    1. ) Guido van Rossum
    2. ) James Gosling
    3. ) Dennis Ritchie
    4. ) Bjarne Stroustrup

    Select Answer 2

    wrong answer [ Try Next year ] 

    Note :if select Right Answer 
    ask 2nd Question ...

    2. Which component is used to compile, debug and execute the java programs?
    1. ) JRE
    2. ) JIT
    3. ) JDK
    4. ) JVM

    Select Answer 2 ... con..

```

3. Salary System -
   
```java
   -- input section

   Enter Employee Name = Joy
   Enter Employee ID = A001
   Enter Employee Salary (Monthly) = 10000/-
   Enter Leave (Days) = 7
   TDS % = 2
   Month = 3
   year = 2023  

   -- out section
   Name : Joy
   EMP ID : A001
   Monthly Salary : 10,000/-
   CTC (Yearly Salary ) : 120,000/-
   Leave Amount : 2,258.06452/-
   TDS Amount :  200/-
   Final Pay Salary : 7,541.93548/-
   Date = March/2023

```

