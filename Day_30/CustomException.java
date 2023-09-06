import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.*;

// Custom Exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class JavaTopicsExample {

    // Example for Java Exceptions
    public static void exceptionsExample() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
    }

    // Example for Java Exception Handling
    public static void exceptionHandlingExample() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // Example for Java try...catch
    public static void tryCatchExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }

    // Example for Java throw and throws
    public static void throwAndThrowsExample() throws CustomException {
        throw new CustomException("This is a custom exception");
    }

    // Example for Java catch Multiple Exceptions
    public static void catchMultipleExceptionsExample() {
        try {
            // Some code that may throw exceptions
        } catch (IOException e) {
            // Handle IOException
        } catch (SQLException e) {
            // Handle SQLException
        }
    }

    // Example for Java try-with-resources
    public static void tryWithResourcesExample() {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            // Use the file input stream
        } catch (IOException e) {
            // Handle IO exception
        }
    }

    // Example for Java Annotations
    @interface MyAnnotation {
        String value();
    }

    @MyAnnotation("This is a sample annotation")
    public static class AnnotationExample {
        // Class content
    }

    // Example for Java Logging
    public static void loggingExample() {
        Logger logger = Logger.getLogger(JavaTopicsExample.class.getName());
        logger.info("This is an info message");
        logger.warning("This is a warning message");
    }

    // Example for Java Assertions
    public static void assertionsExample() {
        int age = -1;
        assert age >= 0 : "Age cannot be negative";
    }

    public static void main(String[] args) {
        // Call each example method
        exceptionsExample();
        exceptionHandlingExample();
        tryCatchExample();
        try {
            throwAndThrowsExample();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
        catchMultipleExceptionsExample();
        tryWithResourcesExample();
        loggingExample();
        assertionsExample();
    }
}
