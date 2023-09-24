package by.bsuir.lab1.task3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Double, Double> table = TanTable.generateTable(-1, 1, 0.2);
        TanTable.printTable(table);
    }
}
