package by.bsuir.lab1.task4;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumsSearcher {
    private static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) + 1; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findIndexesOfPrimeNums(List<Integer> nums) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (isPrimeNumber(nums.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
