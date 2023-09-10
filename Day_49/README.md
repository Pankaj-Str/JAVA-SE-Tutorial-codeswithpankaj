# Java ConcurrentMap Interface

The `ConcurrentMap` interface in Java is a subinterface of the `java.util.Map` interface that defines a map that can be safely accessed and modified by multiple threads concurrently. It provides methods for performing thread-safe operations on the map, making it suitable for concurrent and multi-threaded programming. `ConcurrentMap` was introduced in Java 5 as part of the Java Collections Framework to address thread safety concerns when working with maps.


```
  +-------------------+
  |   ConcurrentMap   |
  +-------------------+
          |
          |  Implements
          |
  +-------------------+
  | ConcurrentHashMap |
  +-------------------+
          |
          |  Extends
          |
  +-------------------+
  |      Map          |
  +-------------------+
          |
          |  Implements
          |
  +-------------------+
  |    Interface      |
  +-------------------+
          |
          |  Methods
          |
  +-------------------+
  | - put(K key, V value)         |
  | - putIfAbsent(K key, V value) |
  | - replace(K key, V oldValue, V newValue) |
  | - replace(K key, V value)    |
  | - remove(Object key)         |
  | - remove(Object key, Object value) |
  | - compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) |
  | - computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) |
  | - computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) |
  | - merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) |
  | - containsKey(Object key)    |
  | - containsValue(Object value) |
  | - get(Object key)            |
  | - size()                     |
  | - isEmpty()                  |
  | - clear()                    |
  +-------------------+
```




Key characteristics and features of the `ConcurrentMap` interface include:

1. **Thread Safety:** `ConcurrentMap` implementations are designed to be thread-safe. Multiple threads can access and modify the map concurrently without explicit synchronization.

2. **Atomic Operations:** `ConcurrentMap` provides atomic operations for common map operations like `putIfAbsent`, `replace`, `remove`, and `compute`.

3. **Memory Consistency:** `ConcurrentMap` guarantees memory consistency across threads, ensuring that changes made by one thread are visible to other threads.

4. **Performance:** `ConcurrentMap` implementations are optimized for concurrent access, making them suitable for high-performance multi-threaded applications.

5. **Scalability:** These maps are designed to scale well with a large number of threads, avoiding contention and locking as much as possible.

Some of the important methods provided by the `ConcurrentMap` interface include:

- `put(K key, V value)`: Associates the specified value with the specified key.
- `putIfAbsent(K key, V value)`: Atomically associates the specified key with the given value if the key is not already associated with a value.
- `replace(K key, V oldValue, V newValue)`: Replaces the entry for the specified key only if it is currently mapped to the specified value.
- `remove(K key, V value)`: Removes the entry for a key only if it is currently mapped to a given value.
- `compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)`: Computes a new mapping for the specified key using the given remapping function.
- `size()`: Returns the number of key-value mappings in the map.
- `isEmpty()`: Returns `true` if the map contains no key-value mappings.

Popular implementations of the `ConcurrentMap` interface in Java include `ConcurrentHashMap` and `ConcurrentSkipListMap`. These implementations provide different concurrency characteristics and trade-offs, allowing developers to choose the most appropriate one for their specific use case.

Here's a brief example of using `ConcurrentHashMap`, one of the common implementations of `ConcurrentMap`:

```java
import java.util.concurrent.*;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap with String keys and Integer values
        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Put key-value pairs atomically
        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);

        // Perform an atomic operation using putIfAbsent
        concurrentMap.putIfAbsent("One", 3);

        // Perform an atomic operation using replace
        concurrentMap.replace("Two", 2, 4);

        // Iterate over the map
        for (String key : concurrentMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + concurrentMap.get(key));
        }
    }
}
```

In this example, we create a `ConcurrentHashMap`, perform atomic operations using `putIfAbsent` and `replace`, and iterate over the map without worrying about explicit synchronization, thanks to the thread-safe nature of `ConcurrentHashMap`.


### list of some important methods provided by the `ConcurrentMap` interface in Java:

1. `put(K key, V value)`: Associates the specified value with the specified key.

2. `putIfAbsent(K key, V value)`: Atomically associates the specified key with the given value if the key is not already associated with a value.

3. `replace(K key, V oldValue, V newValue)`: Replaces the entry for the specified key only if it is currently mapped to the specified value.

4. `replace(K key, V value)`: Replaces the entry for the specified key only if it is currently mapped to some value.

5. `remove(Object key)`: Removes the mapping for the specified key from this map if present.

6. `remove(Object key, Object value)`: Removes the entry for the specified key only if it is currently mapped to the specified value.

7. `compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)`: Computes a new mapping for the specified key using the given remapping function.

8. `computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)`: If the specified key is not already associated with a value (or is mapped to `null`), attempts to compute its value using the given mapping function and enters it into this map unless `null`.

9. `computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)`: If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.

10. `merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)`: If the specified key is not already associated with a value or is associated with `null`, associates it with the given non-null value.

11. `containsKey(Object key)`: Returns `true` if this map contains a mapping for the specified key.

12. `containsValue(Object value)`: Returns `true` if this map maps one or more keys to the specified value.

13. `get(Object key)`: Returns the value to which the specified key is mapped, or `null` if this map contains no mapping for the key.

14. `size()`: Returns the number of key-value mappings in this map.

15. `isEmpty()`: Returns `true` if this map contains no key-value mappings.

16. `clear()`: Removes all of the mappings from this map.

These methods provide various ways to interact with a `ConcurrentMap`, allowing for atomic operations, thread-safe retrieval, updating, and removal of key-value pairs.


Example : 

```java
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap with String keys and Integer values
        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // put(K key, V value)
        concurrentMap.put("One", 1);

        // putIfAbsent(K key, V value)
        concurrentMap.putIfAbsent("Two", 2);
        concurrentMap.putIfAbsent("One", 3); // This won't change the value for "One"

        // replace(K key, V oldValue, V newValue)
        concurrentMap.replace("Two", 2, 4); // Replace the value for "Two" if it's 2

        // replace(K key, V value)
        concurrentMap.replace("One", 10); // Replace the value for "One"

        // remove(Object key)
        concurrentMap.remove("Two");

        // remove(Object key, Object value)
        concurrentMap.remove("One", 5); // Remove "One" only if it's currently mapped to 5

        // compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        concurrentMap.compute("One", (k, v) -> v + 10); // Add 10 to the value for "One"

        // computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
        concurrentMap.computeIfAbsent("Three", k -> 30); // Add "Three" with a value of 30 if it's absent

        // computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        concurrentMap.computeIfPresent("Three", (k, v) -> v + 5); // Update the value for "Three"

        // merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
        concurrentMap.merge("Three", 50, (v1, v2) -> v1 + v2); // Merge values for "Three"

        // containsKey(Object key)
        boolean containsKey = concurrentMap.containsKey("One");
        System.out.println("Contains key 'One'? " + containsKey);

        // containsValue(Object value)
        boolean containsValue = concurrentMap.containsValue(25); // Check if any value is 25
        System.out.println("Contains value 25? " + containsValue);

        // get(Object key)
        Integer value = concurrentMap.get("One");
        System.out.println("Value for 'One': " + value);

        // size()
        int size = concurrentMap.size();
        System.out.println("Size of the map: " + size);

        // isEmpty()
        boolean isEmpty = concurrentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // clear()
        concurrentMap.clear();
        System.out.println("Map cleared. Is it empty now? " + concurrentMap.isEmpty());
    }
}
```

In this example, we've used various methods provided by `ConcurrentMap` to perform operations such as adding, updating, removing, checking for the presence of keys and values, and clearing the map. These operations are thread-safe and suitable for concurrent use in multi-threaded applications.
