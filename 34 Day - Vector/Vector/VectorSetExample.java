package Day_34.Vector;
// www.codeswithpankaj.com
import java.util.Vector;

public class VectorSetExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Change an element in the Vector
        numbers.set(1, 25);

        // Print the updated Vector
        System.out.println("Updated Vector: " + numbers);
    }
}

