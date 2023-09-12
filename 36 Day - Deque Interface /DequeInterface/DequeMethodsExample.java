package Day_36;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMethodsExample {
    public static void main(String[] args) {
        // Create a Deque of integers using an ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // 1. addFirst() - Adds an element at the beginning of the deque.
        deque.addFirst(10);
        System.out.println("Deque after addFirst(10): " + deque);

        // 2. addLast() - Adds an element at the end of the deque.
        deque.addLast(20);
        System.out.println("Deque after addLast(20): " + deque);

        // 3. offerFirst() - Adds an element at the beginning of the deque. Returns false if full.
        boolean offerFirstResult = deque.offerFirst(5);
        System.out.println("OfferFirst result (should be true): " + offerFirstResult);
        System.out.println("Deque after offerFirst(5): " + deque);

        // 4. offerLast() - Adds an element at the end of the deque. Returns false if full.
        boolean offerLastResult = deque.offerLast(30);
        System.out.println("OfferLast result (should be true): " + offerLastResult);
        System.out.println("Deque after offerLast(30): " + deque);

        // 5. getFirst() - Returns the first element of the deque.
        int firstElement = deque.getFirst();
        System.out.println("First element: " + firstElement);

        // 6. getLast() - Returns the last element of the deque.
        int lastElement = deque.getLast();
        System.out.println("Last element: " + lastElement);

        // 7. peekFirst() - Returns the first element of the deque. Returns null if empty.
        Integer peekedFirstElement = deque.peekFirst();
        System.out.println("Peeked first element: " + peekedFirstElement);

        // 8. peekLast() - Returns the last element of the deque. Returns null if empty.
        Integer peekedLastElement = deque.peekLast();
        System.out.println("Peeked last element: " + peekedLastElement);

        // 9. removeFirst() - Returns and removes the first element of the deque.
        int removedFirstElement = deque.removeFirst();
        System.out.println("Removed first element: " + removedFirstElement);
        System.out.println("Deque after removeFirst(): " + deque);

        // 10. removeLast() - Returns and removes the last element of the deque.
        int removedLastElement = deque.removeLast();
        System.out.println("Removed last element: " + removedLastElement);
        System.out.println("Deque after removeLast(): " + deque);

        // 11. pollFirst() - Returns and removes the first element of the deque. Returns null if empty.
        Integer polledFirstElement = deque.pollFirst();
        System.out.println("Polled first element: " + polledFirstElement);
        System.out.println("Deque after pollFirst(): " + deque);

        // 12. pollLast() - Returns and removes the last element of the deque. Returns null if empty.
        Integer polledLastElement = deque.pollLast();
        System.out.println("Polled last element: " + polledLastElement);
        System.out.println("Deque after pollLast(): " + deque);
    }
}
