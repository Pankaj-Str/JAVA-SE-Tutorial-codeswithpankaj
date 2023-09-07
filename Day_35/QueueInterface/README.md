# Java Queue Interface

The `Queue` interface in Java is part of the Java Collections Framework and represents a linear collection of elements where elements are inserted and removed according to the first-in, first-out (FIFO) principle. In other words, the element that has been in the queue the longest is the first one to be removed. The `Queue` interface extends the `Collection` interface and provides methods for adding, removing, and inspecting elements in the queue.

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