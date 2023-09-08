# Java EnumMap



### What is Java EnumMap?

An `EnumMap` in Java is a specialized implementation of the `Map` interface that is designed to work exclusively with enum keys. It is highly efficient and provides performance benefits when working with enums as keys. Enum maps are ordered according to the natural order of the keys (the order in which the enum constants are declared).

### Creating an EnumMap

To create an `EnumMap`, you specify the enum type as its key type during construction. Here's how you can create an `EnumMap` for an enum type called `Day`:

```java
import java.util.EnumMap;

public class EnumMapExample {
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        
        // Insert elements into the EnumMap
        enumMap.put(Day.MONDAY, "Start of the week");
        enumMap.put(Day.FRIDAY, "End of the week");
        
        // Access elements
        String message = enumMap.get(Day.MONDAY);
        System.out.println("Message for Monday: " + message);
    }
}
```

### Methods of EnumMap

#### Insert Elements to EnumMap

1. `put(K key, V value)` - Inserts the specified key-value mapping (entry) to the enum map.

```java
enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public static void main(String[] args) {
    EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
    
    enumMap.put(Day.MONDAY, "Start of the week");
    enumMap.put(Day.FRIDAY, "End of the week");
}
```

2. `putAll(Map<? extends K, ? extends V> m)` - Inserts all the entries of a specified map to this map.

```java
import java.util.HashMap;
import java.util.Map;

enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public static void main(String[] args) {
    EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
    
    Map<Day, String> otherMap = new HashMap<>();
    otherMap.put(Day.MONDAY, "Start of the week");
    otherMap.put(Day.FRIDAY, "End of the week");
    
    enumMap.putAll(otherMap);
}
```

#### Access EnumMap Elements

1. Using `entrySet()`, `keySet()`, and `values()`:

   - `entrySet()` - Returns a set of all the keys/values mapping (entry) of an enum map.
   - `keySet()` - Returns a set of all the keys of an enum map.
   - `values()` - Returns a set of all the values of an enum map.

```java
EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
enumMap.put(Day.MONDAY, "Start of the week");
enumMap.put(Day.FRIDAY, "End of the week");

// Using entrySet()
for (Map.Entry<Day, String> entry : enumMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

// Using keySet()
for (Day day : enumMap.keySet()) {
    System.out.println("Day: " + day);
}

// Using values()
for (String value : enumMap.values()) {
    System.out.println("Value: " + value);
}
```

2. Using the `get()` Method:

```java
String message = enumMap.get(Day.MONDAY);
System.out.println("Message for Monday: " + message);
```

#### Remove EnumMap Elements

1. `remove(K key)` - Returns and removes the entry associated with the specified key from the map.

```java
String removedValue = enumMap.remove(Day.FRIDAY);
System.out.println("Removed value for Friday: " + removedValue);
```

2. `remove(K key, V value)` - Removes the entry from the map only if the specified key maps to the specified value and returns a boolean value.

```java
boolean removed = enumMap.remove(Day.MONDAY, "Start of the week");
System.out.println("Was Monday removed? " + removed);
```

#### Replace EnumMap Elements

1. `replace(K key, V value)` - Replaces the value associated with the specified key with the new value.

```java
enumMap.replace(Day.MONDAY, "New start of the week");
```

2. `replace(K key, V oldValue, V newValue)` - Replaces the old value with the new value only if the old value is already associated with the specified key.

```java
boolean replaced = enumMap.replace(Day.MONDAY, "Start of the week", "New start of the week");
System.out.println("Was Monday's value replaced? " + replaced);
```

3. `replaceAll(BiFunction<? super K,? super V,? extends V> function)` - Replaces each value of the map with the result of the specified function.

```java
enumMap.replaceAll((key, oldValue) -> "New Value");
```

#### Other Methods

- `clone()` - Creates a copy of the EnumMap.

```java
EnumMap<Day, String> copyEnumMap = enumMap.clone();
```

- `containsKey(Object key)` - Searches the EnumMap for the specified key and returns a boolean result.

```java
boolean containsKey = enumMap.containsKey(Day.MONDAY);
```

- `containsValue(Object value)` - Searches the EnumMap for the specified value and returns a boolean result.

```java
boolean containsValue = enumMap.containsValue("New start of the week");
```

- `size()` - Returns the size of the EnumMap.

```java
int size = enumMap.size();
```

- `clear()` - Removes all the entries from the EnumMap.

```java
enumMap.clear();
```
