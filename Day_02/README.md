# Operators

Operators are special symbols or keywords that perform specific operations on operands (variables, literals, or expressions) and produce a result. Java supports various types of operators, which can be classified into different categories based on their functionality. Here are the commonly used operators in Java:

1. Arithmetic Operators:
   - Addition (+): Adds two operands.
   - Subtraction (-): Subtracts the right operand from the left operand.
   - Multiplication (*): Multiplies two operands.
   - Division (/): Divides the left operand by the right operand.
   - Modulus (%): Returns the remainder after division.

2. Assignment Operators:
   - Simple Assignment (=): Assigns a value to a variable.
   - Compound Assignment Operators (+=, -=, *=, /=, %=): Performs an arithmetic operation and assigns the result to the left operand.

3. Increment and Decrement Operators:
   - Increment (++) and Decrement (--): Increases or decreases the value of a variable by 1.

4. Comparison Operators:
   - Equal to (==): Checks if two operands are equal.
   - Not equal to (!=): Checks if two operands are not equal.
   - Greater than (>), Less than (<), Greater than or equal to (>=), Less than or equal to (<=): Perform comparison between operands.

5. Logical Operators:
   - Logical AND (&&): Returns true if both operands are true.
   - Logical OR (||): Returns true if either operand is true.
   - Logical NOT (!): Reverses the logical state of an operand.

6. Bitwise Operators:
   - Bitwise AND (&): Performs bitwise AND operation.
   - Bitwise OR (|): Performs bitwise OR operation.
   - Bitwise XOR (^): Performs bitwise XOR operation.
   - Bitwise NOT (~): Inverts the bits of an operand.
   - Left Shift (<<), Right Shift (>>): Shifts the bits of the left operand left or right by a specified number of positions.

7. Conditional (Ternary) Operator:
   - Conditional ? : Checks a condition and returns one of two values based on the result.

These are the fundamental operators in Java. It's important to understand their usage and precedence rules when writing Java programs.  

# 1 Arithmetic operators

1. Addition (+): Adds two operands together.
   Example: `int sum = 3 + 5;` (sum will be 8)

2. Subtraction (-): Subtracts the right operand from the left operand.
   Example: `int difference = 10 - 3;` (difference will be 7)

3. Multiplication (*): Multiplies two operands.
   Example: `int product = 4 * 6;` (product will be 24)

4. Division (/): Divides the left operand by the right operand.
   Example: `double quotient = 10.0 / 3.0;` (quotient will be approximately 3.3333)

5. Modulus (%): Returns the remainder after division.
   Example: `int remainder = 10 % 3;` (remainder will be 1)

6. Increment (++) and Decrement (--): Increases or decreases the value of a variable by 1.
   Example:
   ```
   int number = 5;
   number++; // number will become 6
   number--; // number will become 5 again
   ```

These arithmetic operators can be used with different numerical data types such as `int`, `double`, `float`, `long`, etc. The operators follow the rules of precedence, where multiplication, division, and modulus have higher precedence than addition and subtraction. Parentheses can be used to enforce the order of operations and control the precedence.

# 2 Assignment operators :

1. Simple Assignment (=):
   ```
   int x = 10;
   ```

2. Addition Assignment (+=):
   ```
   int x = 5;
   x += 3; // x = x + 3;
   System.out.println(x); // Output: 8
   ```

3. Subtraction Assignment (-=):
   ```
   int x = 10;
   x -= 4; // x = x - 4;
   System.out.println(x); // Output: 6
   ```

4. Multiplication Assignment (*=):
   ```
   int x = 3;
   x *= 2; // x = x * 2;
   System.out.println(x); // Output: 6
   ```

5. Division Assignment (/=):
   ```
   int x = 10;
   x /= 2; // x = x / 2;
   System.out.println(x); // Output: 5
   ```

6. Modulus Assignment (%=):
   ```
   int x = 7;
   x %= 3; // x = x % 3;
   System.out.println(x); // Output: 1
   ```

7. Bitwise AND Assignment (&=):
   ```
   int x = 5;
   x &= 3; // x = x & 3;
   System.out.println(x); // Output: 1
   ```

8. Bitwise OR Assignment (|=):
   ```
   int x = 5;
   x |= 3; // x = x | 3;
   System.out.println(x); // Output: 7
   ```

9. Bitwise XOR Assignment (^=):
   ```
   int x = 5;
   x ^= 3; // x = x ^ 3;
   System.out.println(x); // Output: 6
   ```

10. Left Shift Assignment (<<=):
    ```
    int x = 4;
    x <<= 2; // x = x << 2;
    System.out.println(x); // Output: 16
    ```

11. Right Shift Assignment (>>=):
    ```
    int x = 16;
    x >>= 2; // x = x >> 2;
    System.out.println(x); // Output: 4
    ```

# 3 Increment and decrement Operators in Java:

Increment Operator (++):
```
int x = 5;
x++; // Increment x by 1
System.out.println(x); // Output: 6
```

Decrement Operator (--):
```
int y = 8;
y--; // Decrement y by 1
System.out.println(y); // Output: 7
```

Prefix and Postfix Increment:
```
int a = 10;
int b = ++a; // Prefix increment: first increment a, then assign the incremented value to b
System.out.println(a); // Output: 11
System.out.println(b); // Output: 11

int c = 7;
int d = c++; // Postfix increment: first assign the value of c to d, then increment c
System.out.println(c); // Output: 8
System.out.println(d); // Output: 7
```

Prefix and Postfix Decrement:
```
int e = 15;
int f = --e; // Prefix decrement: first decrement e, then assign the decremented value to f
System.out.println(e); // Output: 14
System.out.println(f); // Output: 14

int g = 9;
int h = g--; // Postfix decrement: first assign the value of g to h, then decrement g
System.out.println(g); // Output: 8
System.out.println(h); // Output: 9
```

# 4 Comparison Operators

1. Equal to (==):
```java
int a = 5;
int b = 7;
boolean result = (a == b); // Check if a is equal to b
System.out.println(result); // Output: false
```

2. Not equal to (!=):
```java
int a = 5;
int b = 7;
boolean result = (a != b); // Check if a is not equal to b
System.out.println(result); // Output: true
```

3. Greater than (>): 
```java
int a = 5;
int b = 7;
boolean result = (a > b); // Check if a is greater than b
System.out.println(result); // Output: false
```

4. Less than (<):
```java
int a = 5;
int b = 7;
boolean result = (a < b); // Check if a is less than b
System.out.println(result); // Output: true
```

5. Greater than or equal to (>=):
```java
int a = 5;
int b = 7;
boolean result = (a >= b); // Check if a is greater than or equal to b
System.out.println(result); // Output: false
```

6. Less than or equal to (<=):
```java
int a = 5;
int b = 7;
boolean result = (a <= b); // Check if a is less than or equal to b
System.out.println(result); // Output: true
```

These examples demonstrate the usage of comparison operators in Java. The result of a comparison operation is a boolean value (`true` or `false`) depending on whether the comparison is true or false. Comparison operators are commonly used in conditional statements and loops to control the flow of the program based on certain conditions.


# 5 logical operators

1. Logical AND (&&):
```java
int a = 5;
int b = 7;
boolean result = (a > 0 && b > 0); // Check if both a and b are greater than 0
System.out.println(result); // Output: true
```

2. Logical OR (||):
```java
int a = 5;
int b = 7;
boolean result = (a > 0 || b > 0); // Check if either a or b is greater than 0
System.out.println(result); // Output: true
```

3. Logical NOT (!):
```java
boolean value = true;
boolean result = !value; // Negate the value
System.out.println(result); // Output: false
```

These examples demonstrate the usage of logical operators in Java. The logical AND (`&&`) operator returns `true` if both operands are `true`, the logical OR (`||`) operator returns `true` if at least one of the operands is `true`, and the logical NOT (`!`) operator negates the value of the operand.

Logical operators are often used to combine multiple conditions in conditional statements or to perform logical operations on boolean values. They help in making decisions and controlling the flow of the program based on the evaluation of certain conditions.


# 6 Bitwise Operators : 

1. Bitwise AND (&):
```java
int a = 5; // 101 in binary
int b = 3; // 011 in binary
int result = a & b; // Bitwise AND operation
System.out.println(result); // Output: 1 (001 in binary)
```

2. Bitwise OR (|):
```java
int a = 5; // 101 in binary
int b = 3; // 011 in binary
int result = a | b; // Bitwise OR operation
System.out.println(result); // Output: 7 (111 in binary)
```

3. Bitwise XOR (^):
```java
int a = 5; // 101 in binary
int b = 3; // 011 in binary
int result = a ^ b; // Bitwise XOR operation
System.out.println(result); // Output: 6 (110 in binary)
```

4. Bitwise NOT (~):
```java
int a = 5; // 101 in binary
int result = ~a; // Bitwise NOT operation
System.out.println(result); // Output: -6 (complement of 5 in two's complement representation)
```

5. Left Shift (<<):
```java
int a = 5; // 101 in binary
int result = a << 2; // Left shift by 2 positions
System.out.println(result); // Output: 20 (10100 in binary)
```

6. Right Shift (>>):
```java
int a = 20; // 10100 in binary
int result = a >> 2; // Right shift by 2 positions
System.out.println(result); // Output: 5 (101 in binary)
```

These examples demonstrate the usage of bitwise operators in Java. Bitwise operators operate on individual bits of the operands. They are typically used in low-level programming, such as working with binary data or optimizing certain operations at the bit level.


# 7 Conditional (ternary) Operator in Java:

```java
int number = 7;
String result = (number % 2 == 0) ? "Even" : "Odd";
System.out.println(result);
```

In this example, we have a variable `number` set to 7. The conditional operator `(number % 2 == 0) ? "Even" : "Odd"` checks if the number is divisible by 2 (i.e., even) or not. 

If the condition `(number % 2 == 0)` is true (i.e., the number is even), then the value "Even" is assigned to the `result` variable. Otherwise, if the condition is false (i.e., the number is odd), the value "Odd" is assigned to the `result` variable.

In this case, since 7 is not divisible by 2, the condition is false, and the value "Odd" is assigned to `result`. Finally, we print the value of `result`, which will be "Odd".

The conditional operator is a concise way to assign a value based on a condition. It takes the form `condition ? value1 : value2`, where `condition` is the expression to be evaluated, `value1` is the value assigned if the condition is true, and `value2` is the value assigned if the condition is false.

-------------------------

# Assignment Day 2

1. Age Calculator

```
      --- Date of Birth
      Enter Birth Year : 2001
      Enter Birth Month : 11
      Enter Birth Day : 19

      --- Current Date
      Enter Birth Year : 2023
      Enter Birth Month : 7
      Enter Birth Day : 27

      ---output
      Age:
      21 years 8 months 8 days
      or 260 months 8 days
      or 1131 weeks 3 days
      or 7,920 days

```
