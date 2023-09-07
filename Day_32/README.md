# Java Queue

1. Java Queue Interface
2. Java PriorityQueue Interface
3. Java Deque Interface
4. Java LinkedList
5. Java ArrayDeque
6. Java BlockingQueue Interface
7. Java ArrayBlockingQueue
8. Java LinkedBlockingQueue

# Java Queue Interface

The `java.util.Queue` interface is part of the Java Collections Framework and represents a linear data structure that follows the "First-In-First-Out" (FIFO) order. In other words, the element that is added first will be the first one to be removed. The `Queue` interface provides a set of methods for working with queues. It extends the `java.util.Collection` interface and adds specific queue-related operations.

Here are some of the key methods and behaviors provided by the `Queue` interface:

1. **Adding Elements**:
   - `boolean add(E e)`: Adds an element to the end of the queue. If the queue is full (for bounded queues), it throws an exception.
   - `boolean offer(E e)`: Adds an element to the end of the queue. Returns `true` if the operation was successful, `false` if the queue is full.

2. **Removing Elements**:
   - `E remove()`: Removes and returns the element at the front of the queue. Throws an exception if the queue is empty.
   - `E poll()`: Removes and returns the element at the front of the queue. Returns `null` if the queue is empty.
   - `E element()`: Retrieves, but does not remove, the element at the front of the queue. Throws an exception if the queue is empty.
   - `E peek()`: Retrieves, but does not remove, the element at the front of the queue. Returns `null` if the queue is empty.

3. **Size and Empty**:
   - `int size()`: Returns the number of elements in the queue.
   - `boolean isEmpty()`: Returns `true` if the queue is empty, `false` otherwise.

The `Queue` interface is typically implemented by classes like `LinkedList`, `ArrayDeque`, and `PriorityQueue`. Each of these classes provides different characteristics and performance trade-offs.

Here's an example of using the `Queue` interface with a `LinkedList`:

```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Removing and printing elements
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }
    }
}
```
#  PriorityQueue Interface

The `java.util.PriorityQueue` class is part of the Java Collections Framework and implements the `Queue` interface. It represents a priority queue, which is a data structure that stores elements in a way that allows for efficient retrieval of the highest-priority element. The elements are ordered based on their natural ordering or a specified comparator.

Key features of the `PriorityQueue` class:

1. **Priority Ordering**: Elements in a `PriorityQueue` are ordered according to their natural ordering (if they implement the `Comparable` interface) or by a specified comparator when the `PriorityQueue` is constructed. Elements with higher priority values are dequeued before elements with lower priority values.

2. **Efficient Operations**: Priority queues are efficient at retrieving and removing the element with the highest priority. The time complexity for adding elements (`offer`) is O(log n), and the time complexity for removing the highest-priority element (`poll`) is O(log n), where n is the number of elements in the queue.

3. **Not Thread-Safe**: `PriorityQueue` is not thread-safe by default. If you need thread safety, you can wrap it with `Collections.synchronizedQueue()`.

Here's an example of using `PriorityQueue`:

```java
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create a priority queue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);

        // Poll elements in priority order (ascending order)
        while (!priorityQueue.isEmpty()) {
            System.out.println("Popped: " + priorityQueue.poll());
        }
    }
}
```

In this example, we create a `PriorityQueue` of integers. The elements are added using `offer`, and they are automatically ordered in ascending order because integers have a natural ordering. The `poll` method removes and returns the elements in priority order.

You can also create a `PriorityQueue` with a custom comparator to change the order. For example, if you want to create a max heap (highest priority element at the front), you can do so by providing a custom comparator:

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

This reverses the natural ordering and creates a max heap.

# Java Deque Interface 

The `java.util.Deque` interface, short for "Double Ended Queue," is part of the Java Collections Framework and extends the `Queue` interface. A `Deque` is a linear data structure that allows elements to be added or removed from both ends, providing the functionality of both a stack and a queue. You can think of it as a double-ended queue.

The `Deque` interface provides methods for adding, removing, and inspecting elements from both the front (head) and the back (tail) of the queue. Some of the key methods provided by the `Deque` interface include:

1. **Adding Elements**:
   - `void addFirst(E e)`: Adds an element to the front of the deque. Throws an exception if the operation fails.
   - `void addLast(E e)`: Adds an element to the end of the deque. Throws an exception if the operation fails.
   - `boolean offerFirst(E e)`: Adds an element to the front of the deque. Returns `true` if the operation was successful, `false` if it fails.
   - `boolean offerLast(E e)`: Adds an element to the end of the deque. Returns `true` if the operation was successful, `false` if it fails.

2. **Removing Elements**:
   - `E removeFirst()`: Removes and returns the element at the front of the deque. Throws an exception if the deque is empty.
   - `E removeLast()`: Removes and returns the element at the end of the deque. Throws an exception if the deque is empty.
   - `E pollFirst()`: Removes and returns the element at the front of the deque. Returns `null` if the deque is empty.
   - `E pollLast()`: Removes and returns the element at the end of the deque. Returns `null` if the deque is empty.

3. **Inspecting Elements**:
   - `E getFirst()`: Retrieves, but does not remove, the element at the front of the deque. Throws an exception if the deque is empty.
   - `E getLast()`: Retrieves, but does not remove, the element at the end of the deque. Throws an exception if the deque is empty.
   - `E peekFirst()`: Retrieves, but does not remove, the element at the front of the deque. Returns `null` if the deque is empty.
   - `E peekLast()`: Retrieves, but does not remove, the element at the end of the deque. Returns `null` if the deque is empty.

The `Deque` interface is implemented by classes such as `LinkedList` and `ArrayDeque`. You can choose the appropriate implementation based on your specific needs.

Here's an example of using the `Deque` interface with a `LinkedList`:

```java
import java.util.LinkedList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the front and back of the deque
        deque.addFirst("Front");
        deque.addLast("Back");

        // Removing elements from the front and back
        String frontElement = deque.removeFirst();
        String backElement = deque.removeLast();

        System.out.println("Front Element: " + frontElement); // Output: Front Element: Front
        System.out.println("Back Element: " + backElement);   // Output: Back Element: Back
    }
}
```

In this example, we create a `Deque` using a `LinkedList`. We add elements to both the front and back of the deque using `addFirst` and `addLast`. Then, we remove elements from both ends using `removeFirst` and `removeLast`. The `Deque` allows for flexible operations on both ends of the queue-like structure.

# Java LinkedList

In Java, `LinkedList` is a class that implements the `List` interface and represents a doubly-linked list data structure. Unlike arrays, which have a fixed size, a `LinkedList` can dynamically grow or shrink as elements are added or removed. Each element in a `LinkedList` is called a "node," and each node contains a reference to the previous and next nodes in the list.

Here are some key characteristics and features of `LinkedList`:

1. **Doubly-Linked**: Each node in a `LinkedList` has references to both the previous and next nodes in the list. This allows for efficient insertions and removals at both the beginning and end of the list.

2. **Dynamic Sizing**: Unlike arrays, `LinkedList` does not have a fixed size. It can grow or shrink as needed when elements are added or removed.

3. **Random Access**: `LinkedList` does not provide efficient random access to elements by index. Accessing an element at a specific index requires traversing the list from the beginning or end, which can be slow for large lists.

4. **Iterating**: `LinkedList` supports efficient iteration through its elements using iterators.

Here's an example of how to use `LinkedList` in Java:

```java
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        List<String> linkedList = new LinkedList<>();

        // Add elements to the end of the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Insert an element at the beginning of the list
        linkedList.add(0, "Grapes");

        // Accessing elements by index
        String fruit = linkedList.get(2);
        System.out.println("Element at index 2: " + fruit); // Output: Element at index 2: Banana

        // Removing an element by value
        linkedList.remove("Banana");

        // Iterating through the LinkedList using an Iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
```

In this example, we create a `LinkedList` of strings and perform various operations, including adding elements, inserting elements at the beginning, accessing elements by index, removing elements, and iterating through the list using an iterator.

`LinkedList` can be useful in situations where you frequently need to add or remove elements from the middle of a list, as these operations are more efficient compared to `ArrayList`. However, if you require frequent random access by index, `ArrayList` might be a better choice due to its O(1) index-based access.

# Java ArrayDeque

In Java, `ArrayDeque` is a class that implements the `Deque` interface and represents a double-ended queue data structure. It is implemented as a resizable array, providing efficient O(1) time complexity for most common operations such as adding and removing elements from both ends of the deque. 

Here are some key characteristics and features of `ArrayDeque`:

1. **Double-Ended Queue**: `ArrayDeque` allows elements to be added or removed from both the front and back of the deque, making it suitable for use as a stack, queue, or general-purpose deque.

2. **Dynamic Sizing**: Like other collections in Java, `ArrayDeque` can dynamically grow or shrink as elements are added or removed, providing flexibility in managing the size of the deque.

3. **Efficient Operations**: Most common operations on an `ArrayDeque`, such as adding and removing elements from both ends, have O(1) time complexity. This makes it efficient for tasks that require frequent insertion and removal.

4. **Not Thread-Safe**: `ArrayDeque` is not thread-safe by default. If you need thread safety, you can wrap it with `Collections.synchronizedDeque()`.

Here's an example of how to use `ArrayDeque` in Java:

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Adding elements to the front and back of the deque
        arrayDeque.addFirst(1);
        arrayDeque.addLast(3);
        arrayDeque.addFirst(2);

        // Removing elements from the front and back of the deque
        int frontElement = arrayDeque.removeFirst();
        int backElement = arrayDeque.removeLast();

        System.out.println("Front Element: " + frontElement); // Output: Front Element: 2
        System.out.println("Back Element: " + backElement);   // Output: Back Element: 3
    }
}
```

In this example, we create an `ArrayDeque` of integers. We add elements to both the front and back of the deque using `addFirst` and `addLast`. Then, we remove elements from both ends using `removeFirst` and `removeLast`. `ArrayDeque` is a versatile data structure that can be used in various scenarios where you need efficient insertion and removal from both ends of a queue-like structure.

# Java BlockingQueue Interface

The `java.util.concurrent.BlockingQueue` interface is part of the Java Concurrency Framework and extends the `Queue` interface. It represents a thread-safe queue with blocking operations, designed for scenarios where multiple threads need to coordinate and synchronize access to a shared queue. Blocking queues are often used in concurrent and multi-threaded applications.

Key features of the `BlockingQueue` interface:

1. **Blocking Operations**: Blocking queues provide blocking operations for adding and removing elements. When a thread attempts to dequeue an element from an empty queue, it will block (wait) until an element becomes available. Similarly, when a thread tries to enqueue an element into a full queue, it will block until space becomes available.

2. **Thread-Safe**: Blocking queues are designed for concurrent access, making them suitable for multi-threaded environments. They ensure thread safety for both producers and consumers.

3. **Support for Timeout**: Blocking operations can specify a timeout, allowing threads to wait for a certain amount of time before returning if the operation cannot be completed immediately.

Some of the common methods provided by the `BlockingQueue` interface include:

- `void put(E e)`: Inserts the specified element into the queue, waiting if necessary for space to become available.
- `boolean offer(E e, long timeout, TimeUnit unit)`: Inserts the specified element into the queue, waiting for the specified time if the queue is full.
- `E take()`: Retrieves and removes the head of the queue, waiting if necessary until an element becomes available.
- `E poll(long timeout, TimeUnit unit)`: Retrieves and removes the head of the queue, waiting for the specified time if the queue is empty.

There are different implementations of the `BlockingQueue` interface in Java's `java.util.concurrent` package, including `LinkedBlockingQueue`, `ArrayBlockingQueue`, and `PriorityBlockingQueue`. Each implementation has its own characteristics and usage scenarios.

Here's a simple example of using `LinkedBlockingQueue`:

```java
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(3);

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                blockingQueue.put(1);
                blockingQueue.put(2);
                blockingQueue.put(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                int item = blockingQueue.take();
                System.out.println("Consumed: " + item);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
```

In this example, we create a `LinkedBlockingQueue` with a maximum capacity of 3. The producer thread adds three items to the queue, and the consumer thread removes and prints one item. The blocking nature of the queue ensures that the consumer thread will wait if the queue is empty and that the producer thread will wait if the queue is full.


# Java ArrayBlockingQueue

The `java.util.concurrent.ArrayBlockingQueue` class is an implementation of the `BlockingQueue` interface in Java's `java.util.concurrent` package. It represents a blocking queue with a fixed capacity, which means that the number of elements in the queue cannot exceed the specified capacity. When the queue is full, any attempt to add more elements will block until space becomes available.

Here are some key characteristics and features of `ArrayBlockingQueue`:

1. **Fixed Capacity**: `ArrayBlockingQueue` has a specified maximum capacity, which is determined when the queue is created. Once the queue reaches its capacity, attempts to add more elements will block until space becomes available when elements are removed.

2. **Blocking Operations**: It provides blocking operations for adding and removing elements. When a thread attempts to enqueue an element into a full queue, it will block until space becomes available. Similarly, when a thread tries to dequeue an element from an empty queue, it will block until an element is available.

3. **Thread-Safe**: `ArrayBlockingQueue` is designed for concurrent access, making it suitable for multi-threaded environments. It ensures thread safety for both producers and consumers.

4. **FIFO Order**: Elements in an `ArrayBlockingQueue` are maintained in FIFO (First-In-First-Out) order.

5. **No Element Priority**: Unlike `PriorityBlockingQueue`, `ArrayBlockingQueue` does not prioritize elements based on their natural ordering or a specified comparator. It simply maintains the order in which elements were added.

Here's an example of using `ArrayBlockingQueue`:

```java
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayBlockingQueue with a capacity of 3
        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                blockingQueue.put(1);
                blockingQueue.put(2);
                blockingQueue.put(3);
                System.out.println("Producer finished.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                int item1 = blockingQueue.take();
                int item2 = blockingQueue.take();
                int item3 = blockingQueue.take();
                System.out.println("Consumed: " + item1 + ", " + item2 + ", " + item3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
```

In this example, we create an `ArrayBlockingQueue` with a capacity of 3. The producer thread adds three items to the queue, and the consumer thread removes and prints the items. The blocking nature of the queue ensures that the producer thread will wait if the queue is full and that the consumer thread will wait if the queue is empty.

# Java LinkedBlockingQueue

The `java.util.concurrent.LinkedBlockingQueue` class is an implementation of the `BlockingQueue` interface in Java's `java.util.concurrent` package. It represents a blocking queue with an optional capacity. If you specify a capacity when creating a `LinkedBlockingQueue`, it behaves like a bounded queue, meaning it has a maximum size. If you create it without specifying a capacity, it becomes unbounded, and it can grow as large as the available memory allows.

Here are some key characteristics and features of `LinkedBlockingQueue`:

1. **Bounded or Unbounded**: You can create a `LinkedBlockingQueue` with a specified capacity (bounded) or without specifying a capacity (unbounded).

2. **Blocking Operations**: Like other `BlockingQueue` implementations, `LinkedBlockingQueue` provides blocking operations for adding and removing elements. When the queue is full, attempts to enqueue more elements will block until space becomes available. Similarly, when the queue is empty, attempts to dequeue elements will block until elements are available.

3. **Thread-Safe**: `LinkedBlockingQueue` is designed for concurrent access, making it suitable for multi-threaded environments. It ensures thread safety for both producers and consumers.

4. **FIFO Order**: Elements in a `LinkedBlockingQueue` are maintained in FIFO (First-In-First-Out) order.

5. **No Element Priority**: Unlike `PriorityBlockingQueue`, `LinkedBlockingQueue` does not prioritize elements based on their natural ordering or a specified comparator. It simply maintains the order in which elements were added.

Here's an example of using `LinkedBlockingQueue`:

```java
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedBlockingQueue without specifying a capacity (unbounded)
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                blockingQueue.put(1);
                blockingQueue.put(2);
                blockingQueue.put(3);
                System.out.println("Producer finished.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                int item1 = blockingQueue.take();
                int item2 = blockingQueue.take();
                int item3 = blockingQueue.take();
                System.out.println("Consumed: " + item1 + ", " + item2 + ", " + item3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
```

In this example, we create a `LinkedBlockingQueue` without specifying a capacity (unbounded). The producer thread adds three items to the queue, and the consumer thread removes and prints the items. The blocking nature of the queue ensures that the producer thread will wait if the queue is full and that the consumer thread will wait if the queue is empty.
