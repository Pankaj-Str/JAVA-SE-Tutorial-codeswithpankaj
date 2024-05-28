package p4n;

public class BankAccount{
  
    private String accountNumber;
    private double balance;

 
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

 
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public double getBalance() {
        return balance;
    }

 
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Accessing and modifying instance variables using getter and setter methods
        System.out.println("Initial Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.setAccountNumber("987654321");
        account.setBalance(1500.0);

        System.out.println("Updated Account Number: " + account.getAccountNumber());
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
