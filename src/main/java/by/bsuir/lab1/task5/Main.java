package by.bsuir.lab1.task5;

public class Main {
    public static int findLeastNumberOfElements(int[] arr) {
        final int MIN = Integer.MIN_VALUE;
        final int MAX = Integer.MAX_VALUE;
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            return 0;
        }
        int n = arr.length;
        int length = 0;
        int[] extraArr = new int[n];
        extraArr[0] = MIN;
        for (int i = 1; i < n; i++) {
            extraArr[i] = MAX;
        }
        for (int i = 0; i < n - 1; i++) {
            int j = binarySearch(extraArr, 0, n - 1, arr[i]);
            if (extraArr[j - 1] < arr[i] && arr[i] < extraArr[j]) {
                extraArr[j] = arr[i];
                length = Math.max(length, j);
            }
        }
        return n - length;
    }

    private static int binarySearch(int[] arr, int l, int r, int searchElem) {
        int m = -1;
        if (searchElem < arr[l])
            return l;
        if (searchElem > arr[r])
            return r;
        while (l <= r) {
            m = (l + r) / 2;
            if (searchElem >= arr[m] && searchElem < arr[m + 1])
                return m + 1;
            if (searchElem < arr[m])
                r = m - 1;
            if (searchElem > arr[m])
                l = m + 1;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(findLeastNumberOfElements(new int[]{13, 51, 93, 91, 42, 36, 96, 37, 27, 18}));
        System.out.println(findLeastNumberOfElements(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
