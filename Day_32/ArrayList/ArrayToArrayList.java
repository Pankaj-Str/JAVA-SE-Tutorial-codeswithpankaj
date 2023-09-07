package Day_40.ArrayList;
// www.codeswithpankaj.com
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Create an array
        String[] fruitsArray = {"Apple", "Banana", "Cherry"};

        // Convert the array to an ArrayList
        List<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        // Print the elements of the ArrayList
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}

