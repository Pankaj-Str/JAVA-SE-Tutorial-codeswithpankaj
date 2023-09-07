# Java Map
1. Java Map Interface
2. Java HashMap
3. Java LinkedHashMap
4. Java WeakHashMap
5. Java EnumMap
6. Java SortedMap Interface
7. Java NavigableMap Interface
8. Java TreeMap
9. Java ConcurrentMap Interface
10. Java ConcurrentHashMap


1. **Java Map Interface:**
   
   The `Map` interface in Java represents a collection of key-value pairs where each key is associated with exactly one value. It does not allow duplicate keys, and it is implemented by various classes like `HashMap`, `TreeMap`, etc.

   Example:
   ```java
   Map<String, Integer> studentGrades = new HashMap<>();
   studentGrades.put("Alice", 95);
   studentGrades.put("Bob", 88);
   studentGrades.put("Charlie", 92);

   int aliceGrade = studentGrades.get("Alice");
   System.out.println("Alice's grade: " + aliceGrade);
   ```

2. **Java HashMap:**

   `HashMap` is one of the most commonly used implementations of the `Map` interface. It uses a hash table for storing key-value pairs and provides constant-time average complexity for basic operations like `put` and `get`.

   Example:
   ```java
   HashMap<String, Integer> population = new HashMap<>();
   population.put("New York", 8405837);
   population.put("Los Angeles", 3884307);
   population.put("Chicago", 2716000);

   int nyPopulation = population.get("New York");
   System.out.println("Population of New York: " + nyPopulation);
   ```

3. **Java LinkedHashMap:**

   `LinkedHashMap` is similar to `HashMap` but maintains the order of insertion. It guarantees predictable iteration order.

   Example:
   ```java
   LinkedHashMap<String, Integer> months = new LinkedHashMap<>();
   months.put("January", 31);
   months.put("February", 28);
   months.put("March", 31);

   for (Map.Entry<String, Integer> entry : months.entrySet()) {
       System.out.println(entry.getKey() + " has " + entry.getValue() + " days.");
   }
   ```

4. **Java WeakHashMap:**

   `WeakHashMap` is an implementation of the `Map` interface where the keys are held using weak references. This means that if a key is no longer strongly referenced elsewhere, it can be garbage collected.

   Example:
   ```java
   WeakHashMap<String, Integer> cache = new WeakHashMap<>();
   String key = new String("key"); // Creating a key as a String
   cache.put(key, 42);

   key = null; // Remove the strong reference to the key
   System.gc(); // Suggest garbage collection

   // At this point, the key-value pair may be removed from the WeakHashMap
   ```

5. **Java EnumMap:**

   `EnumMap` is a specialized `Map` implementation designed for use with enum keys. It provides high performance and type safety when working with enums.

   Example:
   ```java
   enum Days { MONDAY, TUESDAY, WEDNESDAY }
   EnumMap<Days, String> schedule = new EnumMap<>(Days.class);
   schedule.put(Days.MONDAY, "Meeting");
   schedule.put(Days.TUESDAY, "Gym");
   ```

6. **Java SortedMap Interface:**

   `SortedMap` is an interface that extends `Map` and guarantees that the keys are stored in sorted order.

   Example (using `TreeMap`, an implementation of `SortedMap`):
   ```java
   TreeMap<String, Integer> sortedMap = new TreeMap<>();
   sortedMap.put("C", 3);
   sortedMap.put("A", 1);
   sortedMap.put("B", 2);

   System.out.println(sortedMap); // Output: {A=1, B=2, C=3}
   ```

7. **Java NavigableMap Interface:**

   `NavigableMap` is an interface that extends `SortedMap` and provides methods for navigating through the map in a sorted manner.

   Example (using `TreeMap`, which also implements `NavigableMap`):
   ```java
   TreeMap<String, Integer> treeMap = new TreeMap<>();
   treeMap.put("Apple", 5);
   treeMap.put("Banana", 3);
   treeMap.put("Cherry", 8);

   Map.Entry<String, Integer> lowerEntry = treeMap.lowerEntry("Banana");
   System.out.println("Entry before Banana: " + lowerEntry.getKey() + "=" + lowerEntry.getValue());
   ```

8. **Java TreeMap:**

   `TreeMap` is an implementation of `SortedMap` that uses a red-black tree to maintain key-value pairs in sorted order.

   Example:
   ```java
   TreeMap<Integer, String> students = new TreeMap<>();
   students.put(101, "Alice");
   students.put(102, "Bob");
   students.put(103, "Charlie");

   System.out.println(students.firstEntry()); // Output: 101=Alice
   ```

9. **Java ConcurrentMap Interface:**

   `ConcurrentMap` is an interface that provides thread-safe operations for `Map` implementations. It includes methods to support concurrent access.

   Example (often used with `ConcurrentHashMap`):
   ```java
   ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
   concurrentMap.put("John", 25);
   concurrentMap.put("Jane", 30);

   int johnsAge = concurrentMap.get("John");
   System.out.println("John's age: " + johnsAge);
   ```

10. **Java ConcurrentHashMap:**

    `ConcurrentHashMap` is a thread-safe implementation of `Map` that allows multiple threads to access and modify the map concurrently without the need for explicit synchronization.

    Example:
    ```java
    ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();
    scores.put("Alice", 95);
    scores.put("Bob", 88);

    int aliceScore = scores.get("Alice");
    System.out.println("Alice's score: " + aliceScore);
    ```

