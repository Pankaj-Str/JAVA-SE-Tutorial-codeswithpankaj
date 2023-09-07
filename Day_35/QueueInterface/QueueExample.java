package Day_35.QueueInterface;
// www.codeswithpankaj.com
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of integers using a LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // 1. add() - Inserts an element into the queue. Throws an exception on failure.
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add(): " + queue);

        // 2. offer() - Inserts an element into the queue. Returns true on success, false on failure.
        boolean offerResult = queue.offer(40);
        System.out.println("Offer result: " + offerResult);
        System.out.println("Queue after offer(): " + queue);

        // 3. element() - Returns the head of the queue. Throws an exception if the queue is empty.
        int element = queue.element();
        System.out.println("Element at the head of the queue: " + element);

        // 4. peek() - Returns the head of the queue. Returns null if the queue is empty.
        Integer peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);

        // 5. remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after remove(): " + queue);

        // 6. poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
        Integer polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after poll(): " + queue);
    }
}
