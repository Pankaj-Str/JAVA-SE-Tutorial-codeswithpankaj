import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAccessExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);
        System.out.println("Original ArrayDeque: " + deque);

        // 1. getFirst() - Returns the first element in the deque
        int firstElement = deque.getFirst();
        System.out.println("First element using getFirst(): " + firstElement);

        // 2. getLast() - Returns the last element in the deque
        int lastElement = deque.getLast();
        System.out.println("Last element using getLast(): " + lastElement);

        // 3. peek() - Retrieves the first element without removing it (null if empty)
        Integer peekedElement1 = deque.peek();
        System.out.println("Peeked element using peek() (null if empty): " + peekedElement1);

        // 4. peekFirst() - Retrieves the first element without removing it (null if empty)
        Integer peekedElement2 = deque.peekFirst();
        System.out.println("Peeked element using peekFirst() (null if empty): " + peekedElement2);

        // 5. peekLast() - Retrieves the last element without removing it (null if empty)
        Integer peekedElement3 = deque.peekLast();
        System.out.println("Peeked element using peekLast() (null if empty): " + peekedElement3);

        // Display the original ArrayDeque
        System.out.println("ArrayDeque after accessing elements: " + deque);
    }
}
