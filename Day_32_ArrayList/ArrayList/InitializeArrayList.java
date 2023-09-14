package Day_32_ArrayList.ArrayList;
// www.codeswithpankaj.com
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializeArrayList {
    public static void main(String[] args) {
        // Create and initialize an ArrayList in a single line
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // Print the elements of the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
