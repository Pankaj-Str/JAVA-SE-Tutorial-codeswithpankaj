# Java LinkedList

In Java, `LinkedList` is a class that implements the `List` and `Deque` interfaces. It is part of the Java Collections Framework and represents a linear collection of elements where elements are stored in nodes, and each node points to the next and, optionally, the previous node. This structure allows for efficient insertions and removals at both the beginning and end of the list, making it a good choice for certain use cases.

![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/663f9dfb-1b5f-401d-a3d5-182cf9ab63ff)


```scss

  +----------------+
  |   LinkedList   |
  +----------------+
          |
          |  Extends
          |
  +----------------+
  |   AbstractSequentialList |
  +----------------+
          |
          |  Implements
          |
  +----------------+
  |       List      |
  +----------------+
          |
          |  Methods
          |
  +----------------+
  | - add(E e)             |
  | - add(int index, E e)  |
  | - addFirst(E e)        |
  | - addLast(E e)         |
  | - remove()             |
  | - remove(int index)    |
  | - removeFirst()        |
  | - removeLast()         |
  | - get(int index)       |
  | - getFirst()           |
  | - getLast()            |
  | - set(int index, E e)  |
  | - indexOf(Object o)    |
  | - lastIndexOf(Object o)|
  | - size()               |
  | - isEmpty()            |
  | - clear()              |
  | - iterator()           |
  +------------------+


```


Here are some key characteristics and methods of the `LinkedList` class:

**Characteristics:**
- Elements are stored in nodes, linked together by references.
- Supports duplicate elements.
- Allows null elements.

**Common Methods:**

1. **Adding Elements:**
   - `add(element)`: Adds an element to the end of the list.
   - `add(index, element)`: Inserts an element at the specified index.
   - `addFirst(element)`: Adds an element to the beginning of the list.
   - `addLast(element)`: Adds an element to the end of the list.

2. **Removing Elements:**
   - `remove()`: Removes and returns the first element in the list.
   - `remove(index)`: Removes and returns the element at the specified index.
   - `removeFirst()`: Removes and returns the first element in the list.
   - `removeLast()`: Removes and returns the last element in the list.

3. **Accessing Elements:**
   - `get(index)`: Returns the element at the specified index.
   - `getFirst()`: Returns the first element in the list.
   - `getLast()`: Returns the last element in the list.

4. **Size and Check:**
   - `size()`: Returns the number of elements in the list.
   - `isEmpty()`: Checks if the list is empty.

5. **Iteration:**
   - `iterator()`: Returns an iterator for iterating through the elements in the list.

6. **Conversion:**
   - `toArray()`: Converts the list into an array.

7. **Queue Operations:**
   - `offer(element)`: Adds an element to the end of the list.
   - `poll()`: Removes and returns the first element in the list (for queue-like behavior).
   - `peek()`: Retrieves the first element in the list without removing it (for queue-like behavior).

Here's a simple example of using a `LinkedList`:

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the end
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Adding elements at the beginning
        linkedList.addFirst("Orange");
        linkedList.addLast("Grapes");

        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Removing elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // Iterating through elements
        System.out.print("LinkedList: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
```

In this example, we create a `LinkedList` of strings, add elements, access elements, remove elements, and iterate through the list. `LinkedList` provides efficient operations for adding and removing elements at both the beginning and end of the list, making it suitable for certain use cases like implementing queues and double-ended queues.


## Other Methods
| Methods	| Description|
|-----|---|
|contains()	|checks if the LinkedList contains the element|
|indexOf()|	returns the index of the first occurrence of the element|
|lastIndexOf()|	returns the index of the last occurrence of the element|
|clear()	|removes all the elements of the LinkedList|
|iterator()|	returns an iterator to iterate over LinkedList|


## LinkedList as Deque and Queue

|Methods|	Descriptions|
|---------|---------|
|addFirst()	|adds the specified element at the beginning of the linked list|
|addLast()	|adds the specified element at the end of the linked list|
|getFirst()	|returns the first element|
|getLast()	|returns the last element|
|removeFirst()	|removes the first element|
|removeLast()	|removes the last element|
|peek()	|returns the first element (head) of the linked list|
|poll()	|returns and removes the first element from the linked list|
|offer()|	adds the specified element at the end of the linked list|



