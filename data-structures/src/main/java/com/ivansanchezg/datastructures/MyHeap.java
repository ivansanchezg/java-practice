package com.ivansanchezg.datastructures;

import java.util.ArrayList;

public class MyHeap<T extends Comparable<T>> {
    public static final String MIN_HEAP = "minheap";
    public static final String MAX_HEAP = "maxheap";

    
    //List of values in the heap
    private ArrayList<T> heap;
    private String heapType;

    public MyHeap() {
        heap = new ArrayList<T>();
        heapType = MIN_HEAP;
    }

    public MyHeap(String heapType) {
        this.heapType = heapType;
    }

    public MyHeap(ArrayList<T> list) {
        heap = list;
        heapType = MIN_HEAP;
        buildHeap();
    }

    public MyHeap(ArrayList<T> list, String heapType) {
        heap = list;
        this.heapType = heapType;
        buildHeap();
    }

    public MyHeap(T[] values) {
        heap = new ArrayList<T>();
        for(int i = 0; i < values.length; i++) {
            heap.add(values[i]);
        }
        this.heapType = MIN_HEAP;
        buildHeap();
    }

    public MyHeap(T[] values, String heapType) {
        heap = new ArrayList<T>();
        for(int i = 0; i < values.length; i++) {
            heap.add(values[i]);
        }
        this.heapType = heapType;
        buildHeap();
    }

    public void add(T value) {
        heap.add(value);
        buildHeap();
    }

    private void buildHeap() {
        //Start by checking from the middle of the heap
        int i = heap.size()/2;
        while (i >= 0) {
            if(heapType == MIN_HEAP) {
                minHeapify(i);
            } else if(heapType == MAX_HEAP) {
                maxHeapify(i);
            }
            i--;
        }
    }

    private void minHeapify(int i) {
        //left is the index of the child on the left side.
        //right is the index of the child on the right side.
        //parent is the current index that is being checked
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int parent = i;

        //check if the left index is in range of the heap and compare the value on
        //the left index with the value in the smalles index
        if (left < heap.size() && lessThan(left, parent)) {
            parent = left;
        }
        //check if the left index is in range of the heap and compare the value on
        //the left index with the value in the smalles index
        if (right < heap.size() && lessThan(right, parent)) {
            parent = right;
        }
        //if the smallest has been change to the left or right index, then we do the swap
        //and recu
        if (parent != i) {
            swap(parent, i);
            minHeapify(parent);
        }
    }

    private void maxHeapify(int i) {
        //left is the index of the child on the left side.
        //right is the index of the child on the right side.
        //parent is the current index that is being checked
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int parent = i;

        //check if the left index is in range of the heap and compare the value on
        //the left index with the value in the smalles index
        if (left < heap.size() && greaterThan(left, parent)) {
            parent = left;
        }
        //check if the left index is in range of the heap and compare the value on
        //the left index with the value in the smalles index
        if (right < heap.size() && greaterThan(right, parent)) {
            parent = right;
        }
        //if the smallest has been change to the left or right index, then we do the swap
        //and recu
        if (parent != i) {
            swap(parent, i);
            maxHeapify(parent);
        }    
    }

    //swap the values of the two indices
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private boolean lessThan(int i, int j) {
        return heap.get(i).compareTo(heap.get(j)) < 0;
    }

    private boolean greaterThan(int i, int j) {
        return heap.get(i).compareTo(heap.get(j)) > 0;
    }

    public T extract() {
        if (heap.size() <= 0) {
            return null;
        }
        T value = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        if(heapType == MIN_HEAP) {
            minHeapify(0);
        } else if(heapType == MAX_HEAP) {
            maxHeapify(0);
        }
        return value;
    }

    public String toString() {
        String str = "";
        for (T t : heap) {
            str += t.toString() + ", ";
        }
        return str;
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }
}