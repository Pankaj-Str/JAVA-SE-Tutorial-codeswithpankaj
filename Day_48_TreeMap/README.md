# Java TreeMap

A TreeMap in Java is a part of the Java Collections Framework and is a NavigableMap implementation that uses a Red-Black tree as its underlying data structure. It is a sorted map that maintains its elements in ascending order based on the keys. This means that the keys in a TreeMap are automatically sorted, and any operation that requires a sorted order, such as iteration or finding elements within a specific range, can be performed efficiently.



```
  +---------------+
  |   TreeMap     |
  +---------------+
          |
          |  Extends
          |
  +---------------+
  |   AbstractMap |
  +---------------+
          |
          |  Implements
          |
  +---------------+
  |    NavigableMap |
  +---------------+
          |
          |  Implements
          |
  +---------------+
  |      SortedMap |
  +---------------+
          |
          |  Implements
          |
  +---------------+
  |       Map     |
  +---------------+
          |
          |  Methods
          |
  +---------------+
  | - put(K key, V value)         |
  | - putAll(Map<? extends K, ? extends V> map) |
  | - remove(Object key)          |
  | - clear()                     |
  | - get(Object key)             |
  | - containsKey(Object key)     |
  | - containsValue(Object value) |
  | - size()                      |
  | - isEmpty()                   |
  | - keySet()                    |
  | - values()                    |
  | - entrySet()                  |
  | - firstKey()                  |
  | - lastKey()                   |
  | - ceilingKey(K key)           |
  | - floorKey(K key)             |
  | - higherKey(K key)            |
  | - lowerKey(K key)             |
  | - subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) |
  | - headMap(K toKey, boolean inclusive) |
  | - tailMap(K fromKey, boolean inclusive) |
  | - comparator()                |
  +-------------------------------+
```




Here are some key points and characteristics of a Java TreeMap:

1. Sorted Keys: The keys in a TreeMap are sorted in natural order or according to a custom comparator provided during TreeMap creation.

2. Red-Black Tree: TreeMap uses a self-balancing Red-Black tree as its underlying data structure. This ensures that operations like insertion, deletion, and search have O(log n) time complexity on average.

3. Null Keys: TreeMap does not allow null keys because it uses the keys for sorting. However, it allows null values.

4. Duplicate Keys: TreeMap does not allow duplicate keys. If you try to insert an element with a key that already exists in the map, the new value will replace the old one.

5. NavigableMap Interface: TreeMap implements the NavigableMap interface, which provides methods for navigating and manipulating elements based on their position in the sorted order.

Here's an example of how to create and use a TreeMap in Java:

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insert elements into the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Iterate through the TreeMap (elements will be in ascending order)
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get and remove the first and last elements
        int firstKey = treeMap.firstKey();
        String firstValue = treeMap.remove(firstKey);

        int lastKey = treeMap.lastKey();
        String lastValue = treeMap.remove(lastKey);

        System.out.println("Removed first: " + firstKey + ", " + firstValue);
        System.out.println("Removed last: " + lastKey + ", " + lastValue);
    }
}
```

Output:
```
Key: 1, Value: One
Key: 2, Value: Two
Key: 3, Value: Three
Key: 4, Value: Four
Removed first: 1, One
Removed last: 4, Four
```

In this example, the elements in the TreeMap are automatically sorted based on their keys, and we demonstrate how to retrieve and remove the first and last elements efficiently.



The TreeMap class in Java provides a variety of methods for working with sorted maps using a Red-Black tree as the underlying data structure. Here are some of the most commonly used methods of the TreeMap class:

1. **Adding Elements:**
   - `put(K key, V value)`: Inserts a key-value pair into the TreeMap.
   - `putAll(Map<? extends K, ? extends V> map)`: Inserts all key-value pairs from another map into the TreeMap.
  
#### Example : 
```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements using put(K key, V value)
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);

        System.out.println("TreeMap after adding elements using put:");
        System.out.println(treeMap);

        // Create another map to add all key-value pairs to the TreeMap
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Five", 5);
        anotherMap.put("Six", 6);

        // Adding elements from anotherMap using putAll(Map<? extends K, ? extends V> map)
        treeMap.putAll(anotherMap);

        System.out.println("\nTreeMap after adding elements from anotherMap using putAll:");
        System.out.println(treeMap);
    }
}
```

Output:
```
TreeMap after adding elements using put:
{Four=4, One=1, Three=3, Two=2}

TreeMap after adding elements from anotherMap using putAll:
{Five=5, Four=4, One=1, Six=6, Three=3, Two=2}
```

In this example:

- We first create a `TreeMap` with String keys and Integer values and add elements to it using the `put(K key, V value)` method.
- Then, we create another `HashMap` called `anotherMap` and add some key-value pairs to it.
- We use the `putAll(Map<? extends K, ? extends V> map)` method to add all key-value pairs from `anotherMap` to the `treeMap`.

As a result, the `treeMap` contains all the elements from both the `put` and `putAll` operations.



2. **Removing Elements:**
   - `remove(Object key)`: Removes the key-value pair associated with the specified key.
   - `clear()`: Removes all elements from the TreeMap.
  
#### Example : 


```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        System.out.println("TreeMap before removing elements:");
        System.out.println(treeMap);

        // Removing elements using remove(Object key)
        treeMap.remove(2); // Remove the key-value pair with key 2

        System.out.println("\nTreeMap after removing key 2:");
        System.out.println(treeMap);

        // Clearing the TreeMap using clear()
        treeMap.clear();

        System.out.println("\nTreeMap after clearing:");
        System.out.println(treeMap);
    }
}
```

Output:
```
TreeMap before removing elements:
{1=One, 2=Two, 3=Three, 4=Four}

TreeMap after removing key 2:
{1=One, 3=Three, 4=Four}

TreeMap after clearing:
{}
```

In this example:

- We first create a `TreeMap` with Integer keys and String values and add elements to it.
- We use the `remove(Object key)` method to remove the key-value pair with key 2 from the TreeMap.
- We then use the `clear()` method to remove all elements from the TreeMap, making it empty.

As a result, you can see the TreeMap's content before and after removing elements and after clearing it completely.

3. **Accessing Elements:**
   - `get(Object key)`: Returns the value associated with the specified key, or null if the key is not found.
   - `firstKey()`: Returns the first (smallest) key in the TreeMap.
   - `lastKey()`: Returns the last (largest) key in the TreeMap.
  
#### Example :


```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);

        // Accessing elements using get(Object key)
        String keyToFind = "Two";
        Integer value = treeMap.get(keyToFind);
        System.out.println("Value for key '" + keyToFind + "': " + value);

        // Accessing the first and last keys using firstKey() and lastKey()
        String firstKey = treeMap.firstKey();
        String lastKey = treeMap.lastKey();

        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);
    }
}
```

Output:
```
Value for key 'Two': 2
First key: Four
Last key: Two
```

In this example:

- We create a `TreeMap` with String keys and Integer values and add elements to it.
- We use the `get(Object key)` method to access the value associated with the key "Two" and print it.
- We use the `firstKey()` method to retrieve and print the first (smallest) key in the TreeMap, and the `lastKey()` method to retrieve and print the last (largest) key.

As a result, you can see how to access elements by key and obtain the first and last keys in the TreeMap.

4. **Navigating and Submap:**
   - `ceilingKey(K key)`: Returns the least key greater than or equal to the given key.
   - `floorKey(K key)`: Returns the greatest key less than or equal to the given key.
   - `higherKey(K key)`: Returns the least key strictly greater than the given key.
   - `lowerKey(K key)`: Returns the greatest key strictly less than the given key.
   - `subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)`: Returns a view of the portion of the map whose keys are within the specified range.
   - `headMap(K toKey, boolean inclusive)`: Returns a view of the portion of the map whose keys are less than (or equal to, if inclusive is true) the specified key.
   - `tailMap(K fromKey, boolean inclusive)`: Returns a view of the portion of the map whose keys are greater than (or equal to, if inclusive is true) the specified key.
  
# Example : 

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        System.out.println("TreeMap: " + treeMap);

        // Navigating elements using ceilingKey, floorKey, higherKey, and lowerKey
        int keyToFind = 3;
        System.out.println("Ceiling key for " + keyToFind + ": " + treeMap.ceilingKey(keyToFind));
        System.out.println("Floor key for " + keyToFind + ": " + treeMap.floorKey(keyToFind));
        System.out.println("Higher key than " + keyToFind + ": " + treeMap.higherKey(keyToFind));
        System.out.println("Lower key than " + keyToFind + ": " + treeMap.lowerKey(keyToFind));

        // Submap examples
        System.out.println("\nSubmap from 2 (inclusive) to 4 (exclusive): " + treeMap.subMap(2, true, 4, false));

        System.out.println("Headmap up to 3 (inclusive): " + treeMap.headMap(3, true));

        System.out.println("Tailmap starting from 3 (inclusive): " + treeMap.tailMap(3, true));
    }
}
```

Output:
```
TreeMap: {1=One, 2=Two, 3=Three, 4=Four, 5=Five}
Ceiling key for 3: 3
Floor key for 3: 3
Higher key than 3: 4
Lower key than 3: 2

Submap from 2 (inclusive) to 4 (exclusive): {2=Two, 3=Three}
Headmap up to 3 (inclusive): {1=One, 2=Two, 3=Three}
Tailmap starting from 3 (inclusive): {3=Three, 4=Four, 5=Five}
```

In this example:

- We create a `TreeMap` with Integer keys and String values and add elements to it.
- We use the `ceilingKey`, `floorKey`, `higherKey`, and `lowerKey` methods to navigate and find keys based on different criteria.
- We use the `subMap`, `headMap`, and `tailMap` methods to create views of portions of the TreeMap based on specified key ranges.

You can see how these methods allow you to navigate and work with specific key ranges within the TreeMap.

5. **Size and Empty Check:**
   - `size()`: Returns the number of key-value mappings in the TreeMap.
   - `isEmpty()`: Returns true if the TreeMap is empty.
  
#### Example : 


```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Check if the TreeMap is empty using isEmpty()
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        // Adding elements
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Check the size of the TreeMap using size()
        int size = treeMap.size();
        System.out.println("Size of TreeMap: " + size);

        // Check if the TreeMap is empty after adding elements
        System.out.println("Is TreeMap empty after adding elements? " + treeMap.isEmpty());

        // Remove an element
        treeMap.remove("Two");

        // Check the size again after removing an element
        size = treeMap.size();
        System.out.println("Size of TreeMap after removing an element: " + size);

        // Clear the TreeMap
        treeMap.clear();

        // Check if the TreeMap is empty after clearing
        System.out.println("Is TreeMap empty after clearing? " + treeMap.isEmpty());
    }
}
```

Output:
```
Is TreeMap empty? true
Size of TreeMap: 3
Is TreeMap empty after adding elements? false
Size of TreeMap after removing an element: 2
Is TreeMap empty after clearing? true
```

In this example:

- We initially create an empty `TreeMap` and check if it's empty using `isEmpty()`.
- After adding elements, we use the `size()` method to check the number of key-value mappings in the TreeMap.
- We also check if the TreeMap is empty after adding elements.
- Then, we remove an element and check the size again.
- Finally, we clear the TreeMap and check if it's empty after clearing.

You can see how these methods allow you to determine the size and emptiness of a TreeMap at different points in your code.

6. **Iterating Over Elements:**
   - `entrySet()`: Returns a set view of the key-value mappings.
   - `keySet()`: Returns a set view of the keys.
   - `values()`: Returns a collection view of the values.
  
# Example : 

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        System.out.println("TreeMap: " + treeMap);

        // Iterating over elements using entrySet()
        System.out.println("\nIterating over elements using entrySet():");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating over keys using keySet()
        System.out.println("\nIterating over keys using keySet():");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values using values()
        System.out.println("\nIterating over values using values():");
        for (String value : treeMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
```

Output:
```
TreeMap: {1=One, 2=Two, 3=Three, 4=Four}

Iterating over elements using entrySet():
Key: 1, Value: One
Key: 2, Value: Two
Key: 3, Value: Three
Key: 4, Value: Four

Iterating over keys using keySet():
Key: 1
Key: 2
Key: 3
Key: 4

Iterating over values using values():
Value: One
Value: Two
Value: Three
Value: Four
```

In this example:

- We create a `TreeMap` with Integer keys and String values and add elements to it.
- We use the `entrySet()` method to iterate over key-value mappings in the TreeMap.
- We use the `keySet()` method to iterate over keys in the TreeMap.
- We use the `values()` method to iterate over values in the TreeMap.

You can see how these methods allow you to access and iterate through different aspects of the TreeMap, such as key-value pairs, keys, and values.

7. **Other Utility Methods:**
   - `comparator()`: Returns the comparator used to order the keys, or null if it uses the natural order.
   - `containsKey(Object key)`: Returns true if the TreeMap contains the specified key.
   - `containsValue(Object value)`: Returns true if the TreeMap contains the specified value.
   - `clone()`: Creates a shallow copy of the TreeMap.

#### Example : 

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        System.out.println("TreeMap: " + treeMap);

        // Using comparator()
        Comparator<Integer> comparator = treeMap.comparator();
        System.out.println("Comparator used: " + comparator);

        // Using containsKey(Object key)
        int keyToCheck = 2;
        boolean containsKey = treeMap.containsKey(keyToCheck);
        System.out.println("Contains key " + keyToCheck + "? " + containsKey);

        // Using containsValue(Object value)
        String valueToCheck = "Five";
        boolean containsValue = treeMap.containsValue(valueToCheck);
        System.out.println("Contains value '" + valueToCheck + "'? " + containsValue);

        // Using clone()
        TreeMap<Integer, String> cloneMap = (TreeMap<Integer, String>) treeMap.clone();
        System.out.println("Clone of TreeMap: " + cloneMap);
    }
}
```

Output:
```
TreeMap: {1=One, 2=Two, 3=Three, 4=Four}
Comparator used: null
Contains key 2? true
Contains value 'Five'? false
Clone of TreeMap: {1=One, 2=Two, 3=Three, 4=Four}
```

In this example:

- We create a `TreeMap` with Integer keys and String values and add elements to it.
- We use the `comparator()` method to check if a custom comparator is used for ordering keys (in this case, it returns `null` because we are using natural ordering).
- We use the `containsKey(Object key)` method to check if the TreeMap contains a specific key.
- We use the `containsValue(Object value)` method to check if the TreeMap contains a specific value.
- We use the `clone()` method to create a shallow copy of the TreeMap.

These utility methods provide additional functionality and information about the TreeMap.



