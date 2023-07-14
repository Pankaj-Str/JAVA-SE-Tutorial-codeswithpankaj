# Java Multidimensional Array

A multidimensional array is an array of arrays. It allows you to organize data in a tabular form with multiple dimensions. Each element of a multidimensional array is itself an array.

Let's break down the concept with an example of a two-dimensional array, often referred to as a matrix. Consider the following code:

```java
int[][] matrix = new int[3][4];
```

Here, we create a 2D array called `matrix` with 3 rows and 4 columns. The outermost square brackets `[3]` represent the number of rows, and the innermost square brackets `[4]` represent the number of columns. This means our matrix will have 3 rows and 4 columns.

To initialize or access elements in the array, we use the row and column indices. For example, `matrix[1][2]` refers to the element in the second row (index 1) and the third column (index 2) of the matrix.

![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/1676b82f-562a-409e-b441-522161c509d8)


To initialize values in the array, you can assign them individually:

```java
matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[0][2] = 3;
matrix[0][3] = 4;

matrix[1][0] = 5;
matrix[1][1] = 6;
matrix[1][2] = 7;
matrix[1][3] = 8;

matrix[2][0] = 9;
matrix[2][1] = 10;
matrix[2][2] = 11;
matrix[2][3] = 12;
```

In this example, we assign values to each element of the array by specifying the row and column indices.

To access a specific element, you can use the indices as well:

```java
int value = matrix[1][2]; // Retrieves the value 7
```

This retrieves the value at the second row (index 1) and third column (index 2) of the matrix.

To iterate over the multidimensional array, you can use nested loops. For example, to print the contents of the matrix, you can do the following:

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

The outer loop iterates over the rows, and the inner loop iterates over the columns of each row. We access each element using the row and column indices and print them. The outer loop is responsible for printing each row on a new line.

You can extend this concept to create arrays with more dimensions by adding additional sets of square brackets. For example, a three-dimensional array would have three sets of square brackets: `int[][][] threeDArray = new int[3][4][5];`. The initialization, access, and iteration would follow a similar pattern, with additional nested loops for each additional dimension.
