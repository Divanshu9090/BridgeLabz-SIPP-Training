import java.util.Scanner;

public class MatrixManipulation {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix A columns must match Matrix B rows for multiplication.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input for matrix dimensions
        System.out.print("Enter number of rows for matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = input.nextInt();

        // Create two random matrices
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        // Display the matrices
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        // Perform addition and display the result
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of Matrix A and B:");
        printMatrix(sum);

        // Perform subtraction and display the result
        int[][] difference = subtractMatrices(matrixA, matrixB);
        System.out.println("Difference of Matrix A and B:");
        printMatrix(difference);

        // Perform multiplication
        // For multiplication, we need to ensure the second matrix has compatible
        // dimensions
        System.out.print("Enter number of columns for second matrix (for multiplication): ");
        int colsB = input.nextInt();
        int[][] matrixC = createRandomMatrix(cols, colsB); // Create a new random matrix for multiplication

        System.out.println("Matrix C (for multiplication):");
        printMatrix(matrixC);

        // Multiply matrix A and matrix C and display the result
        int[][] product = multiplyMatrices(matrixA, matrixC);
        System.out.println("Product of Matrix A and C:");
        printMatrix(product);

        // Close the scanner
        input.close();
    }
}