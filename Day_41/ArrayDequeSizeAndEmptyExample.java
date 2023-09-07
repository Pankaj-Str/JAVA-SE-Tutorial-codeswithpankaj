import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeSizeAndEmptyExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Checking if the deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is the ArrayDeque empty? " + isEmpty);

        // Adding elements to the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);
        System.out.println("ArrayDeque after adding elements: " + deque);

        // Checking the size of the deque
        int size = deque.size();
        System.out.println("Size of the ArrayDeque: " + size);

        // Adding more elements
        deque.add(40);
        deque.add(50);

        // Checking if the deque is empty again
        isEmpty = deque.isEmpty();
        System.out.println("Is the ArrayDeque empty now? " + isEmpty);

        // Removing elements from the deque
        deque.removeFirst();
        deque.removeLast();

        // Checking the size after removal
        size = deque.size();
        System.out.println("Size of the ArrayDeque after removal: " + size);
    }
}
