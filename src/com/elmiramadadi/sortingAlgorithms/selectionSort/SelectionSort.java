package com.elmiramadadi.sortingAlgorithms.selectionSort;

public class SelectionSort {
    public void sort(int[] array){
        for(var i = 0; i < array.length; i++){
            //in each iteration we should find next minimum value
         var minIndex = i;
         for(var j = i; j < array.length; j++)
             if(array[j] < array[minIndex])
                 minIndex = j;
         swap(array, minIndex, i);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
