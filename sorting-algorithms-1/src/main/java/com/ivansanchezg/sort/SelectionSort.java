package com.ivansanchezg.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array) {
        System.out.println("\nSelectionSort:");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length - 1; i++) {
            int min = i + 1;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            if(array[min] < array[i]) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}