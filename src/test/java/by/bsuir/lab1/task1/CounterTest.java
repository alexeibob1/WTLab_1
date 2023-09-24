package by.bsuir.lab1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {
    @Test
    void countWithZeros() {
        double x = 0;
        double y = 0;
        double expectedValue = 0.5;
        double actualValue = Counter.count(x, y);
        assertEquals(expectedValue, actualValue, 1E-6);
    }

    @Test
    void countWithOnes() {
        double x = 1;
        double y = 1;
        double expectedValue = 1.91341;
        double actualValue = Counter.count(x, y);
        assertEquals(expectedValue, actualValue, 1E-6);
    }

    @Test
    void countWithBigNumbers() {
        double x = 143551446.12;
        double y = 1545436346.42;
        double expectedValue = x;
        double actualValue = Counter.count(x, y);
        assertEquals(expectedValue, actualValue, 1E-6);
    }

}