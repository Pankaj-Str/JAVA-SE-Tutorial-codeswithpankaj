package Day_27;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
        // Initialization code, if needed
    }

    // Public static method to get the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes of the Singleton class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

