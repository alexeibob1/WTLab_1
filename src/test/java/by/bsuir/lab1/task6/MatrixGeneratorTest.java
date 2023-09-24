package by.bsuir.lab1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixGeneratorTest {
    private void assertMatrices(double[][] expected, double[][] actual) {
        assertEquals(expected.length, actual.length);
        if (expected.length != 0 && actual.length != 0) {
            assertEquals(expected[0].length, actual[0].length);
            for (int i = 0; i < expected.length; i++) {
                assertArrayEquals(expected[i], actual[i]);
            }
        }
    }

    @Test
    void checkOnEmptyArr() {
        double[] arr = {};
        double[][] expected = {};
        double[][] actual = MatrixGenerator.createMatrix(arr);
        assertMatrices(expected, actual);
    }

    @Test
    void checkOnSingleElemArr() {
        double[] arr = {1};
        double[][] expected = {
                {1}
        };
        double[][] actual = MatrixGenerator.createMatrix(arr);
        assertMatrices(expected, actual);
    }

    @Test
    void checkOnTwoElemArr() {
        double[] arr = {1, 5};
        double[][] expected = {
                {1, 5},
                {5, 1}
        };
        double[][] actual = MatrixGenerator.createMatrix(arr);
        assertMatrices(expected, actual);
    }

    @Test
    void checkOnSimpleArr() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 1},
                {3, 4, 5, 6, 7, 8, 9, 10, 1, 2},
                {4, 5, 6, 7, 8, 9, 10, 1, 2, 3},
                {5, 6, 7, 8, 9, 10, 1, 2, 3, 4},
                {6, 7, 8, 9, 10, 1, 2, 3, 4, 5},
                {7, 8, 9, 10, 1, 2, 3, 4, 5, 6},
                {8, 9, 10, 1, 2, 3, 4, 5, 6, 7},
                {9, 10, 1, 2, 3, 4, 5, 6, 7, 8},
                {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        };
        double[][] actual = MatrixGenerator.createMatrix(arr);
        assertMatrices(expected, actual);
    }
}