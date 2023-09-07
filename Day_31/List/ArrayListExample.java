import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// www.codeswithpankaj.com
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList using add() method
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Display the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Add all elements of another ArrayList using addAll() method
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");
        fruits.addAll(moreFruits);

        // Display the updated ArrayList
        System.out.println("Updated ArrayList: " + fruits);

        // Access elements using get() method
        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        // Iterate over the ArrayList using iterator() method
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruit: " + fruit);
        }

        // Set an element at a specific index using set() method
        fruits.set(1, "Mango");
        System.out.println("Updated ArrayList after setting: " + fruits);

        // Remove an element using remove() method
        fruits.remove(0);
        System.out.println("ArrayList after removing the first element: " + fruits);

        // Remove all elements using removeAll() method
        fruits.removeAll(moreFruits);
        System.out.println("ArrayList after removing all 'moreFruits' elements: " + fruits);

        // Clear the ArrayList using clear() method
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);

        // Check the size of the ArrayList using size() method
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Convert the ArrayList to an array using toArray() method
        String[] fruitArray = fruits.toArray(new String[0]);

        // Check if an element exists in the ArrayList using contains() method
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does the ArrayList contain 'Banana'? " + containsBanana);
    }
}
