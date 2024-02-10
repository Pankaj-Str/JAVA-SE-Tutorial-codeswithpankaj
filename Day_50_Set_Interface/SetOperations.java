import java.util.*;
class SetOperation{

    public static void main(String[] args) {

        // Set Operations
        Set<Integer> x = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> y = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Union
        Set<Integer> union = new HashSet<>(x);
        union.addAll(y);
        System.out.println("Union of x and y: " + union);

       // Intersection
       Set<Integer> intersection = new HashSet<>(x);
       intersection.retainAll(y);
       System.out.println("Intersection of x and y: " + intersection);

       // Subset
       boolean isSubset = y.containsAll(x);
       System.out.println("Is x a subset of y? " + isSubset);

    }
    
}