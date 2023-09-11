# Java TreeSet

In Java, `TreeSet` is a class that implements the `NavigableSet` interface and extends the `AbstractSet` class. It is part of the Java Collections Framework and represents a set of elements stored in a Red-Black Tree data structure. Here are some key characteristics and features of `TreeSet`:

1. **Ordered:** A `TreeSet` maintains its elements in natural ascending order or according to a specified comparator. This ordering allows for efficient retrieval of elements in sorted order.

2. **No Duplicates:** Like other `Set` implementations, a `TreeSet` does not allow duplicate elements. If you try to add a duplicate element, it won't be stored.

3. **Navigable:** As it implements the `NavigableSet` interface, `TreeSet` provides methods for efficient navigation and retrieval of elements in sorted order, such as `ceiling`, `floor`, `higher`, and `lower`.

4. **Performance:** The performance characteristics of `TreeSet` are generally good. Basic operations like `add`, `remove`, `contains`, and `size` typically have O(log n) time complexity.

5. **Null Elements:** A `TreeSet` does not allow null elements. If you attempt to add a null element, it will result in a `NullPointerException`.

6. **Constructors:** `TreeSet` provides several constructors, including those that allow you to specify a custom comparator or create a `TreeSet` from an existing collection.

Here's a simple example of how to use a `TreeSet`:

```java
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
        boolean containsElement = treeSet.contains(8);
        System.out.println("Contains 8? " + containsElement);

        // Getting the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size: " + size);
    }
}
```

In this example, we create a `TreeSet` of integers and demonstrate adding, removing, and checking for the existence of elements. The elements are automatically sorted in ascending order within the `TreeSet`.