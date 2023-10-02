# Java Vector
`Vector` is a legacy collection class in Java that is part of the Java Collections Framework. It's similar to an `ArrayList`, but with a few key differences:

1. **Synchronization:** `Vector` is synchronized by default, which means it is thread-safe. Multiple threads can safely access and modify a `Vector` without causing data corruption. This makes `Vector` suitable for scenarios where thread safety is a concern. In contrast, `ArrayList` is not synchronized, so you need to manually synchronize it if multiple threads access it concurrently.

2. **Performance:** Because of its synchronization, `Vector` can be slower than `ArrayList` in single-threaded applications. In situations where you don't need thread safety, `ArrayList` is often preferred for its better performance.


## Creating a Vector
Here is how we can create vectors in Java.
```java

Vector<Type> vector = new Vector<>();
// Here, Type indicates the type of a linked list. For example,

// create Integer type linked list
Vector<Integer> vector= new Vector<>();

// create String type linked list
Vector<String> vector= new Vector<>();

```

Here's an example of how to use a `Vector`:

```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> names = new Vector<>();

        // Add elements to the Vector
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements in the Vector
        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);

        // Iterating over the Vector using a for-each loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
```

In this example, we create a `Vector` of strings, add elements to it, access elements by index, and iterate through the `Vector` using a for-each loop.

It's worth noting that in modern Java development, `ArrayList` is typically preferred over `Vector` due to its better performance in single-threaded applications. If thread safety is required, you can use `Collections.synchronizedList()` to wrap an `ArrayList` and make it thread-safe.


## Add Elements to Vector


1. **Adding an Element to a Vector using `add(element)`**:

```java
import java.util.Vector;

public class AddElementToVector {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();

        // Add elements to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the Vector
        System.out.println("Vector: " + numbers);
    }
}
```

2. **Adding an Element at a Specific Position using `add(index, element)`**:

```java
import java.util.Vector;

public class AddElementAtIndexInVector {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();

        // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");

        // Add an element at a specific position (index 1)
        fruits.add(1, "Cherry");

        // Print the Vector
        System.out.println("Vector: " + fruits);
    }
}
```

3. **Adding All Elements of One Vector to Another using `addAll(vector)`**:

```java
import java.util.Vector;

public class AddAllElementsToVector {
    public static void main(String[] args) {
        // Create two Vectors of integers
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(3);
        vector2.add(4);

        // Add all elements of vector2 to vector1
        vector1.addAll(vector2);

        // Print the combined Vector
        System.out.println("Combined Vector: " + vector1);
    }
}
```

Certainly, here are examples of accessing elements in a `Vector` using the `get(index)` method and the `iterator()` method:

1. **Accessing an Element by Index using `get(index)`**:

```java
import java.util.Vector;

public class AccessElementInVector {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Access elements in the Vector by index
        String firstColor = colors.get(0);
        String secondColor = colors.get(1);
        String thirdColor = colors.get(2);

        // Print the accessed elements
        System.out.println("First color: " + firstColor);
        System.out.println("Second color: " + secondColor);
        System.out.println("Third color: " + thirdColor);
    }
}
```

## Access Vector Elements

1. **Accessing Vector Elements using an Iterator with `iterator()`**:

```java
import java.util.Iterator;
import java.util.Vector;

public class AccessVectorElementsWithIterator {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Obtain an iterator to access Vector elements
        Iterator<Integer> iterator = numbers.iterator();

        // Use the iterator to sequentially access and print elements
        System.out.print("Vector elements: ");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
```

## Others Vector Methods


1. **Changing an Element in a Vector using `set(index, element)`**:

```java
import java.util.Vector;

public class VectorSetExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Change an element in the Vector
        numbers.set(1, 25);

        // Print the updated Vector
        System.out.println("Updated Vector: " + numbers);
    }
}
```

In this example, we create a `Vector` of integers called `numbers` and use the `set(index, element)` method to change an element at index 1 from 20 to 25.

2. **Getting the Size of a Vector using `size()`**:

```java
import java.util.Vector;

public class VectorSizeExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Get the size of the Vector
        int size = fruits.size();

        // Print the size of the Vector
        System.out.println("Size of the Vector: " + size);
    }
}
```

In this example, we create a `Vector` of strings called `fruits` and use the `size()` method to get the number of elements in the `Vector`.

3. **Converting a Vector to an Array using `toArray()`**:

```java
import java.util.Vector;

public class VectorToArrayExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Convert the Vector to an array
        Integer[] numbersArray = numbers.toArray(new Integer[numbers.size()]);

        // Print the array
        System.out.print("Array: ");
        for (Integer number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
```

In this example, we create a `Vector` of integers called `numbers` and use the `toArray()` method to convert it into an array.

4. **Converting a Vector to a String using `toString()`**:

```java
import java.util.Vector;

public class VectorToStringExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Convert the Vector to a String
        String colorsString = colors.toString();

        // Print the String representation
        System.out.println("Vector as String: " + colorsString);
    }
}
```

In this example, we create a `Vector` of strings called `colors` and use the `toString()` method to convert it into a String.

5. **Searching a Vector for a Specified Element using `contains(element)`**:

```java
import java.util.Vector;

public class VectorContainsExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Check if the Vector contains a specific element
        boolean containsTwenty = numbers.contains(20);

        // Print the result
        System.out.println("Vector contains 20: " + containsTwenty);
    }
}
```

