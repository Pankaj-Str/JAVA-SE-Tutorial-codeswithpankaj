# Logical Operators

logical operators are used to perform logical operations on boolean expressions or values. They allow you to combine or modify boolean values and evaluate logical conditions. Here are the logical operators available in Java:

1. Logical AND Operator (&&):
   The logical AND operator is represented by "&&" and returns true if both operands are true. Otherwise, it returns false.

   Example:
   ```java
   boolean a = true;
   boolean b = false;
   boolean result = a && b;  // result = false
   ```

2. Logical OR Operator (||):
   The logical OR operator is represented by "||" and returns true if either of the operands is true. It returns false only if both operands are false.

   Example:
   ```java
   boolean a = true;
   boolean b = false;
   boolean result = a || b;  // result = true
   ```

3. Logical NOT Operator (!):
   The logical NOT operator is represented by "!" and is used to reverse the logical state of its operand. It returns true if the operand is false and vice versa.

   Example:
   ```java
   boolean a = true;
   boolean result = !a;  // result = false
   ```

Logical operators are commonly used in conditional statements, such as if statements and while loops, to evaluate multiple conditions or modify the logical state of expressions. They help in combining boolean values and controlling the flow of the program based on the outcome of the logical operations.
