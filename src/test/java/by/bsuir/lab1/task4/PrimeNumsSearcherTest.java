package by.bsuir.lab1.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumsSearcherTest {

    @Test
    void checkOnEmptyArray() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = PrimeNumsSearcher.findIndexesOfPrimeNums(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void checkOnOneElement() {
        List<Integer> numbers = new ArrayList<>(List.of(67));
        List<Integer> expected = new ArrayList<>(List.of(0));
        List<Integer> actual = PrimeNumsSearcher.findIndexesOfPrimeNums(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void checkOnEmptyResult() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(858584, 459343682, 4564642, 2354, -636, -12, 434));
        List<Integer> expected = new ArrayList<>(List.of());
        List<Integer> actual = PrimeNumsSearcher.findIndexesOfPrimeNums(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void checkOnCompleteResult() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1073676287, 47, 7, 16127, 16769023));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> actual = PrimeNumsSearcher.findIndexesOfPrimeNums(numbers);
        assertEquals(expected, actual);
    }
}