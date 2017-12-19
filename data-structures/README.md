# data_structures

This project was to practice the concept of the following data structures: Stack, Queue and Heap.

## Import class

```java
import com.ivansanchezg.datastructures.MyStack;
import com.ivansanchezg.datastructures.MyQueue;
import com.ivansanchezg.datastructures.MyHeap;

or

import com.ivansanchezg.datastructures.*;
```

## Compile with jar
Download the `datastructures-1.0.jar` file from this repository or clone the repository and build the project with [Maven](https://maven.apache.org/install.html) with command `$ mvn clean package` and take the jar from the target directory.

```
$ javac -cp .:binarytree-1.0.jar Main.java
$ java -cp .:binarytree-1.0.jar Main
```


## Test Main class
```java
import com.ivansanchezg.datastructures.MyStack;
import com.ivansanchezg.datastructures.MyQueue;
import com.ivansanchezg.datastructures.MyHeap;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>(new Integer[]{10,15,20,25,30});
        myStack.push(35);
        System.out.println("MyStack:");
        while(!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }

        System.out.println("\n\nMyQueue:");
        MyQueue<Integer> myQueue = new MyQueue<Integer>(new Integer[]{10,15,20,25,30});
        myQueue.enqueue(35);
        while(!myQueue.isEmpty()) {
            System.out.print(myQueue.dequeue() + " ");
        }

        System.out.println("\n\nMyHeap (Min):");
        MyHeap<Integer> minHeap = new MyHeap<Integer>(new Integer[]{20,10,25,15,35});
        minHeap.add(30);
        while(!minHeap.isEmpty()) {
            System.out.print(minHeap.extract() + " ");
        }

        System.out.println("\n\nMyHeap (Max):");
        MyHeap<Integer> maxHeap = new MyHeap<Integer>(new Integer[]{20,10,25,15,35}, MyHeap.MAX_HEAP);
        maxHeap.add(30);
        while(!maxHeap.isEmpty()) {
            System.out.print(maxHeap.extract() + " ");
        }
    }
}
```

## MyStack
### Constructors
```java
MyStack<T> myStack = new MyStack<T>();
//New empty stack

MyStack<T> myStack = new MyStack<T>(new T[]{t1,t2,t3});
// New stack with values t3 -> t2 -> t1 stacked
```

### Methods
```java
public void push(T value)
// Push value to top of the stack

public T peek()
// Returns (without removing) the top of the stack

public T pop()
// Returns and removes the top of the stack

public boolean isEmpty()
// Returns true if the stack is empty, otherwise it returns false
```

## MyQueue
### Constructors
```java
MyQueue<T> myQueue = new MyQueue<T>();
//New empty queue

MyQueue<T> myQueue = new MyQueue<T>(new T[]{t1,t2,t3});
// New queue with values t1 -> t2 -> t3 queued
```

### Methods
```java
public void enqueue(T value)
// Enqueue value to the end of the queue

public T peek()
// Returns (without removing) the first element of the queue

public T dequeue()
// Returns and removes the first element of the queue

public boolean isEmpty()
// Returns true if the queue is empty, otherwise it returns false
```

## MyHeap
### Constructors
```java
// T objects must implement interface Comparable

MyHeap<T> myHeap = new MyHeap<T>(); 
// New empty min heap

MyHeap<T> myHeap = new MyHeap<T>(MyHeap.MAX_HEAP); 
// New empty max heap

MyHeap<T> myHeap = new MyHeap<T>(new T[]{t1,t2,t3});
// New min heap with values t1, t2, t3

MyHeap<T> myHeap = new MyHeap<T>(new T[]{t1,t2,t3}, MyHeap.MAX_HEAP);
// New max heap with values t1, t2, t3

ArrayList<T> list = new ArrayList<T>();
list.add(t1);
list.add(t2);
list.add(t3);
MyHeap<T> myHeap = new MyHeap<T>(list);
// New min heap with values t1, t2, t3

ArrayList<T> list = new ArrayList<T>();
list.add(t1);
list.add(t2);
list.add(t3);
MyHeap<T> myHeap = new MyHeap<T>(list, MyHeap.MAX_HEAP);
// New max heap with values t1, t2, t3
```

### Methods
```java
public void add(T value)
// Adds value to the heap and reorganize the heap

public T extract()
// Returns the top of the heap. The lowest value if it is a min heap or the greatest value if it is a max heap

public String toString()
// Returns a string with the values of the heap

public boolean isEmpty()
// Returns true if the heap is empty, otherwise it returns false
```

## To Do
Create a MyLinkedList class