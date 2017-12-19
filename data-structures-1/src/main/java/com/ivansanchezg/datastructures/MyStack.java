package com.ivansanchezg.datastructures;
public class MyStack<T> {
    private Node<T> head;
    
    public MyStack() {
        head = null;
    }

    public MyStack(T[] values) {
        head = null;
        for(int i = 0; i < values.length; i++) {
            push(values[i]);
        }
    }

    public void push(T data) {
        Node<T> node = new Node<T>(data);
        Node<T> temp = head;
        head = node;
        node.next = temp;
    }

    public T pop() {
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