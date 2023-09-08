package Day_41;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
 {
    public static void main(String[] args) {
        // Create a LinkedBlockingQueue with a maximum capacity of 10
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        // Create and start producer and consumer threads
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private final LinkedBlockingQueue<Integer> queue;

    public Producer(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Put items into the queue
                queue.put(i);
                System.out.println("Produced: " + i);
                Thread.sleep(100); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final LinkedBlockingQueue<Integer> queue;

    public Consumer(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Take items from the queue
                Integer item = queue.take();
                System.out.println("Consumed: " + item);
                Thread.sleep(200); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
