package com.ivansanchezg.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        System.out.println("\nBubbleSort:");
        sort(array, false);
    }

    public static void sort(int[] array, boolean log) {
        System.out.println(Arrays.toString(array));
        int swaps = 0;
        int comparisons = 0;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 1; j < array.length - i; j++) {
                comparisons++;
                if(array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swaps++;
                }
            }
            if(log) {
                System.out.println("\nFound value for index: " + i);
                System.out.println(Arrays.toString(array));
            }
        }
        
        System.out.println(Arrays.toString(array));
        System.out.println("Total swaps: " + swaps);
        System.out.println("Total comparisons: " + comparisons);
    }
}