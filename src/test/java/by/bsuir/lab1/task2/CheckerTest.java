package by.bsuir.lab1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckerTest {
    @Test
    void checkOnZeros() {
        assertTrue(Checker.check(0, 0));
    }

    @Test
    void checkOnBigIntegers() {
        assertFalse(Checker.check(1000000000, 1000000000));
    }

    @Test
    void checkOnBorders() {
        assertTrue(Checker.check(0, 5));
    }

    @Test
    void checkInCorners() {
        assertTrue(Checker.check(6, -3));
    }
}