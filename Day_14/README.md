# Java Strings

Java Strings are objects that represent a sequence of characters. In Java, the `String` class is provided as part of the Java Standard Library and is widely used for manipulating and working with textual data.

Here are some important aspects of Java Strings:

1. String Creation: Strings can be created in Java using either a string literal or the `new` keyword. For example:
   ```java
   String message1 = "Hello, World!"; // Using string literal
   String message2 = new String("Hello, World!"); // Using the 'new' keyword
   ```

2. Immutability: Once created, a `String` object in Java is immutable, which means its value cannot be changed. If you perform any operation on a string (such as concatenation or substring), a new string object is created. This immutability is designed for efficiency and thread safety.

3. String Concatenation: Java provides the `+` operator for concatenating strings. You can concatenate strings together using the `+` operator or the `concat()` method. Here are examples of both approaches:
   ```java
   String firstName = "John";
   String lastName = "Doe";

   String fullName1 = firstName + " " + lastName; // Using the '+' operator
   String fullName2 = firstName.concat(" ").concat(lastName); // Using the 'concat()' method
   ```

4. String Length: You can get the length of a string using the `length()` method. For example:
   ```java
   String message = "Hello, World!";
   int length = message.length(); // length = 13
   ```

5. String Comparison: To compare strings for equality, you should use the `equals()` method or `equalsIgnoreCase()` method. The `==` operator should not be used for string comparison, as it checks for reference equality, not content equality. For example:
   ```java
   String str1 = "Hello";
   String str2 = "Hello";

   boolean isEqual = str1.equals(str2); // true
   ```

6. String Manipulation: The `String` class provides various methods for manipulating strings, such as extracting substrings, converting case, replacing characters, and more. Some commonly used methods include `substring()`, `toLowerCase()`, `toUpperCase()`, `replace()`, `trim()`, and `split()`. Here's an example:
   ```java
   String sentence = "The quick brown fox";
   String substring = sentence.substring(4, 9); // "quick"
   String lowerCase = sentence.toLowerCase(); // "the quick brown fox"
   String replaced = sentence.replace("brown", "red"); // "The quick red fox"
   String[] words = sentence.split(" "); // ["The", "quick", "brown", "fox"]
   ```

These are just a few fundamental concepts related to Java Strings. The `String` class in Java offers many more methods and functionalities for working with strings efficiently.
---------------------
# Strings methods

Some commonly used methods of the `String` class in Java:

1. `length()`: Returns the length of the string.
   ```java
   String str = "Hello";
   int length = str.length(); // length = 5
   ```

2. `charAt(index)`: Returns the character at the specified index.
   ```java
   String str = "Hello";
   char ch = str.charAt(1); // ch = 'e'
   ```

3. `substring(beginIndex)`: Returns a substring starting from the specified index.
   ```java
   String str = "Hello, World!";
   String sub = str.substring(7); // sub = "World!"
   ```

4. `substring(beginIndex, endIndex)`: Returns a substring within the specified range.
   ```java
   String str = "Hello, World!";
   String sub = str.substring(7, 12); // sub = "World"
   ```

5. `concat(str)`: Concatenates the specified string at the end of the current string.
   ```java
   String str1 = "Hello";
   String str2 = "World";
   String result = str1.concat(str2); // result = "HelloWorld"
   ```

6. `toUpperCase()`: Converts the string to uppercase.
   ```java
   String str = "Hello";
   String upper = str.toUpperCase(); // upper = "HELLO"
   ```

7. `toLowerCase()`: Converts the string to lowercase.
   ```java
   String str = "Hello";
   String lower = str.toLowerCase(); // lower = "hello"
   ```

8. `equals(str)`: Compares the string with the specified string for equality.
   ```java
   String str1 = "Hello";
   String str2 = "hello";
   boolean isEqual = str1.equals(str2); // false
   ```

9. `equalsIgnoreCase(str)`: Compares the string with the specified string for equality, ignoring case.
   ```java
   String str1 = "Hello";
   String str2 = "hello";
   boolean isEqual = str1.equalsIgnoreCase(str2); // true
   ```

10. `startsWith(prefix)`: Checks if the string starts with the specified prefix.
    ```java
    String str = "Hello, World!";
    boolean startsWithHello = str.startsWith("Hello"); // true
    ```

11. `endsWith(suffix)`: Checks if the string ends with the specified suffix.
    ```java
    String str = "Hello, World!";
    boolean endsWithWorld = str.endsWith("World!"); // true
    ```

12. `contains(str)`: Checks if the string contains the specified substring.
    ```java
    String str = "Hello, World!";
    boolean containsWorld = str.contains("World"); // true
    ```

13. `replace(oldChar, newChar)`: Replaces all occurrences of a character with a new character.
    ```java
    String str = "Hello, World!";
    String replaced = str.replace('o', '0'); // replaced = "Hell0, W0rld!"
    ```

14. `replaceAll(regex, replacement)`: Replaces all occurrences of a substring that matches a regular expression with a new string.
    ```java
    String str = "Hello, World!";
    String replaced = str.replaceAll("[aeiou]", "*"); // replaced = "H*ll*, W*rld!"
    ```

15. `trim()`: Removes leading and trailing whitespace from the string.
    ```java
    String str = "   Hello, World!   ";
    String trimmed = str.trim(); // trimmed = "Hello, World!"
    ```

These are just a few examples of the methods provided by the `String` class in Java. The `String` class offers many more methods for various string operations and manipulations.

-------------------- 

# list of methods provided by the `String` class in Java:

1. `length()`: Returns the length of the string.
2. `charAt(int index)`: Returns the character at the specified index.
3. `substring(int beginIndex)`: Returns a substring starting from the specified index.
4. `substring(int beginIndex, int endIndex)`: Returns a substring within the specified range.
5. `concat(String str)`: Concatenates the specified string at the end of the current string.
6. `toUpperCase()`: Converts the string to uppercase.
7. `toLowerCase()`: Converts the string to lowercase.
8. `equals(Object obj)`: Compares the string with the specified object for equality.
9. `equalsIgnoreCase(String str)`: Compares the string with the specified string for equality, ignoring case.
10. `startsWith(String prefix)`: Checks if the string starts with the specified prefix.
11. `endsWith(String suffix)`: Checks if the string ends with the specified suffix.
12. `contains(CharSequence sequence)`: Checks if the string contains the specified sequence of characters.
13. `replace(char oldChar, char newChar)`: Replaces all occurrences of a character with a new character.
14. `replaceAll(String regex, String replacement)`: Replaces all occurrences of a substring that matches a regular expression with a new string.
15. `split(String regex)`: Splits the string into an array of substrings based on the specified delimiter.
16. `trim()`: Removes leading and trailing whitespace from the string.
17. `compareTo(String anotherString)`: Compares the string lexicographically with another string.
18. `indexOf(int ch)`: Returns the index of the first occurrence of the specified character.
19. `lastIndexOf(int ch)`: Returns the index of the last occurrence of the specified character.
20. `isEmpty()`: Checks if the string is empty (has a length of 0).

--------------------------
# Java Access Modifiers

###  Java, access modifiers are keywords used to set the accessibility or visibility of classes, variables, methods, and constructors within a program. There are four different access modifiers in Java:

1. **Public (`public`)**: The `public` access modifier allows unrestricted access to the associated class, variable, method, or constructor from anywhere within the program, including other classes, packages, and even outside the program.
```java
public class MyClass {
    public int myPublicVariable;
    
    public void myPublicMethod() {
        // Code here
    }
}
```

2. **Private (`private`)**: The `private` access modifier restricts access to the associated class, variable, method, or constructor only within the same class. It cannot be accessed from outside the class or even from other classes within the same package.
```java
public class MyClass {
    private int myPrivateVariable;
    
    private void myPrivateMethod() {
        // Code here
    }
}
```

3. **Protected (`protected`)**: The `protected` access modifier allows access to the associated class, variable, method, or constructor within the same class, derived/subclass, or within the same package. It is not accessible from unrelated classes outside the package.
```java
public class MyClass {
    protected int myProtectedVariable;
    
    protected void myProtectedMethod() {
        // Code here
    }
}
```

4. **Default (No Modifier)**: If no access modifier is specified, it is considered the default access modifier. The default access allows access to the associated class, variable, method, or constructor within the same package only. It is not accessible from classes outside the package.
```java
class MyClass {
    int myDefaultVariable;
    
    void myDefaultMethod() {
        // Code here
    }
}
```

It's important to understand and use access modifiers appropriately to ensure proper encapsulation, data hiding, and access control in Java programs. The choice of access modifier depends on the desired level of visibility and the intended usage of the class members.