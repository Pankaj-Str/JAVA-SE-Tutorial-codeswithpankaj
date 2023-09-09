# Java SortedMap Interface

The `SortedMap` interface in Java is a part of the Java Collections Framework. It extends the `Map` interface and provides a way to store key-value pairs in a sorted order based on the keys. Some important points about `SortedMap`:

1. **Ordering**: It maintains the keys in sorted order. The specific order depends on the implementation class (e.g., `TreeMap`).

2. **No Duplicate Keys**: Like `Map`, it does not allow duplicate keys. Each key can map to at most one value.

3. **Methods**: It includes methods for retrieving submaps, range views, and finding elements based on their position in the sorted order.

4. **Implements Comparable**: Keys stored in a `SortedMap` must be mutually comparable. Either the keys should implement the `Comparable` interface, or you should provide a `Comparator` during map creation.

Here's a simple example of using `SortedMap` with a `TreeMap`:

```java
import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // Add elements
        sortedMap.put(3, "Three");
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");

        // Iterate through the sorted map
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

This would output:

```
1: One
2: Two
3: Three
```

As you can see, the keys are automatically sorted in ascending order.
