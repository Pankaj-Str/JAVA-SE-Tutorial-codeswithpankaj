import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // Create a BlockingQueue with a capacity of 5
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(blockingQueue));
        Thread consumerThread = new Thread(new Consumer(blockingQueue));

        // Start the producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private final BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Put an item into the queue
                blockingQueue.put(i);
                System.out.println("Produced: " + i);
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Take an item from the queue
                int value = blockingQueue.take();
                System.out.println("Consumed: " + value);
                Thread.sleep(1500); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
