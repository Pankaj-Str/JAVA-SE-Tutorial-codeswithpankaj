# Java HashSet

A Java HashSet is a data structure that implements the Set interface and stores a collection of unique elements. It does not allow duplicate values and does not guarantee the order of elements. HashSet is based on a hash table data structure, which provides efficient operations for adding, removing, and checking for the existence of elements. Here's a basic example of how to use a HashSet in Java:

```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> names = new HashSet<>();

        // Add elements to the HashSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Check if an element exists in the HashSet
        boolean containsAlice = names.contains("Alice");
        System.out.println("Contains Alice: " + containsAlice); // true

        // Remove an element from the HashSet
        names.remove("Bob");

        // Iterate through the elements in the HashSet
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

In this example, we create a HashSet of strings, add elements, check for the existence of an element, remove an element, and iterate through the remaining elements. HashSet is a commonly used data structure for maintaining a collection of unique values in Java.

### Methods of HashSet
HashSet in Java provides various methods for adding, removing, querying, and manipulating elements within the set. Here are some of the commonly used methods of the HashSet class:

1. `add(E e)`: Adds the specified element to the HashSet if it is not already present.

2. `remove(Object o)`: Removes the specified element from the HashSet if it is present.

3. `contains(Object o)`: Returns `true` if the HashSet contains the specified element; otherwise, it returns `false`.

4. `size()`: Returns the number of elements in the HashSet.

5. `isEmpty()`: Returns `true` if the HashSet is empty; otherwise, it returns `false`.

6. `clear()`: Removes all elements from the HashSet, making it empty.

7. `iterator()`: Returns an iterator over the elements in the HashSet.

8. `toArray()`: Converts the HashSet into an array of objects.

9. `addAll(Collection<? extends E> c)`: Adds all the elements from the specified collection to the HashSet.

10. `removeAll(Collection<?> c)`: Removes all elements in the HashSet that are also present in the specified collection.

11. `retainAll(Collection<?> c)`: Retains only the elements in the HashSet that are also present in the specified collection, removing all others.

12. `equals(Object o)`: Compares the HashSet with another object for equality.

13. `hashCode()`: Returns the hash code value for the HashSet.

14. `toString()`: Returns a string representation of the HashSet.


 ### Example : 

```java
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> names = new HashSet<>();

        // add(E e)
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // remove(Object o)
        names.remove("Bob");

        // contains(Object o)
        boolean containsAlice = names.contains("Alice"); // true

        // size()
        int size = names.size(); // 2

        // isEmpty()
        boolean isEmpty = names.isEmpty(); // false

        // clear()
        names.clear();
        isEmpty = names.isEmpty(); // true

        // addAll(Collection<? extends E> c)
        HashSet<String> otherNames = new HashSet<>();
        otherNames.add("Dave");
        otherNames.add("Eve");
        names.addAll(otherNames); // names now contain Alice, Charlie, Dave, Eve

        // removeAll(Collection<?> c)
        HashSet<String> toRemove = new HashSet<>();
        toRemove.add("Charlie");
        names.removeAll(toRemove); // names now contain Alice, Dave, Eve

        // retainAll(Collection<?> c)
        HashSet<String> toRetain = new HashSet<>();
        toRetain.add("Alice");
        names.retainAll(toRetain); // names now contain only Alice

        // iterator()
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name); // Prints "Alice"
        }

        // toArray()
        Object[] nameArray = names.toArray();

        // equals(Object o)
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Alice");
        boolean areEqual = names.equals(anotherSet); // true

        // hashCode()
        int hashCode = names.hashCode();

        // toString()
        String namesString = names.toString();
    }
}
```
