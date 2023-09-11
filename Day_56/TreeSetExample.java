package Day_56;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Printing the TreeSet (sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Removing an element
        treeSet.remove(2);

        // Checking if an element exists
        boolean contains8 = treeSet.contains(8);
        System.out.println("Contains 8? " + contains8);

        // Getting the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size: " + size);

        // Finding the first and last elements
        Integer first = treeSet.first();
        Integer last = treeSet.last();
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);

        // Using iterators
        Iterator<Integer> iterator = treeSet.iterator();
        System.out.print("Iterating forward: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        System.out.print("Iterating backward: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // Navigating elements
        NavigableSet<Integer> headSet = treeSet.headSet(5, true);
        System.out.println("Head Set [<= 5]: " + headSet);

        NavigableSet<Integer> tailSet = treeSet.tailSet(5, true);
        System.out.println("Tail Set [>= 5]: " + tailSet);

        NavigableSet<Integer> subSet = treeSet.subSet(2, true, 8, true);
        System.out.println("Sub Set [2, 8]: " + subSet);

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("Cleared TreeSet: " + treeSet);
    }
}
