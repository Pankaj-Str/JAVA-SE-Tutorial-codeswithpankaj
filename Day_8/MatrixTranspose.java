// Java Program to Find Transpose of a Matrix
// p4n.in
// codeswithpankaj.com

public class MatrixTranspose {
    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Find the transpose
        int[][] transposeMatrix = findTranspose(matrix);

        // Display the result
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose of the Matrix:");
        displayMatrix(transposeMatrix);
    }

    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
