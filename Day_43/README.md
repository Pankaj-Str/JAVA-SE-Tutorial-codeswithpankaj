
# Java LinkedHashMap

A `LinkedHashMap` in Java is a class that extends the functionality of a regular `HashMap` by maintaining a predictable order of elements. In a standard `HashMap`, the order of elements is not guaranteed, but in a `LinkedHashMap`, the elements are stored in the order they were inserted or in a specific order based on access. This predictable order can be useful in various scenarios where the order of elements matters.

Here are some key features and characteristics of a `LinkedHashMap`:

1. **Order-Preserving**: `LinkedHashMap` maintains the order of elements based on their insertion order (insertion-order mode) or their access order (access-order mode). In access-order mode, elements are reordered based on their most recent access.

2. **Iteration Order**: When you iterate over a `LinkedHashMap`, the elements are returned in the order in which they were added or in the access order if it's in access-order mode.

3. **Duplicates**: Like `HashMap`, `LinkedHashMap` does not allow duplicate keys. However, it does allow null keys and null values.

4. **Performance**: The performance characteristics of `LinkedHashMap` are similar to those of `HashMap` for most operations. The extra overhead for maintaining order has some performance implications, but it's usually not a significant concern for most use cases.

Here's an example of how to use a `LinkedHashMap`:

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap in insertion-order mode
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add elements to the map
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // Iterate over the elements (in insertion order)
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```


### 1. Creating a LinkedHashMap:

To create a `LinkedHashMap`, you can simply instantiate the class using its constructor:

```java
import java.util.LinkedHashMap;

public class CreateLinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // Adding elements to the LinkedHashMap
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        
        // Printing the LinkedHashMap
        System.out.println(linkedHashMap);
    }
}
```

### 2. Creating LinkedHashMap from Other Maps:

You can create a `LinkedHashMap` from other map implementations, such as a `HashMap`:

```java
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreateLinkedHashMapFromOtherMapsExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Create a LinkedHashMap from the HashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);

        // Printing the LinkedHashMap
        System.out.println(linkedHashMap);
    }
}
```

### 3. Methods of LinkedHashMap:

`LinkedHashMap` provides methods for various operations. Here are some examples:

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LiGZ6EKp4WNQvrE3oY5TZc2dvaSvkBDMEe {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Insert elements
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);

        // Access elements
        int value = linkedHashMap.get("One");

        // Remove elements
        linkedHashMap.remove("Two");

        // Other methods
        int size = linkedHashMap.size();
        boolean isEmpty = linkedHashMap.isEmpty();
        boolean containsKey = linkedHashMap.containsKey("One");
        boolean containsValue = linkedHashMap.containsValue(1);

        // Printing the LinkedHashMap
        System.out.println(linkedHashMap);
    }
}
```

### 4. Insert Elements to LinkedHashMap:

You can insert elements into a `LinkedHashMap` using the `put` method:

```java
import java.util.LinkedHashMap;

public class InsertElementsToLinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Insert elements
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // Printing the LinkedHashMap
        System.out.println(linkedHashMap);
    }
}
```

### 5. Access LinkedHashMap Elements:

You can access elements in a `LinkedHashMap` using the `get` method:

```java
import java.util.LinkedHashMap;

public class AccessLinkedHashMapElementsExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);

        // Access elements
        int valueOne = linkedHashMap.get("One");
        int valueTwo = linkedHashMap.get("Two");

        System.out.println("Value of 'One': " + valueOne);
        System.out.println("Value of 'Two': " + valueTwo);
    }
}
```

### 6. Remove LinkedHashMap Elements:

You can remove elements from a `LinkedHashMap` using the `remove` method:

```java
import java.util.LinkedHashMap;

public class RemoveLinkedHashMapElementsExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);

        // Remove an element
        linkedHashMap.remove("One");

        // Printing the updated LinkedHashMap
        System.out.println(linkedHashMap);
    }
}
```

### 7. Other Methods of LinkedHashMap:

Here are some other commonly used methods of `LinkedHashMap`:

```java
import java.util.LinkedHashMap;

public class OtherLiGZ6EKp4WNQvrE3oY5TZc2dvaSvkBDMEe {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Clear the LinkedHashMap
        linkedHashMap.clear();

        // Check if a key is present
        boolean containsKey = linkedHashMap.containsKey("One");

        // Check if a value is present
        boolean containsValue = linkedHashMap.containsValue(1);

        // Get the size of the LinkedHashMap
        int size = linkedHashMap.size();

        // Check if the LinkedHashMap is empty
        boolean isEmpty = linkedHashMap.isEmpty();
    }
}
```

### 8. LinkedHashMap Vs. HashMap:

Here's an example illustrating the difference between `LinkedHashMap` and `HashMap` regarding element order:

```java
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapVsHashMapExample {
    public static void main(String[] args) {
        // HashMap does not maintain order
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);

        // LinkedHashMap maintains insertion order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);

        System.out.println("HashMap:");
        System.out.println(hashMap);

        System.out.println("LinkedHashMap:");
        System.out.println(linkedHashMap);
    }
}
```

In this example, the `HashMap` does not guarantee any specific order, while the `LinkedHashMap` maintains the insertion order of elements.