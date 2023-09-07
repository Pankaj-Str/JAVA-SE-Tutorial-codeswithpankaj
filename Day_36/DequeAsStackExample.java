package Day_36;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStackExample {
    public static void main(String[] args) {
        // Create a Deque to implement a stack
        Deque<Integer> stack = new ArrayDeque<>();

        // 1. push() - Add elements to the beginning of the deque (top of the stack)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack after pushing elements
        System.out.println("Stack after push operations: " + stack);

        // 2. pop() - Remove elements from the beginning of the deque (top of the stack)
        int poppedElement1 = stack.pop();
        int poppedElement2 = stack.pop();

        // Display the popped elements and the updated stack
        System.out.println("Popped element 1: " + poppedElement1);
        System.out.println("Popped element 2: " + poppedElement2);
        System.out.println("Stack after pop operations: " + stack);

        // 3. peek() - Peek at the top element without removing it
        int topElement = stack.peek();

        // Display the top element
        System.out.println("Top element (peek): " + topElement);

        // Display the final stack
        System.out.println("Final Stack: " + stack);
    }
}
