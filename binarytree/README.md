# Binary Tree Java class

This Java class allows users to create binary trees. The Binary Tree can be created with Generics for any class that implements the Comparable interface.

## Import class

```java
import com.ivansanchezg.binarytree.BinaryTree;
```

## Compile with jar
Download the `binarytree-1.0.jar` file from this repository or clone the repository and build the project with [Maven](https://maven.apache.org/install.html) with command `$ mvn clean package` and take the jar from the target directory.

```
$ javac -cp .:binarytree-1.0.jar Main.java
$ java -cp .:binarytree-1.0.jar Main
```

## Test Main class
```java
import com.ivansanchezg.binarytree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{100,50,25,75,150,125,175};
        BinaryTree<Integer> tree = new BinaryTree<Integer>(array);

        if(tree.contains(150)) {
            System.out.println("Value 150 is in the tree");
        }
        System.out.println("Tree height: " + tree.height());
        System.out.println("Node level for 150: " + tree.nodeLevel(150));
        System.out.println("Preorder: " + tree.preOrder());
        System.out.println("InOrder: " + tree.inOrder());
        System.out.println("PostOrder: " + tree.postOrder());
    }
}
```

## Creating a Binary Tree

```java
BinaryTree<Integer> tree = new BinaryTree<Integer>();      // New tree

BinaryTree<Integer> tree = new BinaryTree<Integer>(100);   // New tree with root value = 100

TreeNode<String> node = new TreeNode<String>("Hello");
BinaryTree<String> tree = new BinaryTree<String>(node);    // New tree with root equal to the TreeNode 

Integer[] array = new Integer[]{100,50,25,75,150,125,175};
BinaryTree<Integer> tree = new BinaryTree<Integer>(array); // New tree that add values from the array in order.
```

## Methods

```java
public TreeNode<T> getRoot()
// Returns root of the tree

public void add(T data)
public void add(TreeNode<T> node)
// Adds to the tree a new TreeNode with the data provides

public boolean contains(TreeNode<T> node)
public boolean contains(T data)
// Returns true if the tree contains the node

public int height()
// Returns the height of the binary tree

public int nodeLevel(TreeNode<T> node)
public int nodeLevel(T data)
// Returns the level of a node in the tree. If the node is not in the tree it will return -1

public String preOrder()
// Returns a string with the data of the tree in Pre-Order format

public String inOrder()
// Returns a string with the data of the tree in In-Order format

public String postOrder()
// Returns a string with the data of the tree in Post-Order format

public String topView()
// Returns a string with the data of the tree in Top View format

public boolean equals(BinaryTree<T> binaryTree)
// Returns true if the binaryTree is equals to the tree. Returns false otherwise. Two tree are equals if they have the same structure of nodes and the same data in the in nodes

public TreeNode<T> commonLowestAncestor(TreeNode<T> node1, TreeNode<T> node2)
public TreeNode<T> commonLowestAncestor(T value1, T value2)
// Returns the TreeNode that is the common lowest ancestor of the two nodes.

public static boolean equalTrees(BinaryTree tree1, BinaryTree tree2)
// Returns true if the binaryTree is equals to the tree. Returns false otherwise. Two tree are equals if they have the same structure of nodes and the same data in the in nodes
```

## To Do
```java
public void remove(TreeNode<T> TreeNode) 
public void remove(T data)
```