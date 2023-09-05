public class AnonymousClassExample {
    public static void main(String[] args) {
        // Creating an anonymous class that implements a simple interface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous class implementing MyInterface.");
            }
        };

        // Calling the method of the anonymous class
        myInterface.myMethod();
    }
}

// A simple interface
interface MyInterface {
    void myMethod();
}
