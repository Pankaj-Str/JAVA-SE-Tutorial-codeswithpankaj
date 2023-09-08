# Java WeakHashMap

The WeakHashMap class of the Java collections framework provides the feature of the hash table data structure..

Certainly! Let's go through each of the topics related to `WeakHashMap` in Java with explanations and examples.

### 1. What is Java WeakHashMap?

A `WeakHashMap` is a class in Java that implements the `Map` interface and is similar to a `HashMap`. However, it has a key difference: it uses weak references for its keys. Weak references allow the garbage collector to remove key-value pairs from the map when the keys are no longer strongly reachable. This makes `WeakHashMap` suitable for situations where you want to associate data with objects that should be automatically removed when they are no longer in use.

### 2. Create a WeakHashMap

You can create a `WeakHashMap` instance by simply instantiating it:

```java
import java.util.WeakHashMap;

public class CreateWeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
        
        // Add key-value pairs to the WeakHashMap
        weakHashMap.put("One", 1);
        weakHashMap.put("Two", 2);
        weakHashMap.put("Three", 3);
        
        // Print the WeakHashMap
        System.out.println("WeakHashMap: " + weakHashMap);
    }
}
```

### 3. Differences Between HashMap and WeakHashMap

The key differences between `HashMap` and `WeakHashMap` are:

- `HashMap` uses strong references for keys, preventing them from being garbage collected. In contrast, `WeakHashMap` uses weak references for keys, allowing them to be collected by the garbage collector when no longer strongly reachable.
- `WeakHashMap` is generally used in scenarios where automatic cleanup of entries is more important than precise control over when entries are removed. It helps prevent memory leaks.

### 4. Creating WeakHashMap from Other Maps

You can create a `WeakHashMap` from an existing `Map` (e.g., a `HashMap`) by using its constructor or by adding elements from the existing map.

#### Using the Constructor:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CreateWeakHashMapFromMap {
    public static void main(String[] args) {
        // Create a regular HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        
        // Create a WeakHashMap from the HashMap
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>(hashMap);
        
        System.out.println("WeakHashMap: " + weakHashMap);
    }
}
```

#### Adding Elements:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CreateWeakHashMapFromElements {
    public static void main(String[] args) {
        // Create a regular HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        
        // Create a new WeakHashMap and add elements from the HashMap
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
        weakHashMap.putAll(hashMap);
        
        System.out.println("WeakHashMap: " + weakHashMap);
    }
}
```

### 5. Methods of WeakHashMap

`WeakHashMap` provides methods similar to those of a standard `HashMap`, such as `put`, `get`, `remove`, and `size`. Here are some commonly used methods:

- `put(K key, V value)`: Adds a key-value pair to the map.
- `get(Object key)`: Retrieves the value associated with a key.
- `remove(Object key)`: Removes a key-value pair from the map.
- `size()`: Returns the number of key-value pairs in the map.

### 6. Insert Elements to WeakHashMap

To insert elements into a `WeakHashMap`, you can use the `put` method:

```java
WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
weakHashMap.put("One", 1);
weakHashMap.put("Two", 2);
weakHashMap.put("Three", 3);
```

### 7. Access WeakHashMap Elements

You can access elements in a `WeakHashMap` using the `get` method:

```java
Integer value = weakHashMap.get("Two");
System.out.println("Value associated with 'Two': " + value);
```

### 8. Remove WeakHashMap Elements

To remove elements from a `WeakHashMap`, you can use the `remove` method:

```java
weakHashMap.remove("Three");
```

Keep in mind that elements in a `WeakHashMap` may be automatically removed by the garbage collector when their keys are no longer strongly referenced elsewhere in your program.
