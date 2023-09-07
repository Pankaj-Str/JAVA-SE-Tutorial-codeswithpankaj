package Day_31.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of strings
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display the stack
        System.out.println("Stack: " + stack);

        // 1. Push an element onto the stack
        stack.push("Date");
        System.out.println("Pushed 'Date': " + stack);

        // 2. Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // 3. Peek at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // 4. Check if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        // 5. Search for an element in the stack
        int position = stack.search("Banana");
        if (position != -1) {
            System.out.println("Position of 'Banana': " + position + " from the top");
        } else {
            System.out.println("'Banana' not found in the stack");
        }

        // Clear the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
