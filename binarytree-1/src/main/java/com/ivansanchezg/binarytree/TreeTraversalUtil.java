package com.ivansanchezg.binarytree;

class TreeTraversalUtil {
    public static String preOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString().trim();
    }

    private static void preOrder(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        sb.append(root.data.toString() + " ");
        preOrder(root.left, sb);
        preOrder(root.right, sb);
    }

    public static String inOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        inOrder(root, sb);
        return sb.toString().trim();
    }

    private static void inOrder(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        inOrder(root.left, sb);
        sb.append(root.data.toString() + " ");
        inOrder(root.right, sb);
    }

    public static String postOrder(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        postOrder(root, sb);
        return sb.toString().trim();
    }

    private static void postOrder(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        postOrder(root.left, sb);
        postOrder(root.right, sb);
        sb.append(root.data.toString() + " ");
    }

    public static String topView(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        topViewLeft(root.left, sb);
        sb.append(root.data.toString() + " ");
        topViewRight(root.right, sb);
        return sb.toString().trim();
    }

    private static void topViewLeft(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        topViewLeft(root.right, sb);
        sb.append(root.data.toString() + " ");
    }

    private static void topViewRight(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        sb.append(root.data.toString() + " ");
        topViewRight(root.right, sb);
    }
}