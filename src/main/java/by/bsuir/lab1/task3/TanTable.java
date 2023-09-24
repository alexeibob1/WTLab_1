package by.bsuir.lab1.task3;

import java.util.Map;
import java.util.TreeMap;

public class TanTable {
    public static void printTable(Map<Double, Double> table) {
        for (Double x : table.keySet()) {
            System.out.format("| %7.3f | %7.3f |\n", x, table.get(x));
        }
    }

    public static Map<Double, Double> generateTable(double a, double b, double step) {
        Map<Double, Double> table = new TreeMap<>();
        for (double x = a; x <= b; x += step) {
            table.put(x, Math.tan(x));
        }
        return table;
    }
}
