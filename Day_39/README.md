# Java BlockingQueue Interface

The `BlockingQueue` interface in Java is a part of the `java.util.concurrent` package and is used to represent a thread-safe queue that supports blocking operations. It extends the `Queue` interface and adds methods for blocking operations, making it particularly useful for implementing producer-consumer scenarios and other multi-threaded applications where threads need to coordinate their activities.

![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/b5872da8-1c47-4923-b005-9848b62dce24)


![1 Pi6Ejc1yrwWdTvI05hFLVA](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/1c0409fa-2e61-45bf-84eb-1b1ea637cf4b)



Some of the important methods provided by the `BlockingQueue` interface include:

1. `put(E e)`: This method inserts an element `e` into the queue. If the queue is full, it blocks until space becomes available for the element.

2. `take()`: This method retrieves and removes an element from the queue. If the queue is empty, it blocks until an element becomes available.

3. `offer(E e)`: Inserts an element `e` into the queue if space is available. Returns `true` if successful, `false` if the queue is full.

4. `poll()`: Retrieves and removes an element from the queue if one is available, or returns `null` if the queue is empty.

5. `offer(E e, long timeout, TimeUnit unit)`: Inserts an element `e` into the queue if space is available, blocking for the specified amount of time if necessary.

6. `poll(long timeout, TimeUnit unit)`: Retrieves and removes an element from the queue if one is available, blocking for the specified amount of time if the queue is empty.

`BlockingQueue` implementations provide different blocking behavior depending on the implementation. Some common implementations of `BlockingQueue` include `LinkedBlockingQueue`, `ArrayBlockingQueue`, `PriorityBlockingQueue`, and `DelayQueue`.

Here's an example of how to use a `BlockingQueue`:

```java
import java.util.concurrent.*;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
```

In this example, the `LinkedBlockingQueue` is used to coordinate between the producer and consumer threads. The producer thread inserts elements into the queue, and the consumer thread retrieves and consumes them. If the queue is full (in the producer) or empty (in the consumer), the respective thread will block until the condition is met.
