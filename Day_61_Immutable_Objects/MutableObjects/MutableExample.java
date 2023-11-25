public class MutableExample {
    public static void main(String[] args) {
        // Creating a mutable StringBuilder
        StringBuilder mutableString = new StringBuilder("Hello");

        // Accessing and modifying the StringBuilder
        System.out.println("Original String: " + mutableString);

        // Appending to the StringBuilder
        mutableString.append(", World!");
        System.out.println("Modified String (Appended): " + mutableString);

        // Modifying the state of the StringBuilder
        mutableString.replace(0, 5, "Greetings");
        System.out.println("Updated String: " + mutableString);

        // Inserting into the StringBuilder
        mutableString.insert(9, " Java");
        System.out.println("String after Insertion: " + mutableString);
    }
}
