# Java Stack Class

The Java collections framework has a class named Stack that provides the functionality of the stack data structure.


## Creating a Stack
In order to create a stack, we must import the java.util.Stack package first. Once we import the package, here is how we can create a stack in Java.
```java
Stack<Type> stacks = new Stack<>();

// Here, Type indicates the stack's type. For example,

// Create Integer type stack
Stack<Integer> stacks = new Stack<>();

// Create String type stack
Stack<String> stacks = new Stack<>();

```


The `Stack` class in Java is a collection class that represents a last-in, first-out (LIFO) data structure. It extends the `Vector` class and provides additional methods to support stack operations such as push, pop, and peek. Here are some key characteristics and methods of the `Stack` class:

**Characteristics:**
- Elements are added and removed from the top of the stack.
- The most recently added element is the first to be removed.
- It can contain duplicates.

**Common Methods:**

1. `push(element)`: Adds an element to the top of the stack.

2. `pop()`: Removes and returns the top element of the stack.

3. `peek()`: Returns the top element of the stack without removing it.

4. `empty()`: Checks if the stack is empty. Returns `true` if empty, `false` otherwise.

5. `search(element)`: Searches for an element in the stack and returns its 1-based position (index) from the top. Returns -1 if not found.

Here's an example of how to use the `Stack` class:

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop and print elements
        while (!stack.empty()) {
            int element = stack.pop();
            System.out.println("Popped: " + element);
        }

        // Check if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
```

In this example:

- We create a `Stack` of integers and push elements onto it.
- We use `peek()` to see the top element without removing it.
- We use `pop()` to remove and print elements in LIFO order.
- We check if the stack is empty using `empty()`.

The `Stack` class is useful for implementing algorithms that involve backtracking, parsing expressions, and managing program execution flow, among other applications. However, in modern Java development, using the `Deque` interface (e.g., `LinkedList`) is often preferred for stack-like behavior due to improved performance and additional methods.