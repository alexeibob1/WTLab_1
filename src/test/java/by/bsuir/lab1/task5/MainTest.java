package by.bsuir.lab1.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void checkOnDescSortedArr() {
        int expected = 5;
        int actual = Main.findLeastNumberOfElements(new int[]{5, 4, 3, 2, 1, 0});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnEmptyArr() {
        int expected = 0;
        int actual = Main.findLeastNumberOfElements(new int[]{});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnSingleElemArr() {
        int expected = 0;
        int actual = Main.findLeastNumberOfElements(new int[]{15});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnAscSortedArr() {
        int expected = 0;
        int actual = Main.findLeastNumberOfElements(new int[]{10, 46, 47, 109, 577, 1345});
        assertEquals(expected, actual);
    }

    @Test
    void checkOnSimpleArr() {
        int expected = 5;
        int actual = Main.findLeastNumberOfElements(new int[]{45, 12, 2, 67, 46, 13, 12});
        assertEquals(expected, actual);
    }
}