import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample1{
    public static void main(String[] args) {
        // Create an ArrayBlockingQueue with a capacity of 3
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);

        // Add elements to the queue
        blockingQueue.add(1);
        blockingQueue.add(2);
        blockingQueue.add(3);

        // Try to add one more element, which will throw an IllegalStateException
        try {
            blockingQueue.add(4);
        } catch (IllegalStateException e) {
            System.out.println("Queue is full. Exception caught: " + e.getMessage());
        }

        // Check if the queue contains a specific element
        System.out.println("Queue contains 2: " + blockingQueue.contains(2));

        // Remove all elements from the queue and add them to a collection
        java.util.ArrayList<Integer> collection = new java.util.ArrayList<>();
        blockingQueue.drainTo(collection);

        System.out.println("Elements in the collection: " + collection);

        // Use the forEach method to process each element
        blockingQueue.forEach(item -> System.out.println("Processing: " + item));

        // Create an iterator and iterate through the elements
        java.util.Iterator<Integer> iterator = blockingQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // Offer an element to the queue, which will return false since the queue is full
        boolean offerResult = blockingQueue.offer(4);
        System.out.println("Offer result: " + offerResult);

        // Put an element into the queue, which will block until space is available
        try {
            blockingQueue.put(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Get the remaining capacity of the queue
        int remainingCapacity = blockingQueue.remainingCapacity();
        System.out.println("Remaining capacity: " + remainingCapacity);

        // Remove an element from the queue
        blockingQueue.remove(3);

        // Remove all elements that are also in the specified collection
        java.util.ArrayList<Integer> removalCollection = new java.util.ArrayList<>();
        removalCollection.add(1);
        removalCollection.add(2);
        blockingQueue.removeAll(removalCollection);

        // Remove elements based on a predicate
        blockingQueue.removeIf(item -> item % 2 == 0);

        // Get the size of the queue
        int size = blockingQueue.size();
        System.out.println("Queue size: " + size);

        // Convert the queue to an array
        Integer[] array = blockingQueue.toArray(new Integer[0]);
        System.out.println("Array: " + java.util.Arrays.toString(array));
    }
}
