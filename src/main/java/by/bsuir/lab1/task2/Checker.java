package by.bsuir.lab1.task2;

public class Checker {
    public static boolean check(int x, int y) {
        return isBottomPart(x, y) || isTopPart(x, y);
    }

    private static boolean isBottomPart(int x, int y) {
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
    }

    private static boolean isTopPart(int x, int y) {
        return (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }
}
