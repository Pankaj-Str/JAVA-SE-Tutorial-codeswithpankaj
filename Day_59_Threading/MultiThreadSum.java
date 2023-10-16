public class MultiThreadSum {
    private static final int NUM_THREADS = 4;  // Number of threads to use
    private static final int ARRAY_SIZE = 1000000;
    private static final int[] array = new int[ARRAY_SIZE];

    public static void main(String[] args) {
        // Initialize the array with random values
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Create an array of thread objects
        Thread[] threads = new Thread[NUM_THREADS];
        SumThread[] workers = new SumThread[NUM_THREADS];

        int elementsPerThread = ARRAY_SIZE / NUM_THREADS;
        int startIndex = 0;
        int endIndex;

        // Create and start threads
        for (int i = 0; i < NUM_THREADS; i++) {
            endIndex = startIndex + elementsPerThread;
            workers[i] = new SumThread(startIndex, endIndex);
            threads[i] = new Thread(workers[i]);
            threads[i].start();
            startIndex = endIndex;
        }

        // Wait for all threads to finish
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate the total sum
        int totalSum = 0;
        for (int i = 0; i < NUM_THREADS; i++) {
            totalSum += workers[i].getPartialSum();
        }

        System.out.println("Total sum: " + totalSum);
    }
}

class SumThread implements Runnable {
    private int startIndex;
    private int endIndex;
    private int partialSum;

    public SumThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += MultiThreadSum.array[i];
        }
    }

    public int getPartialSum() {
        return partialSum;
    }
}
