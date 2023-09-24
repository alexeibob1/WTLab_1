package by.bsuir.lab1.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> indexes = findIndexes(new double[]{1, 2, 3, 4, 5, 6}, new double[]{0, 4, 6, 8, 9, 10});
        System.out.println(indexes);
    }

    public static List<Integer> findIndexes(double[] firstArr, double[] secondArr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < secondArr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < firstArr.length; j++) {
                if (secondArr[i] < firstArr[j]) {
                    result.add(j);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(firstArr.length - 1);
            }
        }
        return result;
    }
}
