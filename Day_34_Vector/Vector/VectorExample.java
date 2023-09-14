package Day_34_Vector.Vector;
// www.codeswithpankaj.com
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> names = new Vector<>();

        // Add elements to the Vector
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements in the Vector
        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);

        // Iterating over the Vector using a for-each loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

