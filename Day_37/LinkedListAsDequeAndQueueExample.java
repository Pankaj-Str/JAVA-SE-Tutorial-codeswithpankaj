import java.util.LinkedList;

public class LinkedListAsDequeAndQueueExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. addFirst() - Add elements to the beginning of the linked list (front of the deque)
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");
        System.out.println("LinkedList after addFirst(): " + linkedList);

        // 2. addLast() - Add elements to the end of the linked list (back of the deque)
        linkedList.addLast("Cherry");
        linkedList.addLast("Date");
        System.out.println("LinkedList after addLast(): " + linkedList);

        // 3. getFirst() - Retrieve the first element (front of the deque)
        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        // 4. getLast() - Retrieve the last element (back of the deque)
        String lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);

        // 5. removeFirst() - Remove the first element (front of the deque)
        linkedList.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + linkedList);

        // 6. removeLast() - Remove the last element (back of the deque)
        linkedList.removeLast();
        System.out.println("LinkedList after removeLast(): " + linkedList);

        // 7. peek() - Peek at the first element without removing it
        String peekedElement = linkedList.peek();
        System.out.println("Peeked element: " + peekedElement);

        // 8. poll() - Remove and return the first element
        String polledElement = linkedList.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("LinkedList after poll(): " + linkedList);

        // 9. offer() - Add elements to the end of the linked list (for queue-like behavior)
        linkedList.offer("Elderberry");
        linkedList.offer("Fig");
        System.out.println("LinkedList after offer(): " + linkedList);
    }
}
