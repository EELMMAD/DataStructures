package com.elmiramadadi.sortingAlgorithms.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 5, 2, 3, 1, 5, 8};
        var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

//[1, 2, 3, 3, 5, 5, 7, 8]   sorting in ascending order