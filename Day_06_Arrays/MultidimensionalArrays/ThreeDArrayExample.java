public class ThreeDArrayExample {

    public static void main(String[] args) {
        // Create a 3D array with 2 layers, 3 rows, and 4 columns
        int[][][] array3D = {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            },
            {
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
            }
        };

        // Print the 3D array
        System.out.println("3D Array:");
        print3DArray(array3D);

        // Calculate the sum of all elements in the 3D array
        int sum = sum3DArray(array3D);
        System.out.println("Sum of all elements: " + sum);

        // Find the maximum element in the 3D array
        int max = findMaxIn3DArray(array3D);
        System.out.println("Maximum element: " + max);
    }

    // Method to print a 3D array
    public static void print3DArray(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Method to calculate the sum of all elements in a 3D array
    public static int sum3DArray(int[][][] array3D) {
        int sum = 0;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    sum += array3D[i][j][k];
                }
            }
        }
        return sum;
    }

    // Method to find the maximum element in a 3D array
    public static int findMaxIn3DArray(int[][][] array3D) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    if (array3D[i][j][k] > max) {
                        max = array3D[i][j][k];
                    }
                }
            }
        }
        return max;
    }
}