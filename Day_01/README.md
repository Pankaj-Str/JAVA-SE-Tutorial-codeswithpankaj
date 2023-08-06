
# Java Variables and Literals & Data Types

Data types define the type and size of values that can be stored in variables. Variables, on the other hand, are containers used to hold values of specific data types. Let's explore these concepts in more detail:
In Java, data types define the kind of values that can be stored in variables or returned by methods. Each data type has a specific range of values and operations that can be performed on it. Java has two main categories of data types: primitive types and reference types.

## 1. Primitive Data Types:
   Primitive data types represent basic values and are built into the Java language. They are not objects and do not have methods associated with them. There are eight primitive data types in Java:

   - **byte**: It represents a signed 8-bit integer. The range of values is -128 to 127.
   - **short**: It represents a signed 16-bit integer. The range of values is -32,768 to 32,767.
   - **int**: It represents a signed 32-bit integer. The range of values is -2,147,483,648 to 2,147,483,647.
   - **long**: It represents a signed 64-bit integer. The range of values is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
   - **float**: It represents a 32-bit floating-point number. It can store decimal values and has a range of approximately ±3.40282347E+38F.
   - **double**: It represents a 64-bit floating-point number. It has a higher precision than float and has a range of approximately ±1.79769313486231570E+308.
   - **boolean**: It represents a boolean value, which can be either true or false.
   - **char**: It represents a single 16-bit Unicode character. It can store any character from the Unicode character set.

## 2. Reference Types:
   Reference types are used to create objects and store references to those objects. They include classes, interfaces, arrays, and enumeration types. Reference types can have methods and properties associated with them. They don't store the actual values but store references to the memory locations where the objects are stored.

   - **Class types**: They are user-defined types and can have their own properties, methods, and constructors. They are created using classes defined by the programmer.
   - **Interfaces**: They represent a contract that a class can implement. They define a set of methods that the implementing class must provide.
   - **Arrays**: They are used to store multiple values of the same type in a contiguous block of memory. Arrays have a fixed size and can be accessed using indexes.
   - **Enumeration types**: They are used to define a fixed set of named values. Each value in an enumeration type is an instance of the enumeration class.

In Java, variables and literals play an essential role in storing and manipulating data within a program. Let's explore what variables and literals are and how they are used in Java:

## 1. Variables:
   Variables are named containers that hold values of a specific data type. They allow you to store and manipulate data throughout your program. Before using a variable, you need to declare it with a specific data type. Here's the general syntax for declaring a variable in Java:

   ```java
   data_type variable_name;
   ```

   For example:
   ```java
   int age;
   double pi;
   boolean isStudent;
   ```

   Variables can also be assigned an initial value at the time of declaration:
   ```java
   int number = 10;
   double salary = 5000.50;
   boolean isActive = true;
   ```

   You can assign new values to variables as the program executes. Variables have a scope, which determines where they can be accessed and used within the program. Common variable scopes include local variables, instance variables, and class/static variables.

## 2. Literals:
   Literals are fixed values that are directly written into the code. They represent specific values of different data types. For example, "10" is an integer literal, and "Hello, World!" is a string literal. Java supports various types of literals:

   - Integer literals: These are whole numbers without decimal points. For example: 10, -5, 0.
   - Floating-point literals: These are numbers with decimal points. For example: 3.14, -2.5.
   - Character literals: These represent single characters enclosed in single quotes. For example: 'A', '5', '\n' (newline character).
   - String literals: These represent sequences of characters enclosed in double quotes. For example: "Hello", "Java".
   - Boolean literals: These represent the values true or false.
   - Null literal: It represents the absence of a value and is denoted by the keyword null.

   Here are some examples of using literals:
   ```java
   int age = 25;
   double pi = 3.14159;
   char grade = 'A';
   String message = "Hello, World!";
   boolean isReady = true;
   String name = null;
   ```

   It's important to note that literals are often used to initialize variables, but they can also be used directly in expressions or statements without being assigned to a variable.

Variables and literals work together to store and manipulate data in Java programs. Variables provide named storage locations, while literals represent specific values that can be assigned to variables or used directly in code.


### Assignment Day 1 
1. Write a  Program to Print an Integer 
2. Write a  Program to Add Two Integers
3. Write a  Program to Multiply two Floating Point Numbers
4. Write a  Program to Find ASCII Value of a character
5. Write a  Program to Compute Quotient and Remainder
6. Write a  Program to Swap Two Numbers
