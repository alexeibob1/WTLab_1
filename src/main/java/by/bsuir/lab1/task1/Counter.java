package by.bsuir.lab1.task1;

public class Counter {
    public static double count(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        double denominator = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
        return numerator / denominator + x;
    }
}
