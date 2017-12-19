package com.ivansanchezg.binarytree;

public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>>{
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode() {
        this(null);
    }

    public int compareTo(TreeNode<T> other) {
        return this.data.compareTo(other.data);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if(obj instanceof TreeNode<?>) {
            TreeNode<?> other = (TreeNode<?>) obj;
            if((this.data == null && other.data != null) || (this.data != null && other.data == null)) {
                return false;
            }
            return this.data.equals(other.data);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return data.toString();
    }
}