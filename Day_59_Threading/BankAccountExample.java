import java.util.concurrent.locks.ReentrantLock;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread thread1 = new Thread(new AccountHolder("Alice", account, 100));
        Thread thread2 = new Thread(new AccountHolder("Bob", account, 150));

        thread1.start();
        thread2.start();
    }
}

class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
}

class AccountHolder implements Runnable {
    private String name;
    private BankAccount account;
    private double transactionAmount;

    public AccountHolder(String name, BankAccount account, double transactionAmount) {
        this.name = name;
        this.account = account;
        this.transactionAmount = transactionAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(transactionAmount);
            account.withdraw(transactionAmount);
            System.out.println(name + " - Current Balance: " + account.getBalance());
        }
    }
}
