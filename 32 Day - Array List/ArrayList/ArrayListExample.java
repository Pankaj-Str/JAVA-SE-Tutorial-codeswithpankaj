package Day_40.ArrayList;
// www.codeswithpankaj.com
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements in the ArrayList
        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);

        // Iterating over the ArrayList using a for-each loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Checking if an element exists in the ArrayList
        boolean containsBob = names.contains("Bob");
        System.out.println("Does the list contain 'Bob'? " + containsBob);

        // Removing an element from the ArrayList
        names.remove("Charlie");

        // Checking the size of the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clearing all elements from the ArrayList
        names.clear();

        // Checking if the ArrayList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);
    }
}