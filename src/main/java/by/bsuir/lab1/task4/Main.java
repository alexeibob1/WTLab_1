package by.bsuir.lab1.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(17, 2, 3, 65, 13));
        List<Integer> indexes = PrimeNumsSearcher.findIndexesOfPrimeNums(arr);
        if (indexes.size() != 0) {
            System.out.println("Indexes of prime numbers: " + indexes);
        } else {
            System.out.println("There are not any prime numbers in the array!");
        }
    }
}
