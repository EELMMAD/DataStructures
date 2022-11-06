package com.elmiramadadi.sortingAlgorithms.mergeSort;

//Divide and conquer
public class MergeSort {
    public void sort(int[] array) {
        if(array.length < 2)
          return;

        //****Divide this array into half
                //(1.we have to find the index of the middle element in this array)
                    var middle = array.length / 2;

                //(2.now we allocate a new array that is going to be our left partition.
                // so left was set it to a new integer array with size set to middle.)
                 int[] left = new int[middle];

                //(3.copy of all the items in the input array up to this point in the left partition.)
                for (var i = 0; i < middle; i++) {
                left[i] = array[i];
                }

                //(4.now we need to create right partition as well)
                int[] right = new int[array.length - middle];

                //(5.Now we need to copy all the items that belongs to this partition in this partition.)
                for (var i = middle; i < array.length; i++)
                right[i - middle] = array[i];

        //****Sort each half
             sort(left);
             sort(right);


        //****Merge the result
        merge(left, right, array);

    }
   private void merge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] <= right[j])
               result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
   }
}
