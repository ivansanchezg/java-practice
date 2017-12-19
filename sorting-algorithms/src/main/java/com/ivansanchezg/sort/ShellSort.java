package com.ivansanchezg.sort;

import java.util.Arrays;

public class ShellSort {
    public static void sort(int[] array) {
        System.out.println("\nShellSort:");
        System.out.println(Arrays.toString(array));
        int inner, outer;
        int temp;
    
        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
        
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        System.out.println(Arrays.toString(array));
    }
}