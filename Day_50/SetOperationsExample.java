import java.util.HashSet;
import java.util.Set;

public class SetOperationsExample {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Union - Combine elements from both sets (remove duplicates)
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of Set 1 and Set 2: " + union);

        // Intersection - Keep only the common elements between sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersection);

        // Subset - Check if Set 1 is a subset of Set 2
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Is Set 1 a subset of Set 2? " + isSubset);
    }
}
