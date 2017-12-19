package com.ivansanchezg.sort;

import java.util.Arrays;
public class InsertionSort {
    public static void sort(int[] array) {
        System.out.println("\nInsertionSort:");
        System.out.println(Arrays.toString(array));
        for(int i = 1; i < array.length; i++) {
            //Temporarily save the value that we are inserting
            int temp = array[i];

            int j = i - 1;
            boolean rotation = false;
            //Check if the number to the left is greater
            //If it is, we rotate it to right and check the next one
            while(j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
                rotation = true;
            }
            //If a rotation of values was performed then we insert the
            //value stored in temp into its new position
            if(rotation) {
                array[j + 1] = temp;    
            }
        }
        System.out.println(Arrays.toString(array));
    }
}