package by.bsuir.lab1.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void checkOnEmptyArr() {
        double[] arr = {};
        double[] expected = {};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }

    @Test
    void checkOnSingleElemArr() {
        double[] arr = {1};
        double[] expected = {1};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }

    @Test
    void checkOnSortedArr() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7};
        double[] expected = {1, 2, 3, 4, 5, 6, 7};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }

    @Test
    void checkOnUnsortedArr() {
        double[] arr = {7, 6, 5, 4, 1, 2, 5};
        double[] expected = {1, 2, 4, 5, 5, 6, 7};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }
}