# Java Strings

Strings are a sequence of characters used to represent text. Strings are a fundamental data type, and Java provides a rich set of features and methods for working with strings. Here are some key aspects of Java strings:

Here is a list of some commonly used methods for manipulating and working with strings in Java, along with examples of how to use them:

1. **charAt(int index):** Returns the character at the specified index.

   ```java
   String str = "Hello";
   char ch = str.charAt(0); // ch contains 'H'
   ```

2. **length():** Returns the length of the string.

   ```java
   String str = "Java";
   int len = str.length(); // len contains 4
   ```

3. **substring(int beginIndex):** Returns a substring starting from the specified index.

   ```java
   String str = "Hello, World!";
   String sub = str.substring(7); // sub contains "World!"
   ```

4. **substring(int beginIndex, int endIndex):** Returns a substring within the specified range.

   ```java
   String str = "Hello, World!";
   String sub = str.substring(7, 12); // sub contains "World"
   ```

5. **toUpperCase():** Converts the string to uppercase.

   ```java
   String str = "Java";
   String upper = str.toUpperCase(); // upper contains "JAVA"
   ```

6. **toLowerCase():** Converts the string to lowercase.

   ```java
   String str = "Java";
   String lower = str.toLowerCase(); // lower contains "java"
   ```

7. **equals(String anotherString):** Compares two strings for content equality.

   ```java
   String str1 = "Hello";
   String str2 = "Hello";
   boolean isEqual = str1.equals(str2); // true
   ```

8. **equalsIgnoreCase(String anotherString):** Compares two strings for content equality, ignoring case.

   ```java
   String str1 = "Java";
   String str2 = "java";
   boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true
   ```

9. **startsWith(String prefix):** Checks if the string starts with the specified prefix.

   ```java
   String str = "Hello, World!";
   boolean startsWithHello = str.startsWith("Hello"); // true
   ```

10. **endsWith(String suffix):** Checks if the string ends with the specified suffix.

    ```java
    String str = "Hello, World!";
    boolean endsWithWorld = str.endsWith("World!"); // true
    ```

11. **contains(CharSequence sequence):** Checks if the string contains the specified character sequence.

    ```java
    String str = "Java Programming";
    boolean containsJava = str.contains("Java"); // true
    ```

12. **replace(char oldChar, char newChar):** Replaces all occurrences of `oldChar` with `newChar`.

    ```java
    String str = "Hello, World!";
    String replaced = str.replace('o', '0'); // replaced contains "Hell0, W0rld!"
    ```

13. **trim():** Removes leading and trailing whitespace characters from the string.

    ```java
    String str = "   Java   ";
    String trimmed = str.trim(); // trimmed contains "Java"
    ```

14. **split(String regex):** Splits the string into an array of substrings using a regular expression pattern as the delimiter.

    ```java
    String sentence = "This is a sample sentence.";
    String[] words = sentence.split(" "); // ["This", "is", "a", "sample", "sentence."]
    ```

15. **indexOf(String str):** Returns the index of the first occurrence of the specified substring, or -1 if not found.

    ```java
    String text = "Java is fun!";
    int index = text.indexOf("is"); // index contains 5
    ```

