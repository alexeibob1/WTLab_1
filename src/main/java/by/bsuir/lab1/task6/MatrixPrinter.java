package by.bsuir.lab1.task6;

public class MatrixPrinter {
    public static void printMatrix(double[][] matrix) {
        int n = matrix.length;
        int m = 0;
        if (n != 0) {
            m = matrix[0].length;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.format("%3.0f", matrix[i][j]);
            }
            System.out.println();
        }
    }
}