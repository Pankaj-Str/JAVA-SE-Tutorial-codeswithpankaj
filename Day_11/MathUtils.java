package Day_11;
// p4n.in
// codeswithpankaj.com

public class MathUtils {
    // Method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    // Method to calculate the sum of two numbers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Method to calculate the average of an array of numbers
    public static double average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    // Main method to demonstrate the methods
    public static void main(String[] args) {
        int result1 = square(5);
        System.out.println("Square: " + result1);

        int result2 = sum(10, 20);
        System.out.println("Sum: " + result2);

        int[] array = {5, 10, 15, 20, 25};
        double result3 = average(array);
        System.out.println("Average: " + result3);
    }
}
