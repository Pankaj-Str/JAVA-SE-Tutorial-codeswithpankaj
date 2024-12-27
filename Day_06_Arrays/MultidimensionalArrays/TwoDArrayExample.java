public class TwoDArrayExample {

    public static void main(String[] args) {
        // Create a 2D array with 3 rows and 4 columns
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Print the 2D array
        System.out.println("2D Array (Matrix):");
        printMatrix(matrix);

        // Sum all elements in the 2D array
        int sum = sumMatrix(matrix);
        System.out.println("Sum of all elements: " + sum);

        // Find the maximum element in the 2D array
        int max = findMax(matrix);
        System.out.println("Maximum element: " + max);
    }

    // Method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to sum all elements in a 2D array
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Method to find the maximum element in a 2D array
    public static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}