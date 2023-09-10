# Java Queue Interface

The `Queue` interface in Java is part of the Java Collections Framework and represents a linear collection of elements where elements are inserted and removed according to the first-in, first-out (FIFO) principle. In other words, the element that has been in the queue the longest is the first one to be removed. The `Queue` interface extends the `Collection` interface and provides methods for adding, removing, and inspecting elements in the queue.

![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/a9ccdaed-a415-49ad-b2cf-3185ece5d5fc)

Here's a simplified flowchart for the `Queue` interface:

```plaintext
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
  | - size()            |
  | - isEmpty()         |
  | - contains(Object o)|
  | - clear()           |
  | - iterator()        |
  +---------------------+
```


Here's a brief explanation of some key methods:

- `add(E e)`: Adds an element to the queue (throws an exception if the queue is full).
- `offer(E e)`: Adds an element to the queue (returns `false` if the queue is full).
- `remove()`: Removes and returns the head of the queue (throws an exception if the queue is empty).
- `poll()`: Removes and returns the head of the queue (returns `null` if the queue is empty).
- `element()`: Returns the head of the queue (throws an exception if the queue is empty).
- `peek()`: Returns the head of the queue (returns `null` if the queue is empty).
- `size()`: Returns the number of elements in the queue.
- `isEmpty()`: Checks if the queue is empty.
- `contains(Object o)`: Checks if the queue contains a specific element.
- `clear()`: Removes all elements from the queue.
- `iterator()`: Returns an iterator over the elements in the queue.

#### Example :


```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // 1. Adding elements
        queue.add("First");
        queue.offer("Second");

        // 2. Removing and returning the head of the queue
        try {
            String removedElement1 = queue.remove();
            System.out.println("Removed element: " + removedElement1);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Queue is empty.");
        }

        String removedElement2 = queue.poll();
        System.out.println("Removed element (poll): " + (removedElement2 != null ? removedElement2 : "Queue is empty."));

        // 3. Retrieving the head of the queue
        try {
            String element = queue.element();
            System.out.println("Element at the head: " + element);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Queue is empty.");
        }

        String peekedElement = queue.peek();
        System.out.println("Peeked element: " + (peekedElement != null ? peekedElement : "Queue is empty."));

        // 4. Getting the size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);

        // 5. Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // 6. Checking if the queue contains a specific element
        boolean containsElement = queue.contains("Third");
        System.out.println("Does the queue contain 'Third'? " + containsElement);

        // 7. Clearing the queue
        queue.clear();
        System.out.println("Queue cleared.");

        // 8. Creating an iterator and iterating over elements
        queue.add("A");
        queue.add("B");
        queue.add("C");

        Iterator<String> iterator = queue.iterator();
        System.out.println("Iterating over elements:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
```

## How to use Queue?
In Java, we must import java.util.Queue package in order to use Queue.

```java
// LinkedList implementation of Queue
Queue<String> animal1 = new LinkedList<>();

// Array implementation of Queue
Queue<String> animal2 = new ArrayDeque<>();

// Priority Queue implementation of Queue
Queue<String> animal 3 = new PriorityQueue<>();

```

Some common methods defined by the `Queue` interface include:

1. `add(element)`: Adds an element to the end of the queue. Throws an exception if the operation fails.

2. `offer(element)`: Adds an element to the end of the queue. Returns `true` if the operation succeeds, `false` otherwise.

3. `remove()`: Removes and returns the element at the front of the queue. Throws an exception if the queue is empty.

4. `poll()`: Removes and returns the element at the front of the queue. Returns `null` if the queue is empty.

5. `element()`: Retrieves, but does not remove, the element at the front of the queue. Throws an exception if the queue is empty.

6. `peek()`: Retrieves, but does not remove, the element at the front of the queue. Returns `null` if the queue is empty.

The `Queue` interface has several implementations in Java, including `LinkedList`, `PriorityQueue`, and `ArrayDeque`, each with its own characteristics and use cases.

Here's a simple example of using the `Queue` interface with a `LinkedList` implementation:

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of strings using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the end of the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Remove and print elements from the front of the queue
        while (!queue.isEmpty()) {
            String removedElement = queue.poll();
            System.out.println("Removed: " + removedElement);
        }
    }
}
```

In this example, we create a `Queue` of strings using a `LinkedList` implementation and demonstrate the use of common `Queue` methods like `add`, `peek`, and `poll` to manipulate and inspect elements in the queue.
