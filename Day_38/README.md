# Java ArrayDeque

The `ArrayDeque` class in Java is part of the Java Collections Framework and implements the `Deque` interface. It represents a resizable array-based double-ended queue (deque), which means it can be used as both a stack (LIFO) and a queue (FIFO). Unlike `LinkedList`, which uses a linked structure, `ArrayDeque` uses a dynamic array to store elements, providing efficient random access and resizing when needed.


```
  +------------------+
  |   ArrayDeque    |
  +------------------+
          |
          |  Extends
          |
  +------------------+
  |   AbstractCollection |
  +------------------+
          |
          |  Implements
          |
  +------------------+
  |      Deque       |
  +------------------+
          |
          |  Methods
          |
  +------------------+
  | - addFirst(E e)  |
  | - addLast(E e)   |
  | - offerFirst(E e)|
  | - offerLast(E e) |
  | - removeFirst()  |
  | - removeLast()   |
  | - pollFirst()    |
  | - pollLast()     |
  | - getFirst()     |
  | - getLast()      |
  | - peekFirst()    |
  | - peekLast()     |
  | - push(E e)      |
  | - pop()          |
  | - size()         |
  | - isEmpty()      |
  | - clear()        |
  | - iterator()     |
  +------------------+
```


1. Adding elements:
   - `addFirst(E e)`: Adds an element to the front of the deque.
     ```java
     deque.addFirst("First");
     ```

   - `addLast(E e)`: Adds an element to the end of the deque.
     ```java
     deque.addLast("Last");
     ```

2. Removing elements:
   - `removeFirst()`: Removes and returns the first element.
     ```java
     String first = deque.removeFirst();
     ```

   - `removeLast()`: Removes and returns the last element.
     ```java
     String last = deque.removeLast();
     ```

3. Peeking at elements:
   - `getFirst()`: Returns the first element without removing it.
     ```java
     String first = deque.getFirst();
     ```

   - `getLast()`: Returns the last element without removing it.
     ```java
     String last = deque.getLast();
     ```

4. Checking size and emptiness:
   - `size()`: Returns the number of elements in the deque.
     ```java
     int size = deque.size();
     ```

   - `isEmpty()`: Checks if the deque is empty.
     ```java
     boolean isEmpty = deque.isEmpty();
     ```

5. Clearing the deque:
   - `clear()`: Removes all elements from the deque.
     ```java
     deque.clear();
     ```




**Characteristics:**
- Resizable array-based structure.
- Supports duplicate elements.
- Allows null elements.

**Common Methods:**

1. **Adding Elements:**
   - `add(element)`: Adds an element to the end of the deque.
   - `addFirst(element)`: Adds an element to the beginning of the deque.
   - `addLast(element)`: Adds an element to the end of the deque.
   - `offer(element)`: Adds an element to the end of the deque. Returns `true` on success, `false` if full.
   - `offerFirst(element)`: Adds an element to the beginning of the deque. Returns `true` on success, `false` if full.
   - `offerLast(element)`: Adds an element to the end of the deque. Returns `true` on success, `false` if full.

2. **Removing Elements:**
   - `remove()`: Removes and returns the first element in the deque.
   - `removeFirst()`: Removes and returns the first element in the deque.
   - `removeLast()`: Removes and returns the last element in the deque.
   - `poll()`: Removes and returns the first element in the deque. Returns `null` if empty.
   - `pollFirst()`: Removes and returns the first element in the deque. Returns `null` if empty.
   - `pollLast()`: Removes and returns the last element in the deque. Returns `null` if empty.

3. **Accessing Elements:**
   - `getFirst()`: Returns the first element in the deque.
   - `getLast()`: Returns the last element in the deque.
   - `peek()`: Retrieves the first element in the deque without removing it. Returns `null` if empty.
   - `peekFirst()`: Retrieves the first element in the deque without removing it. Returns `null` if empty.
   - `peekLast()`: Retrieves the last element in the deque without removing it. Returns `null` if empty.

4. **Size and Check:**
   - `size()`: Returns the number of elements in the deque.
   - `isEmpty()`: Checks if the deque is empty.

Here's a simple example of using `ArrayDeque`:

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the end
        deque.add(10);
        deque.add(20);
        deque.add(30);

        // Adding elements at the beginning
        deque.addFirst(5);

        // Accessing elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Removing elements
        deque.removeFirst();
        deque.removeLast();

        // Iterating through elements
        System.out.print("ArrayDeque: ");
        for (int element : deque) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
```

In this example:

- We create an `ArrayDeque` of integers and perform operations such as adding, removing, and accessing elements from both ends of the deque.
- The `ArrayDeque` is used to demonstrate its functionality as both a double-ended queue (deque) and a queue.
