# `break` statement

the `break` statement is used to terminate the execution of a loop or a switch statement. It allows you to prematurely exit a loop or switch block before the normal completion of its iterations or cases. Here's how the `break` statement is used:

1. In a Loop:
   When a `break` statement is encountered inside a loop, the loop is immediately terminated, and the program execution continues with the statement following the loop.

   ```java
   for (int i = 1; i <= 10; i++) {
       if (i == 5) {
           break;
       }
       System.out.println(i);
   }
   ```

   In this example, the `for` loop counts from 1 to 10. However, when `i` becomes 5, the `break` statement is encountered, and the loop is terminated. As a result, only the numbers 1, 2, 3, and 4 will be printed.

2. In a Switch Statement:
   The `break` statement is also used in a `switch` statement to terminate the execution of a case block. After executing the code in a particular case, the `break` statement is used to exit the switch block.

   ```java
   int day = 3;

   switch (day) {
       case 1:
           System.out.println("Monday");
           break;
       case 2:
           System.out.println("Tuesday");
           break;
       case 3:
           System.out.println("Wednesday");
           break;
       default:
           System.out.println("Invalid day");
           break;
   }
   ```

   In this example, when `day` has a value of 3, the code inside the `case 3:` block is executed, which prints "Wednesday" to the console. The `break` statement is used to exit the switch block after executing the corresponding code. Without the `break` statement, execution would continue into the next case, resulting in unwanted behavior.

The `break` statement is useful when you need to terminate the execution of a loop or switch statement prematurely. It allows you to control the flow of your program and exit the loop or switch based on specific conditions.

-----------------------
# `continue` statement

the `continue` statement is used to skip the remaining code within a loop iteration and proceed to the next iteration. It allows you to control the flow of a loop and selectively skip certain iterations based on a condition. Here's how the `continue` statement is used:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

In this example, the `for` loop counts from 1 to 5. However, when `i` becomes 3, the `continue` statement is encountered. This statement causes the current iteration to stop immediately, and the program proceeds to the next iteration without executing the remaining code within the loop. As a result, the number 3 is skipped, and the output will be:

```
1
2
4
5
```

The `continue` statement is often used when you want to skip certain iterations based on specific conditions. It allows you to control the execution of the loop without terminating it completely, unlike the `break` statement.

It's important to note that when the `continue` statement is encountered, the loop's control flow immediately jumps to the next iteration, skipping any code that follows the `continue` statement within that iteration.

The `continue` statement can be used with any loop, such as `for`, `while`, and `do-while`, to control the flow and selectively skip iterations based on your requirements.


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



