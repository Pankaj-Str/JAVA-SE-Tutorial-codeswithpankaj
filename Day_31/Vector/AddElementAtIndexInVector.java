package Day_31.Vector;
// www.codeswithpankaj.com
import java.util.Vector;

public class AddElementAtIndexInVector {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();

        // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");

        // Add an element at a specific position (index 1)
        fruits.add(1, "Cherry");

        // Print the Vector
        System.out.println("Vector: " + fruits);
    }
}
