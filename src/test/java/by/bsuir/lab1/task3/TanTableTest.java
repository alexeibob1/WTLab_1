package by.bsuir.lab1.task3;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TanTableTest {
    private void initExpectedTable(Map<Double, Double> expected, double a, double b, double h) {
        for (double x = a; x <= b; x += h) {
            expected.put(x, Math.tan(x));
        }
    }

    @Test
    void checkOnSymmetricalSegment() {
        Map<Double, Double> expected = new TreeMap<>();
        double a = -1;
        double b = 1;
        double h = 0.2;
        initExpectedTable(expected, a, b, h);
        Map<Double, Double> actual = TanTable.generateTable(a, b, h);
        assertEquals(expected, actual);
    }

    @Test
    void checkOnAsymmetricalSegment() {
        Map<Double, Double> expected = new TreeMap<>();
        double a = -5;
        double b = 1;
        double h = 0.3;
        initExpectedTable(expected, a, b, h);
        Map<Double, Double> actual = TanTable.generateTable(a, b, h);
        assertEquals(expected, actual);
    }

    @Test
    void checkOnZeroSegment() {
        Map<Double, Double> expected = new TreeMap<>();
        double a = 0;
        double b = 0;
        double h = 1;
        initExpectedTable(expected, a, b, h);
        Map<Double, Double> actual = TanTable.generateTable(a, b, h);
        assertEquals(expected, actual);
    }

    @Test
    void checkOnBigNumbers() {
        Map<Double, Double> expected = new TreeMap<>();
        double a = -1E6;
        double b = 25E6;
        double h = 10;
        initExpectedTable(expected, a, b, h);
        Map<Double, Double> actual = TanTable.generateTable(a, b, h);
        assertEquals(expected, actual);
    }
}