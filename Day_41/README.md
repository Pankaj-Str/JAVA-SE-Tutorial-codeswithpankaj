# Java LinkedBlockingQueue

A `LinkedBlockingQueue` is a concurrent queue implementation in Java that is part of the java.util.concurrent package. It is a data structure that provides a thread-safe, blocking FIFO (First-In-First-Out) queue.

```scss
  +----------------------+
  |  LinkedBlockingQueue |
  +----------------------+
          |
          |  Extends
          |
  +----------------------+
  |    AbstractQueue    |
  +----------------------+
          |
          |  Extends
          |
  +----------------------+
  |    AbstractCollection|
  +----------------------+
          |
          |  Implements
          |
  +----------------------+
  |        Collection    |
  +----------------------+
          |
          |  Methods
          |
  +----------------------+
  | - add(E e)            |
  | - offer(E e)          |
  | - put(E e)            |
  | - remove(Object o)    |
  | - poll()              |
  | - take()              |
  | - peek()              |
  | - size()              |
  | - isEmpty()           |
  | - contains(Object o)  |
  | - clear()             |
  | - iterator()          |
  +----------------------+


```

Here are some key features and characteristics of a `LinkedBlockingQueue`:

1. **Thread Safety:** `LinkedBlockingQueue` is designed to be used in multi-threaded environments, making it safe for concurrent access by multiple threads. It uses locks to synchronize access to the queue's internal data structure.

2. **Blocking Operations:** This queue offers blocking operations for adding and removing elements. When a thread attempts to add an element to a full queue or remove an element from an empty queue, it will block until the condition is met. This blocking behavior can be useful in various concurrency scenarios.

3. **FIFO Order:** Elements are dequeued in the same order in which they were enqueued, following the First-In-First-Out (FIFO) principle.

4. **Unbounded or Bounded:** You can create a `LinkedBlockingQueue` with either a bounded or unbounded capacity. A bounded queue has a specified maximum capacity, while an unbounded queue can grow without a set limit (until memory constraints are reached).

Here's an example of how to create and use a `LinkedBlockingQueue` in Java:

```java
import java.util.concurrent.LinkedBlockingQueue;

public class LiAadUzW7hUA6mjm8tYnMrvYfqKzVZX2ee {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3); // Create a bounded queue with a capacity of 3

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                queue.put(1);
                queue.put(2);
                queue.put(3);
                System.out.println("Producer: Enqueued 1, 2, 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
                System.out.println("Consumer: Dequeued " + queue.take());
                System.out.println("Consumer: Dequeued " + queue.take());
                System.out.println("Consumer: Dequeued " + queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
```

## Creating a LinkedBlockingQueue

### Without Initial Capacity

You can create a `LinkedBlockingQueue` without specifying an initial capacity. In this case, the default initial capacity will be used, which is 2^31-1.

```java
LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>();
```

### With Initial Capacity

To create a `LinkedBlockingQueue` with an initial capacity, use the following syntax:

```java
LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>(int capacity);
```

- `Type`: The type of the linked blocking queue.
- `capacity`: The size of the linked blocking queue.

Example:

```java
// Creating String type LinkedBlockingQueue with size 5
LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

// Creating Integer type LinkedBlockingQueue with size 5
LinkedBlockingQueue<Integer> age = new LinkedBlockingQueue<>(5);
```

Note: Providing the size is optional, and you can create an unbounded queue without specifying a size.

## Methods of LinkedBlockingQueue

The `LinkedBlockingQueue` class provides various methods for inserting, accessing, and removing elements. Here are some key methods:

### Insert Elements

- `add()`: Inserts a specified element to the linked blocking queue. It throws an exception if the queue is full.
- `offer()`: Inserts a specified element to the linked blocking queue. It returns false if the queue is full.

Example:

```java
LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

// Using add()
animals.add("Dog");
animals.add("Cat");

// Using offer()
animals.offer("Horse");
```

### Access Elements

- `peek()`: Returns an element from the front of the linked blocking queue. It returns null if the queue is empty.
- `iterator()`: Returns an iterator object to sequentially access elements. It throws an exception if the queue is empty.

Example:

```java
LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

// Using peek()
String element = animals.peek();

// Using iterator()
Iterator<String> iterate = animals.iterator();
```

### Remove Elements

- `remove()`: Returns and removes a specified element from the linked blocking queue. It throws an exception if the queue is empty.
- `poll()`: Returns and removes a specified element from the linked blocking queue. It returns null if the queue is empty.
- `clear()`: Removes all elements from the linked blocking queue.

Example:

```java
LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

// Using remove()
String element1 = animals.remove();

// Using poll()
String element2 = animals.poll();

// Using clear()
animals.clear();
```

### `put()` and `take()` Methods

- `put()`: Inserts an element, blocking if the queue is full, until space is available.
- `take()`: Removes and returns an element, blocking if the queue is empty, until an element is available.

Example:

```java
LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

try {
    // Using put()
    animals.put("Dog");
    animals.put("Cat");

    // Using take()
    String element = animals.take();
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}
```


