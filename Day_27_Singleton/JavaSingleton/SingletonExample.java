package Day_27_Singleton.JavaSingleton;

public class SingletonExample {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();
    }
}
