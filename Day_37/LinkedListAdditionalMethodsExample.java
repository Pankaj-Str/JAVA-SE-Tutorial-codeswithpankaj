import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListAdditionalMethodsExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(20); // Adding a duplicate element

        // 1. contains() - Check if the LinkedList contains a specific element
        boolean containsElement = linkedList.contains(20);
        System.out.println("Contains 20? " + containsElement);

        // 2. indexOf() - Get the index of the first occurrence of an element
        int indexOfElement = linkedList.indexOf(20);
        System.out.println("Index of first occurrence of 20: " + indexOfElement);

        // 3. lastIndexOf() - Get the index of the last occurrence of an element
        int lastIndexOfElement = linkedList.lastIndexOf(20);
        System.out.println("Index of last occurrence of 20: " + lastIndexOfElement);

        // Display the LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // 4. clear() - Remove all elements from the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clear(): " + linkedList);

        // Adding elements again
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);

        // Display the LinkedList
        System.out.println("Repopulated LinkedList: " + linkedList);

        // 5. iterator() - Use an iterator to iterate over the LinkedList
        System.out.print("Iterating using iterator: ");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
