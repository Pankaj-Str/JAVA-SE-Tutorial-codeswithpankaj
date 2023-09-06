
### 1. Java Exceptions:

```java
public class ExceptionsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
    }
}
```

### 2. Java Exception Handling:

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
```

### 3. Java try...catch:

```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
```

### 4. Java throw and throws:

```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowThrowsExample {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("This is a custom exception");
    }
}
```

### 5. Java catch Multiple Exceptions:

```java
import java.io.IOException;
import java.sql.SQLException;

public class CatchMultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            // Some code that may throw exceptions
        } catch (IOException e) {
            // Handle IOException
        } catch (SQLException e) {
            // Handle SQLException
        }
    }
}
```

### 6. Java try-with-resources:

```java
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            // Use the file input stream
        } catch (IOException e) {
            // Handle IO exception
        }
    }
}
```

### 7. Java Annotations:

```java
@interface MyAnnotation {
    String value();
}

@MyAnnotation("This is a sample annotation")
public class AnnotationsExample {
    public static void main(String[] args) {
        // Class content
    }
}
```

### 8. Java Annotation Types:

```java
@interface MyAnnotation {
    String value();
    int count() default 0;
}

public class AnnotationTypesExample {
    public static void main(String[] args) {
        // Class content
    }
}
```

### 9. Java Logging:

```java
import java.util.logging.Logger;

public class LoggingExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggingExample.class.getName());
        logger.info("This is an info message");
        logger.warning("This is a warning message");
    }
}
```

### 10. Java Assertions:

```java
public class AssertionsExample {
    public static void main(String[] args) {
        int age = -1;
        assert age >= 0 : "Age cannot be negative";
    }
}
```

You can compile and run each of these programs separately to see how they work for their respective topics.
