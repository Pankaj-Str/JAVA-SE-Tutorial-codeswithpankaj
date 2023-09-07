# Classes that Implement List

Since List is an interface, we cannot create objects from it.
In order to use functionalities of the List interface, we can use these classes:
    
1. ArrayList
2. LinkedList
3. Vector
4. Stack

# Implementing the ArrayList Class 

The Java Collections Framework provides a built-in `ArrayList` class, so you don't need to implement it from scratch. You can use the `ArrayList` class that comes with Java to store and manipulate lists of objects. Here's an example of how to use the Java `ArrayList` class:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Accessing elements by index
        int element = arrayList.get(1);
        System.out.println("Element at index 1: " + element); // Output: Element at index 1: 2

        // Removing an element by value
        arrayList.remove(Integer.valueOf(2));
        System.out.println("After removing value 2: " + arrayList); // Output: After removing value 2: [1, 3]

        // Checking the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size); // Output: Size of the ArrayList: 2
    }
}
```

In this example, we import the `ArrayList` class from the `java.util` package, create an instance of `ArrayList<Integer>`, and use various methods like `add`, `get`, and `remove` to manipulate the list. The Java Collections Framework provides a rich set of functionality for working with lists, including dynamic resizing, iteration, and sorting, among others.

# Implementing the LinkedList Class 

The Java Collections Framework provides a built-in `LinkedList` class, so you don't need to implement it from scratch. You can use the `LinkedList` class that comes with Java to work with linked lists. Here's an example of how to use the Java `LinkedList` class:

```java
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList of strings
        List<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Accessing elements by index
        String fruit = linkedList.get(1);
        System.out.println("Element at index 1: " + fruit); // Output: Element at index 1: Banana

        // Removing an element by value
        linkedList.remove("Apple");
        System.out.println("After removing 'Apple': " + linkedList); // Output: After removing 'Apple': [Banana, Cherry]

        // Checking the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size); // Output: Size of the LinkedList: 2

        // Iterating through the LinkedList
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
```

In this example, we import the `LinkedList` class from the `java.util` package, create an instance of `LinkedList<String>`, and use various methods like `add`, `get`, and `remove` to manipulate the linked list. Additionally, we demonstrate how to iterate through the elements of the linked list using an iterator.

# Implementing the Vector 

The `Vector` class was part of the Java Collections Framework, but it has been largely replaced by the more modern `ArrayList` and `LinkedList` classes. However, if you still need to use the `Vector` class for any specific reason, you can implement it in your Java program. Below is an example of how you can create and use a `Vector` in Java:

```java
import java.util.Vector;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);

        // Accessing elements by index
        int element = vector.get(1);
        System.out.println("Element at index 1: " + element); // Output: Element at index 1: 2

        // Removing an element by value
        vector.remove(Integer.valueOf(2));
        System.out.println("After removing value 2: " + vector); // Output: After removing value 2: [1, 3]

        // Checking the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size); // Output: Size of the Vector: 2

        // Iterating through the Vector using Enumeration
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer item = enumeration.nextElement();
            System.out.println("Item: " + item);
        }
    }
}
```

In this example, we import the `Vector` class from the `java.util` package, create an instance of `Vector<Integer>`, and use various methods like `add`, `get`, and `remove` to manipulate the vector. Additionally, we demonstrate how to iterate through the elements of the vector using an `Enumeration`.

Please note that while `Vector` is thread-safe (it is synchronized), it may not be the most efficient choice for modern Java applications because of its synchronization overhead. In most cases, you should prefer using `ArrayList` or other more modern collections, and if thread safety is a concern, consider using `Collections.synchronizedList()` to wrap an `ArrayList` for synchronization.

# Implementing the Stack

In Java, you can implement a stack data structure using the `java.util.Stack` class or by using a `LinkedList` as the underlying data structure. I'll provide an example of how to implement a stack using both methods.

### Using `java.util.Stack`:

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement); // Output: Popped element: 3

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Output: Top element: 2

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty); // Output: Is the stack empty? false
    }
}
```

In this example, we use the built-in `java.util.Stack` class to implement a stack. The `push` method is used to add elements to the top of the stack, the `pop` method removes and returns the top element, and the `peek` method returns the top element without removing it.

### Using `LinkedList` as a Stack:

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement); // Output: Popped element: 3

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Output: Top element: 2

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty); // Output: Is the stack empty? false
    }
}
```

In this example, we use a `LinkedList` as the underlying data structure to implement a stack. We achieve this by using the `push` method to add elements to the front of the linked list (which simulates pushing onto the stack) and the `pop` method to remove and return elements from the front (which simulates popping from the stack).

Both examples demonstrate how to implement a stack in Java, and you can choose the approach that best fits your needs and preferences. The built-in `Stack` class provides a more specific interface for stack operations, while using a `LinkedList` provides more flexibility for customizing your stack implementation.

