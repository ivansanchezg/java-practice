package com.ivansanchezg.sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array) {
        System.out.println("\nQuickSort:");
        if (array == null || array.length==0){
            return;
        }
        System.out.println(Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        // Get the pivot element from the middle of the list
        int pivot = array[low + (high-low)/2];

        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while(array[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while(array[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values. As we are done we can increase i and j
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            quicksort(array, low, j);
        }
        if (i < high) {
            quicksort(array, i, high);
        }
    }
}