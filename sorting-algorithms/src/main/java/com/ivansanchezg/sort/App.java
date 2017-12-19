package com.ivansanchezg.sort;

public class App 
{
    public static void main( String[] args )
    {
        //n^2 Sortings algorithms
        //Add true as the second parameter to see more information in the console. BubbleSort.sort(array, true);
        BubbleSort.sort(createArray());
        // SelectionSort.sort(createArray());
        // InsertionSort.sort(createArray());
        // ShellSort.sort(createArray());
        
        //nlog(n) Sortings algorithms
        // QuickSort.sort(createArray());
        // MergeSort.sort(createArray());
    }

    private static int[] createArray() {
        return new int[]{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    }
}
