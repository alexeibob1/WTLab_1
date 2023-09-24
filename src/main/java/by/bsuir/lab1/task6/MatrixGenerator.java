package by.bsuir.lab1.task6;

public class MatrixGenerator {
    public static double[][] createMatrix(double[] arr) {
        int n = arr.length;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[(j + i) % n];
            }
        }
        return matrix;
    }
}
