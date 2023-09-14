package Day_34_Vector.Vector;
// www.codeswithpankaj.com
import java.util.Vector;

public class VectorContainsExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Check if the Vector contains a specific element
        boolean containsTwenty = numbers.contains(20);

        // Print the result
        System.out.println("Vector contains 20: " + containsTwenty);
    }
}

