### Operators in Java

Operators are special symbols or keywords in Java that perform operations on variables and values. They are fundamental to performing calculations, making decisions, and manipulating data in your programs. In this section, we will explore the different types of operators in Java and provide examples of how they are used.

---

### 1. Types of Operators in Java

Java provides several types of operators, each serving a specific purpose. The main categories of operators in Java are:

1. **Arithmetic Operators**
2. **Relational Operators**
3. **Logical Operators**
4. **Assignment Operators**
5. **Unary Operators**
6. **Bitwise Operators**
7. **Ternary Operator**
8. **Shift Operators**

Let's explore each type of operator in detail.

---

### 2. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations like addition, subtraction, multiplication, and division.

**List of Arithmetic Operators:**

| Operator | Description           | Example           |
|----------|-----------------------|-------------------|
| `+`      | Addition               | `a + b`           |
| `-`      | Subtraction            | `a - b`           |
| `*`      | Multiplication         | `a * b`           |
| `/`      | Division               | `a / b`           |
| `%`      | Modulus (remainder)    | `a % b`           |

**Example:**

```java
int a = 10;
int b = 5;
int sum = a + b;  // 15
int difference = a - b;  // 5
int product = a * b;  // 50
int quotient = a / b;  // 2
int remainder = a % b;  // 0
```

---

### 3. Relational Operators

Relational operators are used to compare two values. They return a boolean value (`true` or `false`) based on the comparison.

**List of Relational Operators:**

| Operator | Description                  | Example          |
|----------|------------------------------|------------------|
| `==`     | Equal to                     | `a == b`         |
| `!=`     | Not equal to                 | `a != b`         |
| `>`      | Greater than                 | `a > b`          |
| `<`      | Less than                    | `a < b`          |
| `>=`     | Greater than or equal to     | `a >= b`         |
| `<=`     | Less than or equal to        | `a <= b`         |

**Example:**

```java
int a = 10;
int b = 5;
boolean isEqual = (a == b);  // false
boolean isNotEqual = (a != b);  // true
boolean isGreater = (a > b);  // true
boolean isLess = (a < b);  // false
```

---

### 4. Logical Operators

Logical operators are used to combine multiple boolean expressions. They are often used in decision-making statements like `if` and `while`.

**List of Logical Operators:**

| Operator | Description            | Example            |
|----------|-------------------------|--------------------|
| `&&`     | Logical AND              | `a && b`           |
| `||`     | Logical OR               | `a || b`           |
| `!`      | Logical NOT              | `!a`               |

**Example:**

```java
boolean a = true;
boolean b = false;
boolean resultAnd = a && b;  // false
boolean resultOr = a || b;  // true
boolean resultNot = !a;  // false
```

---

### 5. Assignment Operators

Assignment operators are used to assign values to variables. The most basic assignment operator is `=`, but there are also compound assignment operators that perform an operation and assign the result to the variable.

**List of Assignment Operators:**

| Operator | Description                  | Example           |
|----------|------------------------------|-------------------|
| `=`      | Assigns value to a variable   | `a = 10`          |
| `+=`     | Adds and assigns              | `a += 5`          |
| `-=`     | Subtracts and assigns         | `a -= 5`          |
| `*=`     | Multiplies and assigns        | `a *= 5`          |
| `/=`     | Divides and assigns           | `a /= 5`          |
| `%=`     | Modulus and assigns           | `a %= 5`          |

**Example:**

```java
int a = 10;
a += 5;  // a = 15
a -= 3;  // a = 12
a *= 2;  // a = 24
a /= 4;  // a = 6
```

---

### 6. Unary Operators

Unary operators operate on a single operand. They are commonly used to increment, decrement, or negate values.

**List of Unary Operators:**

| Operator | Description                  | Example           |
|----------|------------------------------|-------------------|
| `+`      | Unary plus (positive value)   | `+a`              |
| `-`      | Unary minus (negates value)   | `-a`              |
| `++`     | Increment                    | `a++` or `++a`    |
| `--`     | Decrement                    | `a--` or `--a`    |
| `!`      | Logical NOT (negates boolean) | `!a`              |

**Example:**

```java
int a = 10;
a++;  // a becomes 11
a--;  // a becomes 10
boolean b = false;
boolean notB = !b;  // true
```

---

### 7. Bitwise Operators

Bitwise operators perform operations on individual bits of integer values. They are primarily used in low-level programming, such as in embedded systems.

**List of Bitwise Operators:**

| Operator | Description                | Example           |
|----------|----------------------------|-------------------|
| `&`      | Bitwise AND                | `a & b`           |
| `|`      | Bitwise OR                 | `a | b`           |
| `^`      | Bitwise XOR                | `a ^ b`           |
| `~`      | Bitwise NOT                | `~a`              |

**Example:**

```java
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary
int andResult = a & b;  // 0001 (1 in decimal)
int orResult = a | b;  // 0111 (7 in decimal)
int xorResult = a ^ b;  // 0110 (6 in decimal)
int notResult = ~a;  // 1010 (in two's complement, this is -6 in decimal)
```

---

### 8. Ternary Operator

The ternary operator is a shorthand way of writing an `if-else` statement. It is the only operator in Java that takes three operands.

**Syntax:**

```java
condition ? expression1 : expression2;
```

- If `condition` is true, `expression1` is evaluated and returned.
- If `condition` is false, `expression2` is evaluated and returned.

**Example:**

```java
int a = 10;
int b = 5;
int max = (a > b) ? a : b;  // max will be 10
```

---

### 9. Shift Operators

Shift operators are used to shift bits of a number to the left or right.

**List of Shift Operators:**

| Operator | Description                | Example           |
|----------|----------------------------|-------------------|
| `<<`     | Left shift                 | `a << 2`          |
| `>>`     | Right shift                | `a >> 2`          |
| `>>>`    | Unsigned right shift       | `a >>> 2`         |

**Example:**

```java
int a = 5;  // 0101 in binary
int leftShift = a << 1;  // 1010 (10 in decimal)
int rightShift = a >> 1;  // 0010 (2 in decimal)
```

---

### Conclusion

Operators in Java are powerful tools that allow you to perform a wide range of operations, from basic arithmetic to complex logical and bitwise operations. By mastering these operators, you can write more efficient and effective Java code.

For more Java tutorials and resources, visit [codeswithpankaj.com](http://codeswithpankaj.com).
