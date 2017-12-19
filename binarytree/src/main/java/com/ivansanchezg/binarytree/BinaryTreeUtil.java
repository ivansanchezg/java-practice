package com.ivansanchezg.binarytree;

class BinaryTreeUtil {
    public static int height(TreeNode root) {
        return calculateHeight(root);
    }

    private static int calculateHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
    }
    
    public static int nodeLevel(TreeNode root, TreeNode node) {
        return calculateNodeLevel(root, node, 1);
    }

    private static int calculateNodeLevel(TreeNode root, TreeNode node, int level) {
        if(root == null) {
            return 0;
        }
        if(root.equals(node)) {
            return level;
        }
        return Math.max(calculateNodeLevel(root.left, node, level + 1), 
                        calculateNodeLevel(root.right, node, level + 1));
    }
    

    public static boolean equalTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        
        if(root1 == null && root2 != null) {
            return false;
        }

        if(root1 != null && root2 == null) {
            return false;
        }

        if(root1.data != root2.data) {
            return false;
        }
        
        return equalTrees(root1.left, root2.left) && equalTrees(root1.right, root2.right);
    }

    public static TreeNode commonLowestAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        if(root == null) {
            return null;
        }
        
        if(root.compareTo(node1) > 0 && root.compareTo(node2) < 0) {
            return root;
        }
        
        if(root.compareTo(node1) > 0 && root.compareTo(node2) > 0) {
            return commonLowestAncestor(root.left, node1, node2);
        }
        
        if(root.compareTo(node1) < 0 && root.compareTo(node2) < 0) {
            return commonLowestAncestor(root.right, node1, node2);
        }
        return root;
    }
}