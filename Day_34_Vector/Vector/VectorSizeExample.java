package Day_34_Vector.Vector;
// www.codeswithpankaj.com
import java.util.Vector;

public class VectorSizeExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Get the size of the Vector
        int size = fruits.size();

        // Print the size of the Vector
        System.out.println("Size of the Vector: " + size);
    }
}
