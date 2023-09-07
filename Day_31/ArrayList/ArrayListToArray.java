package Day_31.ArrayList;
// www.codeswithpankaj.com
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Convert ArrayList to an array of the same type
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Print the elements of the array
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}

