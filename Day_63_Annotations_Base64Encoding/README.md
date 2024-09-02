# ### **Tutorial: Annotations and Base64 Encoding in Java - Codes with Pankaj**

Welcome to **Codes with Pankaj**! In this tutorial, we'll dive deep into two crucial concepts in Java: **Annotations** and **Base64 Encoding**. By the end of this guide, you'll have a solid understanding of how to create and use annotations, as well as how to perform Base64 encoding and decoding in Java.

---

## **1. Annotations in Java**

### **1.1 What are Annotations?**

Annotations in Java are a form of metadata that provide data about a program but are not part of the program itself. They do not directly affect the execution of the code but can be used by the compiler and other tools to perform various tasks like code analysis, generation, or even runtime processing.

### **1.2 Commonly Used Annotations**

Java provides several built-in annotations:

- `@Override`: Indicates that a method is overriding a method from a superclass.
- `@Deprecated`: Marks a method as deprecated, signaling that it should not be used.
- `@SuppressWarnings`: Tells the compiler to ignore specific warnings.

### **1.3 Creating Custom Annotations**

Let's create a custom annotation named `@Author` that can be used to document the author of a class or method.

#### **Step 1: Define the Annotation**

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Author {
    String name();
    String date();
}
```

- `@Retention(RetentionPolicy.RUNTIME)`: This annotation specifies that the `@Author` annotation should be available at runtime.
- `@Target({ElementType.TYPE, ElementType.METHOD})`: Specifies that the `@Author` annotation can be applied to types (classes) and methods.

#### **Step 2: Use the Annotation**

```java
@Author(name = "Pankaj", date = "2024-09-02")
public class MyClass {

    @Author(name = "Pankaj", date = "2024-09-02")
    public void myMethod() {
        System.out.println("Hello from MyMethod!");
    }
}
```

### **1.4 Accessing Annotations at Runtime**

You can access the annotations using reflection.

```java
import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) {
        // Access class-level annotation
        if (MyClass.class.isAnnotationPresent(Author.class)) {
            Author author = MyClass.class.getAnnotation(Author.class);
            System.out.println("Class Author: " + author.name() + ", Date: " + author.date());
        }

        // Access method-level annotation
        try {
            Method method = MyClass.class.getMethod("myMethod");
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Method Author: " + author.name() + ", Date: " + author.date());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
```

---

## **2. Base64 Encoding and Decoding in Java**

Base64 is a binary-to-text encoding scheme that is commonly used to encode binary data, such as images or files, into a textual format.

### **2.1 Base64 Encoding**

The `java.util.Base64` class provides methods for encoding and decoding Base64.

#### **Step 1: Encode a String to Base64**

```java
import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String originalString = "codes with pankaj";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        
        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String: " + encodedString);
    }
}
```

### **2.2 Base64 Decoding**

You can also decode a Base64-encoded string back to its original form.

#### **Step 2: Decode a Base64 String**

```java
import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String encodedString = "Y29kZXMgd2l0aCBwYW5rYWo=";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}
```

### **2.3 Encoding and Decoding Files**

Base64 encoding can also be applied to binary files.

```java
import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileBase64Example {
    public static void main(String[] args) {
        try {
            // Encode file to Base64
            byte[] fileContent = Files.readAllBytes(Paths.get("example.txt"));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            System.out.println("Encoded File String: " + encodedString);

            // Decode Base64 to file
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            Files.write(Paths.get("decoded_example.txt"), decodedBytes);
            System.out.println("File successfully decoded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

