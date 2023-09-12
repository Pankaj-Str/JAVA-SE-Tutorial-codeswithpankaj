import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeRemoveExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);
        System.out.println("Original ArrayDeque: " + deque);

        // 1. remove() - Removes and returns the first element in the deque
        int removedElement1 = deque.remove();
        System.out.println("Removed element using remove(): " + removedElement1);
        System.out.println("ArrayDeque after remove(): " + deque);

        // 2. removeFirst() - Removes and returns the first element in the deque
        int removedElement2 = deque.removeFirst();
        System.out.println("Removed element using removeFirst(): " + removedElement2);
        System.out.println("ArrayDeque after removeFirst(): " + deque);

        // 3. removeLast() - Removes and returns the last element in the deque
        int removedElement3 = deque.removeLast();
        System.out.println("Removed element using removeLast(): " + removedElement3);
        System.out.println("ArrayDeque after removeLast(): " + deque);

        // 4. poll() - Removes and returns the first element in the deque, returns null if empty
        Integer polledElement1 = deque.poll();
        System.out.println("Polled element using poll() (null if empty): " + polledElement1);
        System.out.println("ArrayDeque after poll(): " + deque);

        // 5. pollFirst() - Removes and returns the first element in the deque, returns null if empty
        Integer polledElement2 = deque.pollFirst();
        System.out.println("Polled element using pollFirst() (null if empty): " + polledElement2);
        System.out.println("ArrayDeque after pollFirst(): " + deque);

        // 6. pollLast() - Removes and returns the last element in the deque, returns null if empty
        Integer polledElement3 = deque.pollLast();
        System.out.println("Polled element using pollLast() (null if empty): " + polledElement3);
        System.out.println("ArrayDeque after pollLast(): " + deque);
    }
}
