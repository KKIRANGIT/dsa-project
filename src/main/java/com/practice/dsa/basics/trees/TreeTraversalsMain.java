package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

public class TreeTraversalsMain {
    public static void main(String[] args) {
        // Build sample tree.
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));

        // Create traversal helper.
        TreeTraversals traversals = new TreeTraversals();
        // Print preorder traversal.
        System.out.println("preorder  = " + traversals.preorder(root));
        // Print inorder traversal.
        System.out.println("inorder   = " + traversals.inorder(root));
        // Print postorder traversal.
        System.out.println("postorder = " + traversals.postorder(root));
    }
}
