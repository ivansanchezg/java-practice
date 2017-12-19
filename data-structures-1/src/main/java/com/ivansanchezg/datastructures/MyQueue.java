package com.ivansanchezg.datastructures;

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    
    public MyQueue() {
        head = null;
        tail = null;
    }

    public MyQueue(T[] values) {
        head = null;
        tail = null;
        for(int i = 0; i < values.length; i++) {
            enqueue(values[i]);
        }
    }

    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public T dequeue() {
        if(head != null) {
            T data = head.data;
            head = head.next;
            return data;
        } else {
            return null;
        }
    }

    public T peek() {
        if(head != null) {
            T data = head.data;
            return data;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}