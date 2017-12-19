package com.ivansanchezg.search;

public class BinarySearch {
    public static int search(int[] array, int search) {
        //Check if the array is sorted. If it is not, return -1
        int i = 0;
        while(i < array.length - 1 && array[i] < array[i + 1]) {
            i++;
        }
        if(i != array.length - 1) {
            System.out.println("Array is not sorted");
            return -1;
        }

        //Calculate the middle of the array.
        //If the value in the middle is equal to the search value, then we return it.
        
        //If the search value is greater than the middle value, then we reduce the search 
        //from the middle plus 1 to the end and recalculate the middle
        
        //If the search value is less than the middle value, then we reduce the search 
        //from the start to the middle minus 1 and recalculate the middle
        
        //If the start of the search is greater than the end of the search, we didn't find the value and we return -1
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(array[mid] == search) {
                return mid;
            } else {
                if(search > array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}