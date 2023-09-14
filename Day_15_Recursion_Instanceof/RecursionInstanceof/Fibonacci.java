package Day_15_Recursion_Instanceof.RecursionInstanceof;

public class Fibonacci {
    public static int fibonacci(int n) {
        // Base cases: Fibonacci of 0 is 0 and Fibonacci of 1 is 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: Fibonacci of n is the sum of the previous two Fibonacci numbers
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 7;
        int result = fibonacci(number);
        System.out.println("Fibonacci number at position " + number + " is: " + result);
    }
}
