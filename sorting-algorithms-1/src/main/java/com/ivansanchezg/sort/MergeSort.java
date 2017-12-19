package com.ivansanchezg.sort;

import java.util.Arrays;
public class MergeSort {
    public static void sort(int[] array) {
        System.out.println("\nMergeSort:");
        System.out.println(Arrays.toString(array));
        split(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    //Split the array until we have each value as a single entity, then we merge them
    private static void split(int[] array, int start, int end) {
        if(start < end) {
            int middle = start + (end - start)/2;
            split(array, start, middle);
            split(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        //Store values on temporary array
        int[] temp = new int[end + 1];
        for(int i = start; i <= end; i++) {
            temp[i] = array[i];
        }

        int left = start;
        int mid = middle + 1;
        int index = start;
        //Copy the smallest value into the array
        while(left <= middle && mid <= end) {
            if(temp[left] <= temp[mid]) {
                array[index] = temp[left];
                left++;
            } else {
                array[index] = temp[mid];
                mid++;
            }
            index++;
        }
        //Copy the rest of the left side of the array into the array
        while(left <= middle) {
            array[index] = temp[left];
            index++;
            left++;
        }
    }
}