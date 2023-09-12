package Day_50_Set_Interface;
import java.util.*;

public class SetMethodsExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // add() - adds elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        System.out.println("Set after adding elements: " + set);

        // addAll() - adds all elements from another collection
        Collection<String> fruits = new ArrayList<>();
        fruits.add("date");
        fruits.add("fig");
        set.addAll(fruits);
        System.out.println("Set after adding all fruits: " + set);

        // iterator() - iterate through elements
        Iterator<String> iterator = set.iterator();
        System.out.print("Set elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // remove() - remove an element
        set.remove("banana");
        System.out.println("Set after removing 'banana': " + set);

        // removeAll() - remove elements present in another set
        Set<String> toRemove = new HashSet<>();
        toRemove.add("date");
        toRemove.add("fig");
        set.removeAll(toRemove);
        System.out.println("Set after removing all dates and figs: " + set);

        // retainAll() - retain only elements present in another set
        Set<String> toRetain = new HashSet<>();
        toRetain.add("apple");
        toRetain.add("cherry");
        set.retainAll(toRetain);
        System.out.println("Set after retaining only apples and cherries: " + set);

        // clear() - remove all elements from the set
        set.clear();
        System.out.println("Set after clearing: " + set);

        // size() - get the number of elements in the set
        int size = set.size();
        System.out.println("Size of the set: " + size);

        // toArray() - convert the set to an array
        String[] array = set.toArray(new String[0]);
        System.out.println("Array from the set: " + Arrays.toString(array));

        // contains() - check if the set contains an element
        boolean contains = set.contains("apple");
        System.out.println("Does the set contain 'apple'? " + contains);

        // containsAll() - check if the set contains all elements from a collection
        Collection<String> checkContainsAll = new ArrayList<>();
        checkContainsAll.add("apple");
        checkContainsAll.add("cherry");
        boolean containsAll = set.containsAll(checkContainsAll);
        System.out.println("Does the set contain all elements from checkContainsAll? " + containsAll);

        // hashCode() - get the hash code of the set
        int hashCode = set.hashCode();
        System.out.println("Hash code of the set: " + hashCode);
    }
}
