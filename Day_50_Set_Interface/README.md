# Java Set Interface

```plaintext
+------------------------+
|  Java Collections API  |
+------------------------+
         |
         |  Interfaces
         |
+------------------------+
|      Collection        |
|   /   |   |   \        |
| List  Set  Queue  Map  |
|     /    |   |        /   \
|  ArrayList  HashSet  HashMap
|  LinkedList LinkedHashSet
|               TreeSet
|               PriorityQueue
|                  /
|               TreeMap
|                  /
|         LinkedHashMap
|                  /
|         EnumMap
|         WeakHashMap
|         IdentityHashMap
+------------------------+
```
The Java `Set` interface is a part of the Java Collections Framework and represents a collection of elements with no duplicates. It is an interface that extends the `Collection` interface and is implemented by various classes, providing different implementations of sets.

Here are some key characteristics and methods of the Java `Set` interface:

1. **No Duplicate Elements**: A `Set` does not allow duplicate elements. It ensures that each element appears at most once in the collection.

2. **Unordered**: Unlike a `List`, a `Set` does not guarantee the order of its elements.

3. **Unique Element**: A `Set` defines elements based on their uniqueness. Two elements are considered equal if their `equals` method returns `true`, and they have the same hash code.

4. **Common Methods**:
   - `add(E e)`: Adds an element to the set if it is not already present.
   - `remove(Object o)`: Removes an element from the set.
   - `contains(Object o)`: Checks if the set contains a specific element.
   - `size()`: Returns the number of elements in the set.
   - `isEmpty()`: Checks if the set is empty.
   - `clear()`: Removes all elements from the set.
   - `iterator()`: Returns an iterator over the elements in the set.

5. **Implementing Classes**: Common implementing classes of the `Set` interface include:
   - `HashSet`: Uses a hash table to store elements, which provides fast access.
   - `TreeSet`: Stores elements in a sorted order (according to their natural order or a specified comparator).
   - `LinkedHashSet`: Maintains the order of elements based on the insertion order.

Example of using a `HashSet`:

```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added

        // Check if an element is in the set
        boolean containsBanana = set.contains("Banana"); // true

        // Remove an element
        set.remove("Orange");

        // Print the elements
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

### The `Set` interface and its methods:

**Common Methods from Collection Interface:**

1. `add(E e)`: Adds the specified element to the set. If the set already contains the element, it remains unchanged.
   
2. `addAll(Collection<? extends E> c)`: Adds all the elements from the specified collection `c` to the set. If any elements in `c` are already in the set, they are ignored.

3. `iterator()`: Returns an iterator that allows you to access elements in the set sequentially.

4. `remove(Object o)`: Removes the specified element from the set, if it is present.

5. `removeAll(Collection<?> c)`: Removes all elements from the set that are also present in the specified collection `c`.

6. `retainAll(Collection<?> c)`: Retains only the elements in the set that are also present in the specified collection `c`. In other words, it removes elements from the set that are not in `c`.

7. `clear()`: Removes all elements from the set, leaving it empty.

8. `size()`: Returns the number of elements (the size) in the set.

9. `toArray()`: Returns an array containing all the elements of the set.

10. `contains(Object o)`: Checks if the set contains the specified element `o`. It returns `true` if the element is found, `false` otherwise.

11. `containsAll(Collection<?> c)`: Checks if the set contains all the elements in the specified collection `c`. It returns `true` if all elements are found, `false` otherwise.

12. `hashCode()`: Returns a hash code value for the set. This value is based on the elements in the set and is used for hashing and storage purposes.

**Set Operations:**

- **Union**: To get the union of two sets `x` and `y`, you can use `x.addAll(y)`. This operation combines the elements of both sets, removing duplicates.

- **Intersection**: To get the intersection of two sets `x` and `y`, you can use `x.retainAll(y)`. This operation keeps only the elements that are common to both sets `x` and `y`.

- **Subset**: To check if set `x` is a subset of set `y`, you can use `y.containsAll(x)`. This operation verifies if all elements of set `x` are present in set `y`.

### Example :

```java
import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        // Common Methods using HashSet
        Set<String> set1 = new HashSet<>();

        // add(E e)
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        // addAll(Collection<? extends E> c)
        Set<String> set2 = new HashSet<>();
        set2.addAll(set1);
        set2.add("date");

        // iterator()
        Iterator<String> iterator = set2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // remove(Object o)
        set1.remove("banana");

        // removeAll(Collection<?> c)
        Set<String> toRemove = new HashSet<>();
        toRemove.add("date");
        set2.removeAll(toRemove);

        // retainAll(Collection<?> c)
        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        // clear()
        set1.clear();

        // size()
        int size = set2.size();

        // toArray()
        String[] array = set2.toArray(new String[0]);

        // contains(Object o)
        boolean contains = set2.contains("apple");

        // containsAll(Collection<?> c)
        Set<String> checkContainsAll = new HashSet<>();
        checkContainsAll.add("apple");
        checkContainsAll.add("cherry");
        boolean containsAll = set2.containsAll(checkContainsAll);

        // hashCode()
        int hashCode = set2.hashCode();

        System.out.println("Common Methods using HashSet:");
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Size of set2: " + size);
        System.out.println("Array from set2: " + Arrays.toString(array));
        System.out.println("set2 contains 'apple': " + contains);
        System.out.println("set2 contains all elements of checkContainsAll: " + containsAll);
        System.out.println("Hash code of set2: " + hashCode);

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
```

In this example:

- We use a `HashSet` to demonstrate the common methods of the `Set` interface.
- We also show set operations (union, intersection, subset) using two sets `x` and `y`.

