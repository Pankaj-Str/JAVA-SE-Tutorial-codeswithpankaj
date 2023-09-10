# Java Deque Interface

The `Deque` (Double-ended Queue) interface in Java is part of the Java Collections Framework and represents a linear collection of elements that supports adding and removing elements from both ends of the collection. It extends the `Queue` interface and provides additional methods for stack-like (LIFO) and queue-like (FIFO) operations.

```scss

  +------------+
  |   Deque    |
  +------------+
          |
          |  Extends
          |
  +------------+
  |   Queue    |
  +------------+
          |
          |  Extends
          |
  +------------+
  |  Collection|
  +------------+
          |
          |  Methods
          |
  +------------+
  | - add(E e)          |
  | - offer(E e)        |
  | - remove()          |
  | - poll()            |
  | - element()         |
  | - peek()            |
  | - addFirst(E e)     |
  | - offerFirst(E e)   |
  | - removeFirst()     |
  | - pollFirst()       |
  | - getFirst()        |
  | - addLast(E e)      |
  | - offerLast(E e)    |
  | - removeLast()      |
  | - pollLast()        |
  | - getLast()         |
  | - size()            |
  | - isEmpty()         |
  | - contains(Object o)|
  | - clear()           |
  | - iterator()        |
  +---------------------+


```

Key characteristics and methods of the `Deque` interface include:

**Characteristics:**
- Elements can be added and removed from both the front and back of the deque.
- It can contain duplicates.
- It allows null elements.

**Common Methods:**

1. **Adding Elements:**
   - `addFirst(element)`: Inserts an element at the front of the deque. Throws an exception on failure.
   - `offerFirst(element)`: Inserts an element at the front of the deque. Returns `true` on success, `false` on failure.
   - `addLast(element)`: Inserts an element at the end of the deque. Throws an exception on failure.
   - `offerLast(element)`: Inserts an element at the end of the deque. Returns `true` on success, `false` on failure.

2. **Removing Elements:**
   - `removeFirst()`: Removes and returns the element at the front of the deque. Throws an exception if the deque is empty.
   - `pollFirst()`: Removes and returns the element at the front of the deque. Returns `null` if the deque is empty.
   - `removeLast()`: Removes and returns the element at the end of the deque. Throws an exception if the deque is empty.
   - `pollLast()`: Removes and returns the element at the end of the deque. Returns `null` if the deque is empty.

3. **Accessing Elements:**
   - `getFirst()`: Retrieves, but does not remove, the element at the front of the deque. Throws an exception if the deque is empty.
   - `peekFirst()`: Retrieves, but does not remove, the element at the front of the deque. Returns `null` if the deque is empty.
   - `getLast()`: Retrieves, but does not remove, the element at the end of the deque. Throws an exception if the deque is empty.
   - `peekLast()`: Retrieves, but does not remove, the element at the end of the deque. Returns `null` if the deque is empty.

The `Deque` interface has several implementations in Java, including `ArrayDeque` and `LinkedList`, each with its own characteristics and use cases.

Here's a simple example of using the `Deque` interface with an `ArrayDeque` implementation:

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque of integers using an ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the front and end of the deque
        deque.addFirst(10);
        deque.offerLast(20);
        deque.addFirst(5);

        // Access and print elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Remove and print elements
        while (!deque.isEmpty()) {
            int removedElement = deque.pollFirst();
            System.out.println("Removed: " + removedElement);
        }
    }
}
```

In this example:

- We create a `Deque` of integers using an `ArrayDeque` implementation.
- We demonstrate the use of various `Deque` methods for adding, removing, and accessing elements from both ends of the deque.


