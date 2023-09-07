package Day_31.ArrayList;
// www.codeswithpankaj.com
import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Convert the ArrayList to a String with a delimiter
        String delimiter = ", "; // Define your desired delimiter
        StringBuilder sb = new StringBuilder();
        for (String fruit : fruits) {
            sb.append(fruit).append(delimiter);
        }

        // Remove the trailing delimiter
        String fruitsString = sb.toString().replaceAll(delimiter + "$", "");

        // Print the resulting String
        System.out.println("Fruits: " + fruitsString);
    }
}
