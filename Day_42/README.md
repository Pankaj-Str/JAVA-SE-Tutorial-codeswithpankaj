# Java HashMap

In Java, `HashMap` is a widely used data structure that implements the `Map` interface, which allows you to store key-value pairs. Each key is associated with a value, and you can use the key to retrieve the corresponding value quickly. `HashMap` is part of the `java.util` package and provides efficient lookup and insertion operations.

Here's how you can use `HashMap` in Java:

### Creating a HashMap:

You can create a `HashMap` and specify its key and value types. For example:

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Add key-value pairs to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
    }
}
```

### Accessing and Modifying HashMap:

You can access values in the `HashMap` using their keys and modify values associated with existing keys. Here's an example:

```java
String value = hashMap.get(2); // Retrieves the value associated with key 2 ("Two")
hashMap.put(4, "Four");        // Adds a new key-value pair (4, "Four")
hashMap.put(1, "First");       // Modifies the value associated with key 1
```

### Removing Elements from HashMap:

You can remove elements from the `HashMap` using the `remove` method:

```java
hashMap.remove(3); // Removes the key-value pair with key 3
```

### Iterating Over HashMap:

You can iterate over the key-value pairs in a `HashMap` using a loop or other collection-processing techniques:

```java
for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```

### Checking If a Key Exists:

You can check if a key exists in the `HashMap` using the `containsKey` method:

```java
boolean containsKey = hashMap.containsKey(2); // Returns true if key 2 exists, false otherwise
```

### HashMap Properties:

- `HashMap` allows null keys and null values.
- It does not guarantee the order of key-value pairs. If you need ordered key-value pairs, consider using a `LinkedHashMap`.
- `HashMap` uses the `hashCode` and `equals` methods of the keys to determine key uniqueness.
- `HashMap` is not thread-safe. If you need a thread-safe version, consider using `ConcurrentHashMap`.

|No.| Methods|
|---|---|
|1.  |`HashMap.get()`|
|2. | `HashMap.getOrDefault()`|
|3. | `HashMap.keySet()` |
|4. | `HashMap.values()` |
|5. | `HashMap.entrySet()`.|

### 1. `HashMap.get()`

The `get()` method in a `HashMap` is used to retrieve the value associated with a specific key.

```java
import java.util.HashMap;

public class HashMapGetExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Retrieving values using keys
        int value = hashMap.get("two");
        System.out.println("Value associated with 'two': " + value); // Output: Value associated with 'two': 2
    }
}
```

### 2. `HashMap.getOrDefault()`

The `getOrDefault()` method in a `HashMap` retrieves the value associated with a specific key, or returns a default value if the key is not found.

```java
import java.util.HashMap;

public class HashMapGetOrDefaultExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Retrieving values using getOrDefault
        int value = hashMap.getOrDefault("three", 0); // Key "three" doesn't exist
        System.out.println("Value associated with 'three': " + value); // Output: Value associated with 'three': 0
    }
}
```

### 3. `HashMap.keySet()`

The `keySet()` method in a `HashMap` returns a set of all the keys in the map.

```java
import java.util.HashMap;
import java.util.Set;

public class HashMapKeySetExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Getting the key set
        Set<String> keys = hashMap.keySet();
        System.out.println("Keys in the HashMap: " + keys); // Output: Keys in the HashMap: [one, two, three]
    }
}
```

### 4. `HashMap.values()`

The `values()` method in a `HashMap` returns a collection of all the values in the map.

```java
import java.util.HashMap;
import java.util.Collection;

public class HashMapValuesExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Getting the collection of values
        Collection<Integer> values = hashMap.values();
        System.out.println("Values in the HashMap: " + values); // Output: Values in the HashMap: [1, 2, 3]
    }
}
```

### 5. `HashMap.entrySet()`

The `entrySet()` method in a `HashMap` returns a set of key-value pairs (entries) in the map.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySetExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Getting the entry set
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        
        // Iterating over the entry set
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
```

## Other Methods of HashMap


### 1. `clear()`

The `clear()` method is used to remove all mappings from a `HashMap`.

```java
import java.util.HashMap;

public class HashMapClearExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);

        System.out.println("HashMap before clearing: " + hashMap);

        // Clearing the HashMap
        hashMap.clear();

        System.out.println("HashMap after clearing: " + hashMap); // Output: HashMap after clearing: {}
    }
}
```

### 2. `compute()`

The `compute()` method is used to compute a new value for a specified key.

```java
import java.util.HashMap;

public class HashMapComputeExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);

        // Using compute to update the value associated with the key "one"
        hashMap.compute("one", (key, oldValue) -> oldValue + 1);

        System.out.println("Updated value for 'one': " + hashMap.get("one")); // Output: Updated value for 'one': 2
    }
}
```

### 3. `computeIfAbsent()`

The `computeIfAbsent()` method is used to compute a value if a mapping for the specified key is not present.

```java
import java.util.HashMap;

public class HashMapComputeIfAbsentExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Using computeIfAbsent to add a new key-value pair
        hashMap.computeIfAbsent("two", key -> 2);

        System.out.println("Value for 'two': " + hashMap.get("two")); // Output: Value for 'two': 2
    }
}
```

### 4. `computeIfPresent()`

The `computeIfPresent()` method is used to compute a value for a mapping if the key is present.

```java
import java.util.HashMap;

public class HashMapComputeIfPresentExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);

        // Using computeIfPresent to update the value associated with the key "one"
        hashMap.computeIfPresent("one", (key, oldValue) -> oldValue + 1);

        System.out.println("Updated value for 'one': " + hashMap.get("one")); // Output: Updated value for 'one': 2
    }
}
```

### 5. `merge()`

The `merge()` method is used to merge the specified mapping into the `HashMap`.

```java
import java.util.HashMap;

public class HashMapMergeExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);

        // Using merge to update the value associated with the key "one"
        hashMap.merge("one", 2, (oldValue, newValue) -> oldValue + newValue);

        System.out.println("Updated value for 'one': " + hashMap.get("one")); // Output: Updated value for 'one': 3
    }
}
```

### 6. `clone()`

The `clone()` method makes a copy of the `HashMap`.

```java
import java.util.HashMap;

public class HashMapCloneExample {
    public static void main(String[] args) {
        HashMap<String, Integer> originalHashMap = new HashMap<>();

        // Adding key-value pairs
        originalHashMap.put("one", 1);
        originalHashMap.put("two", 2);

        // Cloning the HashMap
        HashMap<String, Integer> clonedHashMap = (HashMap<String, Integer>) originalHashMap.clone();

        System.out.println("Original HashMap: " + originalHashMap);
        System.out.println("Cloned HashMap: " + clonedHashMap);
    }
}
```

### 7. `containsKey()`

The `containsKey()` method checks if the specified key is present in the `HashMap`.

```java
import java.util.HashMap;

public class HashMapContainsKeyExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);

        // Checking if a key exists
        boolean containsKey = hashMap.containsKey("one");
        System.out.println("Contains 'one': " + containsKey); // Output: Contains 'one': true
    }
}
```

### 8. `containsValue()`

The `containsValue()` method checks if the `HashMap` contains the specified value.

```java
import java.util.HashMap;

public class HashMapContainsValueExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);

        // Checking if a value exists
        boolean containsValue = hashMap.containsValue(1);
        System.out.println("Contains value '1': " + containsValue); // Output: Contains value '1': true
    }
}
```

### 9. `size()`

The `size()` method returns the number of items (key-value pairs) in the `HashMap`.

```java
import java.util.HashMap;

public class HashMapSizeExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size); // Output: Size of HashMap: 3
    }
}
```

### 10. `isEmpty()`

The `isEmpty()` method checks if the `HashMap` is empty.

```java
import java.util.HashMap;

public class HashMapIsEmptyExample {
    public static void main(String[] args) {
        HashMap<String, Integer> emptyHashMap = new HashMap<>();
        HashMap<String, Integer> nonEmptyHashMap = new HashMap<>();

        nonEmptyHashMap.put("one", 1);

        boolean isEmpty1 = emptyHashMap.isEmpty();
        boolean isEmpty2 = nonEmptyHashMap.isEmpty();

        System.out.println("Is emptyHashMap empty? " + isEmpty1); // Output: Is emptyHashMap empty? true
        System.out.println("Is nonEmptyHashMap empty? " + isEmpty2); // Output: Is nonEmptyHashMap empty? false
    }
}
```







