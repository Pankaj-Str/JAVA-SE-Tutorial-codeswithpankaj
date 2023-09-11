package Day_55;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        // Creating a NavigableSet (TreeSet) of integers
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Adding elements
        navigableSet.add(5);
        navigableSet.add(2);
        navigableSet.add(8);
        navigableSet.add(1);
        navigableSet.add(10);

        // Printing the navigable set
        System.out.println("Navigable Set: " + navigableSet);

        // Using ceiling(), floor(), higher(), and lower() methods
        System.out.println("Ceiling of 3: " + navigableSet.ceiling(3)); // Output: 5
        System.out.println("Floor of 6: " + navigableSet.floor(6));     // Output: 5
        System.out.println("Higher than 5: " + navigableSet.higher(5));  // Output: 8
        System.out.println("Lower than 5: " + navigableSet.lower(5));    // Output: 2

        // Creating a descending view of the set
        NavigableSet<Integer> descendingSet = navigableSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet); // Output: [10, 8, 5, 2, 1]

        // Using descendingIterator() to iterate in reverse order
        System.out.print("Reverse Order: ");
        for (Integer value : descendingSet) {
            System.out.print(value + " "); // Output: 10 8 5 2 1
        }
        System.out.println();

        // Creating a subset using headSet()
        NavigableSet<Integer> headSet = navigableSet.headSet(5, true); // [1, 2, 5]
        System.out.println("Head Set [<= 5]: " + headSet);

        // Creating a subset using tailSet()
        NavigableSet<Integer> tailSet = navigableSet.tailSet(5, true); // [5, 8, 10]
        System.out.println("Tail Set [>= 5]: " + tailSet);

        // Creating a subset using subSet()
        NavigableSet<Integer> subSet = navigableSet.subSet(2, true, 8, true); // [2, 5, 8]
        System.out.println("Sub Set [2, 8]: " + subSet);
    }
}
