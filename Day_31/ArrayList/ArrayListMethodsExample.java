package Day_31.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
// www.codeswithpankaj.com
public class ArrayListMethodsExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // 1. size() - Returns the length of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // 2. sort() - Sort the ArrayList elements
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // 3. clone() - Create a new ArrayList with the same elements
        ArrayList<Integer> clonedNumbers = (ArrayList<Integer>) numbers.clone();
        System.out.println("Cloned ArrayList: " + clonedNumbers);

        // 4. contains() - Check if the ArrayList contains a specific element
        boolean containsSeven = numbers.contains(7);
        System.out.println("ArrayList contains 7: " + containsSeven);

        // 5. ensureCapacity() - Specify the total elements the ArrayList can contain
        numbers.ensureCapacity(10); // Ensure the capacity is at least 10

        // 6. isEmpty() - Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // 7. indexOf() - Search for a specified element and return its index
        int indexOfFive = numbers.indexOf(5);
        System.out.println("Index of 5: " + indexOfFive);
    }
}
