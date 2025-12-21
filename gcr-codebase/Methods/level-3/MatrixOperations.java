import java.util.Scanner;

/*
  *created a class named MatrixOperations that  
 * This program performs matrix operations such as
 * addition, subtraction, and multiplication on
 * randomly generated matrices.
 */

public class MatrixOperations{

   //Creates a random matrix of given rows and columns.
   public static int[][] createRandomMatrix(int rows, int cols) {

       int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0–9
            }
        }

        return matrix;

   }

   // Adds two matrices.
   public static int[][] addMatrices(int[][] a, int[][] b) {

       int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++ ) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
   }

   //Subtracts two matrices.
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

    //Multiplies two matrices.
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {

        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

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

    //Displays a matrix.
    public static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
   
   public static void main(String[] args) {

       // Create random matrices
        int[][] matrixA = createRandomMatrix(2, 3);
        int[][] matrixB = createRandomMatrix(2, 3);
        int[][] matrixC = createRandomMatrix(3, 2);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("A + B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("A - B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication
        System.out.println("A x C:");
        displayMatrix(multiplyMatrices(matrixA, matrixC));
    }
}

