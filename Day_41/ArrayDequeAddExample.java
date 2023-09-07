import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAddExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // 1. add(element) - Adds an element to the end of the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);
        System.out.println("ArrayDeque after add(): " + deque);

        // 2. addFirst(element) - Adds an element to the beginning of the deque
        deque.addFirst(5);
        System.out.println("ArrayDeque after addFirst(): " + deque);

        // 3. addLast(element) - Adds an element to the end of the deque
        deque.addLast(40);
        System.out.println("ArrayDeque after addLast(): " + deque);

        // 4. offer(element) - Adds an element to the end of the deque and returns true on success
        boolean offerResult = deque.offer(50);
        System.out.println("Offer result (should be true): " + offerResult);
        System.out.println("ArrayDeque after offer(): " + deque);

        // 5. offerFirst(element) - Adds an element to the beginning of the deque and returns true on success
        boolean offerFirstResult = deque.offerFirst(0);
        System.out.println("OfferFirst result (should be true): " + offerFirstResult);
        System.out.println("ArrayDeque after offerFirst(): " + deque);

        // 6. offerLast(element) - Adds an element to the end of the deque and returns true on success
        boolean offerLastResult = deque.offerLast(60);
        System.out.println("OfferLast result (should be true): " + offerLastResult);
        System.out.println("ArrayDeque after offerLast(): " + deque);
    }
}
