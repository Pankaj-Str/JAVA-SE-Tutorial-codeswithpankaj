import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array based on the user input
        int[] numbers = new int[size];

        // Get values for the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        // Calculate the average of array elements
        double average = (double) sum / size;

        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close the Scanner
        scanner.close();
    }
}
