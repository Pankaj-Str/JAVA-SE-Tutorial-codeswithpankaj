import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RestaurantExample {
    public static void main(String[] args) {
        BlockingQueue<Order> kitchen = new ArrayBlockingQueue<>(10);
        BlockingQueue<Order> servingTable = new ArrayBlockingQueue<>(10);

        Thread chefThread = new Thread(new Chef(kitchen));
        Thread waiterThread = new Thread(new Waiter(kitchen, servingTable));

        chefThread.start();
        waiterThread.start();
    }
}

class Order {
    private final String dishName;

    public Order(String dishName) {
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }
}

class Chef implements Runnable {
    private BlockingQueue<Order> kitchen;

    public Chef(BlockingQueue<Order> kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Order order = new Order("Dish " + i);
                kitchen.put(order);
                System.out.println("Chef prepared " + order.getDishName());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Waiter implements Runnable {
    private BlockingQueue<Order> kitchen;
    private BlockingQueue<Order> servingTable;

    public Waiter(BlockingQueue<Order> kitchen, BlockingQueue<Order> servingTable) {
        this.kitchen = kitchen;
        this.servingTable = servingTable;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Order order = kitchen.take();
                System.out.println("Waiter served " + order.getDishName());
                servingTable.put(order);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
