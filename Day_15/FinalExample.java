package Day_15;

public class FinalExample {
    // Final variable
    public static final int MAX_VALUE = 100;

    // Final method
    public final void printMessage() {
        System.out.println("This is a final method.");
    }

    // Final class
    public final class FinalClass {
        public void display() {
            System.out.println("Inside the final class.");
        }
    }

    public static void main(String[] args) {
        // Using the final variable
        System.out.println("Max value: " + FinalExample.MAX_VALUE);

        // Creating an instance of FinalExample
        FinalExample example = new FinalExample();

        // Using the final method
        example.printMessage();

        // Creating an instance of the final class
        FinalClass finalObj = example.new FinalClass();
        finalObj.display();
    }
}
