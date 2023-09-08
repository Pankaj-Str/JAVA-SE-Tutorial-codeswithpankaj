# Java ArrayBlockingQueue

The ArrayBlockingQueue class of the Java Collections framework provides the blocking queue implementation using an array.


ArrayBlockingQueue class is a bounded blocking queue backed by an array. By bounded, it means that the size of the Queue is fixed. Once created, the capacity cannot be changed. Attempts to put an element into a full queue will result in the operation blocking. Similarly attempts to take an element from an empty queue will also be blocked. Boundness of the ArrayBlockingQueue can be achieved initially bypassing capacity as the parameter in the constructor of ArrayBlockingQueue. This queue orders elements FIFO (first-in-first-out). It means that the head of this queue is the oldest element of the elements present in this queue. 

## Methods of ArrayBlockingQueue
| METHOD | DESCRIPTION |
|------|-----|
|add​(E e)	|Inserts the specified element at the tail of this queue if it is possible to do so immediately without exceeding the queue’s capacity, returning true upon success and throwing an IllegalStateException if this queue is full.|
|clear()	|Atomically removes all of the elements from this queue.|
|contains​(Object o)|	Returns true if this queue contains the specified element.|
|drainTo​(Collection<? super E> c)|	Removes all available elements from this queue and adds them to the given collection.|
|drainTo​(Collection<? super E> c, int maxElements)|	Removes at most the given number of available elements from this queue and adds them to the given collection.|
|forEach​(Consumer<? super E> action)	|Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.|
|iterator()	|Returns an iterator over the elements in this queue in the proper sequence.|
|offer​(E e)	|Inserts the specified element at the tail of this queue if it is possible to do so immediately without exceeding the queue’s capacity, returning true upon success and false if this queue is full.|
|offer​(E e, long timeout, TimeUnit unit)	|Inserts the specified element at the tail of this queue, waiting up to the specified wait time for space to become available if the queue is full.|
|put​(E e)	|Inserts the specified element at the tail of this queue, waiting for space to become available if the queue is full.|
|remainingCapacity()	|Returns the number of additional elements that this queue can ideally (in the absence of memory or resource constraints) accept without blocking.|
|remove​(Object o)	|Removes a single instance of the specified element from this queue, if it is present.|
|removeAll​(Collection<?> c)	|Removes all of this collection’s elements that are also contained in the specified collection (optional operation).|
|removeIf​(Predicate<? super E> filter)	|Removes all of the elements of this collection that satisfy the given predicate.|
|retainAll​(Collection<?> c)	|Retains only the elements in this collection that are contained in the specified collection (optional operation).|
|size()	|Returns the number of elements in this queue.|
|spliterator()	|Returns a Spliterator over the elements in this queue.|
|toArray()	|Returns an array containing all of the elements in this queue, in proper sequence|.
|toArray​(T[] a)	|Returns an array containing all of the elements in this queue, in proper sequence; the runtime type of the returned array is that of the specified array.|


--------

let's go through each method of the `ArrayBlockingQueue` class with explanations and examples:

1. `add(E e)`:
   - Adds an element to the end of the queue.
   - Throws an `IllegalStateException` if the queue is full.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
   queue.add(1);
   queue.add(2);
   queue.add(3);

   // Attempting to add when the queue is full will throw an exception
   queue.add(4); // This will throw an IllegalStateException
   ```

2. `clear()`:
   - Removes all elements from the queue, leaving it empty.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
   queue.add(1);
   queue.add(2);

   queue.clear(); // Now the queue is empty
   ```

3. `contains(Object o)`:
   - Checks if the queue contains the specified object `o`.
   - Returns `true` if found; otherwise, returns `false`.

   ```java
   ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
   queue.add("apple");
   queue.add("banana");

   boolean containsBanana = queue.contains("banana"); // true
   boolean containsCherry = queue.contains("cherry"); // false
   ```

4. `drainTo(Collection<? super E> c)`:
   - Removes all available elements from the queue and adds them to the specified collection `c`.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
   queue.add(1);
   queue.add(2);
   queue.add(3);

   List<Integer> list = new ArrayList<>();
   queue.drainTo(list); // Removes all elements and adds them to 'list'

   // 'list' now contains [1, 2, 3], and 'queue' is empty
   ```

5. `drainTo(Collection<? super E> c, int maxElements)`:
   - Removes up to `maxElements` available elements from the queue and adds them to the specified collection `c`.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
   queue.add(1);
   queue.add(2);
   queue.add(3);
   queue.add(4);
   queue.add(5);

   List<Integer> list = new ArrayList<>();
   queue.drainTo(list, 3); // Removes up to 3 elements and adds them to 'list'

   // 'list' now contains [1, 2, 3], and 'queue' contains [4, 5]
   ```

6. `forEach(Consumer<? super E> action)`:
   - Applies the given action to each element in the queue.

   ```java
   ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
   queue.add("apple");
   queue.add("banana");

   // Print each element in the queue
   queue.forEach(element -> System.out.println(element));
   ```

7. `iterator()`:
   - Returns an iterator over the elements in the queue.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
   queue.add(1);
   queue.add(2);
   queue.add(3);

   Iterator<Integer> iterator = queue.iterator();
   while (iterator.hasNext()) {
       System.out.println(iterator.next());
   }
   ```

8. `offer(E e)`:
   - Adds an element to the end of the queue if space is available.
   - Returns `true` if successful; otherwise, returns `false`.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

   boolean added = queue.offer(1); // true
   boolean addedAgain = queue.offer(2); // true
   boolean addedThird = queue.offer(3); // true
   boolean addedFourth = queue.offer(4); // false, queue is full
   ```

9. `offer(E e, long timeout, TimeUnit unit)`:
   - Adds an element to the end of the queue if space is available, with a specified timeout.
   - Returns `true` if successful; otherwise, returns `false` if the timeout is reached.

   ```java
   ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

   try {
       boolean added = queue.offer(1, 2, TimeUnit.SECONDS); // true, added with a 2-second timeout
       boolean addedAgain = queue.offer(2, 2, TimeUnit.SECONDS); // true
       boolean addedThird = queue.offer(3, 2, TimeUnit.SECONDS); // true
       boolean addedFourth = queue.offer(4, 2, TimeUnit.SECONDS); // false, timeout reached
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
   ```

10. `put(E e)`:
    - Adds an element to the end of the queue.
    - If the queue is full, it blocks until space becomes available.

    ```java
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

    try {
        queue.put(1); // Adds 1
        queue.put(2); // Adds 2
        queue.put(3); // Adds 3

        // This will block until space becomes available
        queue.put(4);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    ```

11. `remainingCapacity()`:
    - Returns the remaining capacity of the queue.

    ```java
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
    int remainingCapacity = queue.remainingCapacity(); // 3 initially

    queue.add(1);
    remainingCapacity = queue.remainingCapacity(); // 2

    queue.add(2);
    remainingCapacity = queue.remainingCapacity(); // 1
    ```

12. `remove(Object o)`:
    - Removes the first occurrence of the specified object `o` from the queue.
    - Returns `true` if the object was removed; otherwise, returns `false`.

    ```java
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
    queue.add("apple");
    queue.add("banana");

    boolean removed = queue.remove("apple"); // true, "apple" is removed
    boolean removedAgain = queue.remove("cherry"); // false, "cherry" not found
    ```

13. `removeAll(Collection<?> c)`:
    - Removes all elements from the queue that are present in the specified collection `c`.

    ```java
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
    queue.add(1);
    queue.add(2);

    List<Integer> toRemove = Arrays.asList(1, 3);
    queue.removeAll(toRemove); // Removes 1, leaves only 2 in the queue
    ```

14. `removeIf(Predicate<? super E> filter)`:
    - Removes all elements from the queue that satisfy the given predicate.

    ```java
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    // Remove all even numbers
    queue.removeIf(element
