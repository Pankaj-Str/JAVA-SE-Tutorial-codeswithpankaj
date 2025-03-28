// Custom Exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class to demonstrate the custom exception
public class CustomExceptionExample {

    // Method that throws the custom exception
    public static void demonstrateCustomException(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative value provided: " + value);
        }
        System.out.println("Value is: " + value);
    }

    public static void main(String[] args) {
        try {
            demonstrateCustomException(10); // This will print the value
            demonstrateCustomException(-5); // This will throw the custom exception
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
