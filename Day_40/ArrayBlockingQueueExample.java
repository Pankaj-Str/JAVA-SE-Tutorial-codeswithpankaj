import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        // Create an ArrayBlockingQueue with a capacity of 3
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    // Put items into the queue
                    blockingQueue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    // Take items from the queue
                    int value = blockingQueue.take();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start the producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
