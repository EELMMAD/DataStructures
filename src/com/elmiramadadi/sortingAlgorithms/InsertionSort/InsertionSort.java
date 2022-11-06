package com.elmiramadadi.sortingAlgorithms.InsertionSort;

public class InsertionSort {
    public void sort(int[] array) {
        for (var i = 1; i < array.length; i++) {
            var current = array[i];
            var j = i - 1;  //It starts from previous item
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j]; // all the grater items have been shifted to the right
                j--;
            }
            array[j + 1] = current;
        }
    }
}
