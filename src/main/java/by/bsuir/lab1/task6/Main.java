package by.bsuir.lab1.task6;

import static by.bsuir.lab1.task6.MatrixPrinter.printMatrix;
import static by.bsuir.lab1.task6.MatrixGenerator.createMatrix;

public class Main {
    public static void main(String[] args) {
        printMatrix(createMatrix(new double[]{1, 2, 3, 4, 5, 6, 7}));
    }
}
