package com.practice.dsa.problems.trees.validate_binary_search_tree;

import com.practice.dsa.common.TreeNode;

public class LC98ValidateBinarySearchTreeMain {
    public static void main(String[] args) {
        // Build a valid BST.
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        // Print whether the tree satisfies BST rules.
        System.out.println(new LC98ValidateBinarySearchTreeSolver().isValidBST(root));
    }
}
