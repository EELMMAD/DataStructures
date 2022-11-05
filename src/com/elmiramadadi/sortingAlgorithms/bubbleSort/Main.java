package com.elmiramadadi.sortingAlgorithms.bubbleSort;

import com.elmiramadadi.sortingAlgorithms.bubbleSort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {};
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
