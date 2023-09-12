import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet with a custom comparator
        SortedSet<String> sortedSet = new TreeSet<>(new CustomComparator());

        // Adding elements
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Cherry");
        sortedSet.add("Date");
        sortedSet.add("Grape");

        // Printing the sorted set
        System.out.println("Sorted Set: " + sortedSet);

        // Using comparator() method
        Comparator<? super String> comparator = sortedSet.comparator();
        System.out.println("Comparator: " + comparator);

        // Using first() and last() methods
        String firstElement = sortedSet.first();
        String lastElement = sortedSet.last();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Using headSet() method
        SortedSet<String> headSet = sortedSet.headSet("Cherry");
        System.out.println("Head Set (Strictly less than 'Cherry'): " + headSet);

        // Using tailSet() method
        SortedSet<String> tailSet = sortedSet.tailSet("Date");
        System.out.println("Tail Set (Greater than or equal to 'Date'): " + tailSet);

        // Using subSet() method
        SortedSet<String> subSet = sortedSet.subSet("Banana", "Grape");
        System.out.println("Sub Set (Between 'Banana' and 'Grape'): " + subSet);
    }
}

// Custom comparator for sorting strings in reverse order
class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
