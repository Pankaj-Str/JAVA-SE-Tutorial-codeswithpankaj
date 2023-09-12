# Java LinkedHashSet

`LinkedHashSet` is a class in Java that extends `HashSet` and is part of the Java Collections Framework. It is similar to `HashSet` in that it is an unordered collection of unique elements. However, it has one key difference: `LinkedHashSet` maintains the insertion order of elements, which means it remembers the order in which elements were added.

Here are some key characteristics and features of `LinkedHashSet`:

1. **Uniqueness:** Like `HashSet`, `LinkedHashSet` does not allow duplicate elements. If you try to add a duplicate element, it won't be stored.

2. **Order Preservation:** `LinkedHashSet` maintains the order in which elements were added. When you iterate over a `LinkedHashSet`, the elements are returned in the order in which they were inserted.

3. **Performance:** The performance characteristics of `LinkedHashSet` are generally similar to `HashSet`. It provides constant-time average performance for basic operations like `add`, `remove`, `contains`, and `size`.

4. **Null Elements:** `LinkedHashSet` allows a single `null` element. If you add `null` more than once, it will only be stored once.

5. **Constructors:** `LinkedHashSet` provides several constructors, including those that allow you to specify an initial capacity and a load factor, similar to `HashSet`.

Here's an example of how to create and use a `LinkedHashSet`:

```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Iterating over elements (in insertion order)
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Output:
        // Apple
        // Banana
        // Orange
    }
}
```

In this example, the elements are printed in the same order in which they were added to the `LinkedHashSet`. If you were to use a regular `HashSet`, the order of elements might be different when iterating over them.