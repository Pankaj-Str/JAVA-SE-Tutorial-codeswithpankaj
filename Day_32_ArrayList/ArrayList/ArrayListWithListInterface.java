package Day_32_ArrayList.ArrayList;
// www.codeswithpankaj.com
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithListInterface {
    public static void main(String[] args) {
        // Create an ArrayList using the List interface
        List<String> fruitsList = new ArrayList<>();

        // Add elements to the ArrayList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");

        // Print the elements of the ArrayList
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
