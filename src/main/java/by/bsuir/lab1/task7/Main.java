package by.bsuir.lab1.task7;

import java.util.Arrays;

public class Main {
    public static void sort(double[] arr) {
        int i = 1;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                swap(arr, i, i + 1);
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        double[] arr = {4, 3, 2, 1, 52, 21, 14, 3152, 163, 112, 511, 12, 444, 124, 1, 4, 124, 567};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
