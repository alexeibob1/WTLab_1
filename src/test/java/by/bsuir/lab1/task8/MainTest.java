package by.bsuir.lab1.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void checkOnEmptyInput() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Main.findIndexes(new double[]{}, new double[]{});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnCompleteInput() {
        List<Integer> expected = Arrays.asList(0, 4, 5, 5, 5, 5);
        List<Integer> actual = Main.findIndexes(new double[]{1, 2, 3, 4, 5, 6}, new double[]{0, 4, 6, 8, 9, 10});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnSingleElemArrays() {
        List<Integer> expected = Arrays.asList(0);
        List<Integer> actual = Main.findIndexes(new double[]{1}, new double[]{1});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnSingleElemFirstArr() {
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0);
        List<Integer> actual = Main.findIndexes(new double[]{1}, new double[]{1, 2, 3, 4, 5, 6});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnSingleElemSecondArr() {
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = Main.findIndexes(new double[]{1, 2, 3, 4, 5, 6, 7}, new double[]{5.5});
        assertEquals(expected, actual);
    }
}