# Java NavigableMap Interface

The `NavigableMap` interface in Java is a subinterface of the `SortedMap` interface. It provides navigation methods for working with key-value pairs in a sorted map. This interface was introduced in Java 6 to enhance the capabilities of the `SortedMap` interface.

Some key features and methods of the `NavigableMap` interface include:

1. **Navigation Methods:** It offers methods for navigating through the map in both ascending and descending order based on the keys. Some of these methods include `lowerKey()`, `floorKey()`, `ceilingKey()`, `higherKey()`, `descendingMap()`, and more.

2. **Submap Views:** You can create submaps using methods like `subMap()`, `headMap()`, and `tailMap()`. These methods allow you to work with a portion of the map based on specified key ranges.

3. **Polymorphic Methods:** Many methods in `NavigableMap` accept a generic `K` parameter for keys and return values of type `V`. This allows you to use it with various data types.

Here's a simple example of using a `NavigableMap`:

```java
import java.util.*;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(3, "Three");
        navigableMap.put(4, "Four");
        navigableMap.put(5, "Five");

        System.out.println("Original Map: " + navigableMap);

        // Navigation methods
        System.out.println("Ceiling Entry for 3: " + navigableMap.ceilingEntry(3));
        System.out.println("Floor Entry for 3: " + navigableMap.floorEntry(3));

        // Submap
        NavigableMap<Integer, String> subMap = navigableMap.subMap(2, true, 4, true);
        System.out.println("Submap from 2 to 4: " + subMap);
    }
}
```

In this example, we create a `NavigableMap` and demonstrate some of its navigation and submap capabilities.

Please note that you typically use the `TreeMap` class to implement a `NavigableMap`, as shown in the example above.

### Example `NavigableMap` interface in Java with a `TreeMap`:

```java
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        // Create a NavigableMap using TreeMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        // Add key-value pairs to the map
        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(3, "Three");
        navigableMap.put(4, "Four");
        navigableMap.put(5, "Five");

        // Original Map
        System.out.println("Original Map: " + navigableMap);

        // Ceiling Entry: The smallest entry greater than or equal to the given key
        System.out.println("Ceiling Entry for key 3: " + navigableMap.ceilingEntry(3));

        // Floor Entry: The largest entry less than or equal to the given key
        System.out.println("Floor Entry for key 3: " + navigableMap.floorEntry(3));

        // Submap from key 2 (inclusive) to key 4 (exclusive)
        NavigableMap<Integer, String> subMap = navigableMap.subMap(2, true, 4, false);
        System.out.println("Submap from key 2 to key 4: " + subMap);

        // Descending Map: Get a reverse view of the map
        NavigableMap<Integer, String> descendingMap = navigableMap.descendingMap();
        System.out.println("Descending Map: " + descendingMap);

        // Higher Entry: The smallest entry strictly greater than the given key
        System.out.println("Higher Entry for key 3: " + navigableMap.higherEntry(3));

        // Lower Entry: The largest entry strictly less than the given key
        System.out.println("Lower Entry for key 3: " + navigableMap.lowerEntry(3));
    }
}
```

In this example, we create a `NavigableMap` using a `TreeMap`, add key-value pairs, and demonstrate various methods provided by the `NavigableMap` interface. This includes finding ceiling and floor entries, creating submaps, getting a descending view of the map, and finding higher and lower entries based on keys.
