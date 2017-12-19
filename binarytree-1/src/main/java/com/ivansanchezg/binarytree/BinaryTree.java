package com.ivansanchezg.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }
    
    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }

    public BinaryTree(T data) {
        TreeNode<T> node = new TreeNode<T>(data);
        this.root = node;
    }

    public BinaryTree(T[] data) {
        for(int index = 0; index < data.length; index++) {
            add(new TreeNode<T>(data[index]));
        }
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void add(T data) {
        add(new TreeNode<T>(data));
    }

    public void add(TreeNode<T> node) {
        if(root == null) {
            root = node;
        } else {
            TreeNode<T> temp = root;
            while(temp != null) {
                if(node.data.compareTo(temp.data) <= 0) {
                    if(temp.left == null) {
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if(temp.right == null) {
                        temp.right = node;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    /*
    public void remove(TreeNode<T> node) {

    }

    public void remove(T data) {

    }
    */

    public boolean contains(TreeNode<T> node) {
        TreeNode<T> temp = this.root;
        while(temp != null) {
            int comparison = temp.compareTo(node);
            if(comparison == 0) {
                return true;
            } else if(comparison > 0) {
                temp = temp.left;
            } else if(comparison < 0) {
                temp = temp.right;
            }
        }
        return false;
    }

    public boolean contains(T data) {
        return contains(new TreeNode<T>(data));
    }

    public int height() {
        return BinaryTreeUtil.height(this.root);
    }

    public int nodeLevel(TreeNode<T> node) {
        if(!contains(node)) {
            return -1;
        }
        return BinaryTreeUtil.nodeLevel(this.root, node);
    }

    public int nodeLevel(T data) {
        return nodeLevel(new TreeNode<T>(data));
    }

    public String preOrder() {
        return TreeTraversalUtil.preOrder(this.root);
    }

    public String inOrder() {
        return TreeTraversalUtil.inOrder(this.root);
    }

    public String postOrder() {
        return TreeTraversalUtil.postOrder(this.root);
    }

    public String topView() {
        return TreeTraversalUtil.topView(this.root);
    }

    public boolean equals(BinaryTree<T> binaryTree) {
        return BinaryTreeUtil.equalTrees(this.root, binaryTree.getRoot());
    }
    
    public TreeNode<T> commonLowestAncestor(TreeNode<T> node1, TreeNode<T> node2) {
        return commonLowestAncestorOrdered(this.root, node1, node2);
    }

    public TreeNode<T> commonLowestAncestor(T value1, T value2) {
        return commonLowestAncestorOrdered(this.root, new TreeNode<T>(value1), new TreeNode<T>(value2));
    }

    private TreeNode<T> commonLowestAncestorOrdered(TreeNode<T> root, TreeNode<T> node1, TreeNode<T> node2) {
        if(node1.compareTo(node2) < 0) {
            return BinaryTreeUtil.commonLowestAncestor(root, node1, node2);
        } else {
            return BinaryTreeUtil.commonLowestAncestor(root, node2, node1);
        }
    }

    public static boolean equalTrees(BinaryTree tree1, BinaryTree tree2) {
        return BinaryTreeUtil.equalTrees(tree1.getRoot(), tree2.getRoot());
    }

    private static boolean equalTrees(TreeNode root1, TreeNode root2) {
        return BinaryTreeUtil.equalTrees(root1, root2);
    }
}
