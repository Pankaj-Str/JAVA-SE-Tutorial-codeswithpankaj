import java.util.LinkedList;

public class ProducerConsumerExample{
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread1 = new Thread(new Consumer(buffer));
        Thread consumerThread2 = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}

class Buffer {
    private LinkedList<Integer> buffer;
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
        buffer = new LinkedList<>();
    }

    public synchronized void produce(int item) {
        while (buffer.size() == capacity) {
            try {
                wait(); // Wait if the buffer is full
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify consumers that a new item is available
    }

    public synchronized int consume() {
        while (buffer.isEmpty()) {
            try {
                wait(); // Wait if the buffer is empty
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producers that space is available
        return item;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(100); // Simulate item production time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int item = buffer.consume();
            try {
                Thread.sleep(200); // Simulate item consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
