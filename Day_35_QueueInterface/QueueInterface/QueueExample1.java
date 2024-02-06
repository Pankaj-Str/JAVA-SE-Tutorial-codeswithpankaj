import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class QueueExample1{
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // 1. Adding elements
        queue.add("First");
        queue.offer("Second");

        // 2. Removing and returning the head of the queue
        try {
            String removedElement1 = queue.remove();
            System.out.println("Removed element: " + removedElement1);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Queue is empty.");
        }

        String removedElement2 = queue.poll();
        System.out.println("Removed element (poll): " + (removedElement2 != null ? removedElement2 : "Queue is empty."));

        // 3. Retrieving the head of the queue
        try {
            String element = queue.element();
            System.out.println("Element at the head: " + element);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Queue is empty.");
        }

        String peekedElement = queue.peek();
        System.out.println("Peeked element: " + (peekedElement != null ? peekedElement : "Queue is empty."));

        // 4. Getting the size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);

        // 5. Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // 6. Checking if the queue contains a specific element
        boolean containsElement = queue.contains("Third");
        System.out.println("Does the queue contain 'Third'? " + containsElement);

        // 7. Clearing the queue
        queue.clear();
        System.out.println("Queue cleared.");

        // 8. Creating an iterator and iterating over elements
        queue.add("A");
        queue.add("B");
        queue.add("C");

        Iterator<String> iterator = queue.iterator();
        System.out.println("Iterating over elements:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}