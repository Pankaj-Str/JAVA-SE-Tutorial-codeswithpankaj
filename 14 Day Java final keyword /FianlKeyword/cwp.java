package Day_15;

public class cwp {
    // Final variable (constant)
    final double PI = 3.14159;

    // Final method that cannot be overridden
    final void displayPI() {
        System.out.println("The value of PI is: " + PI);
    }

    public static void main(String[] args) {
        cwp example = new cwp();
        
        // Access the final variable and method
        System.out.println("Accessing the final variable PI: " + example.PI);
        example.displayPI();
    }
}

