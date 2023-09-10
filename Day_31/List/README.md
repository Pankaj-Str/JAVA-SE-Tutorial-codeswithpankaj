# Classes that Implement List

Since List is an interface, we cannot create objects from it.

```scss
              +---------+
              |   List  |
              +---------+
       /           |           \
      /            |            \
     /             |             \
 +---------+  +---------+    +------+
 |ArrayList|  |LinkedList|   |Vector|
 +----------+ +----------+   +------+

```


In order to use functionalities of the List interface, we can use these classes:
    
1. ArrayList
2. LinkedList
3. Vector
4. Stack

### How to use List?

In Java, we must import java.util.List package in order to use List.
```java
// ArrayList implementation of List
List<String> list1 = new ArrayList<>();

// LinkedList implementation of List
List<String> list2 = new LinkedList<>();
```
##  Methods of List

1. **add():**
   ```java
   List<String> fruits = new ArrayList<>();
   fruits.add("Apple");
   fruits.add("Banana");
   fruits.add("Cherry");
   ```

2. **addAll():**
   ```java
   List<String> sourceList = new ArrayList<>();
   sourceList.add("Orange");
   sourceList.add("Grapes");

   List<String> destinationList = new ArrayList<>();
   destinationList.addAll(sourceList);
   ```

3. **get():**
   ```java
   String fruit = fruits.get(1); // Retrieves the second element ("Banana")
   ```

4. **iterator():**
   ```java
   Iterator<String> iterator = fruits.iterator();
   while (iterator.hasNext()) {
       String fruit = iterator.next();
       System.out.println(fruit);
   }
   ```

5. **set():**
   ```java
   fruits.set(1, "Mango"); // Replaces "Banana" with "Mango" at index 1
   ```

6. **remove():**
   ```java
   fruits.remove(0); // Removes the first element ("Apple")
   ```

7. **removeAll():**
   ```java
   List<String> toRemove = Arrays.asList("Apple", "Cherry");
   fruits.removeAll(toRemove); // Removes "Apple" and "Cherry" if present
   ```

8. **clear():**
   ```java
   fruits.clear(); // Removes all elements from the list
   ```

9. **size():**
   ```java
   int size = fruits.size(); // Returns the number of elements in the list
   ```

10. **toArray():**
    ```java
    String[] fruitArray = fruits.toArray(new String[0]);
    ```

11. **contains():**
    ```java
    boolean containsBanana = fruits.contains("Banana"); // Returns true if "Banana" is in the list
    ```
## Implementation of the List Interface

Implementing your own version of the `ArrayList` class is a complex task and requires a good understanding of data structures and memory management in Java. Here's a simplified version of an `ArrayList` class to help you get started. This implementation does not handle all edge cases and optimizations that the built-in `ArrayList` in Java provides but should give you a basic idea:

```java

import java.util.Arrays;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity cannot be negative");
        }
        elements = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // Let the garbage collector clean up
        return removedElement;
    }

    public boolean remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
```

This `MyArrayList` class provides a simplified version of the basic functionality of an `ArrayList`. You can use it as follows:

```java
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Size: " + list.size());
        System.out.println("Elements: " + list);
    }
}
```

Please note that this implementation lacks many features and optimizations present in the standard `ArrayList` class, such as dynamic resizing, concurrent access handling, and iterator support. Creating a fully functional and efficient `ArrayList` is a non-trivial task and is typically not necessary as the built-in `ArrayList` provided by Java is highly optimized and efficient for most use cases.

## Implementing the ArrayList Class

```java

import java.util.List;
import java.util.ArrayList;

class cwp {

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}


```

##  Implementing the LinkedList Class

```java

import java.util.List;
import java.util.LinkedList;

class cwp {

    public static void main(String[] args) {
        // Creating list using the LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}


```
