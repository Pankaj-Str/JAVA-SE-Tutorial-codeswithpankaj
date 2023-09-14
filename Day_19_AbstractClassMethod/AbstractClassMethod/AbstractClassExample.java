package Day_19_AbstractClassMethod.AbstractClassMethod;

abstract class p4n {
    // Abstract method without implementation
    abstract void printInfo();

    // Regular (concrete) method with implementation
    void displayMessage() {
        System.out.println("This is a message from p4n.");
    }
}

class ConcreteSubclass extends p4n {
    // Implementation of the abstract method
    @Override
    void printInfo() {
        System.out.println("This is an implementation of printInfo() in ConcreteSubclass.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        ConcreteSubclass obj = new ConcreteSubclass();

        // Call the abstract method and the concrete method
        obj.printInfo();
        obj.displayMessage();
    }
}

