package com.practice.dsa.problems.trees.binary_tree_level_order_traversal;

import com.practice.dsa.common.TreeNode;

public class LC102BinaryTreeLevelOrderTraversalMain {
    public static void main(String[] args) {
        // Build a sample tree.
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        // Print the nodes level by level.
        System.out.println(new LC102BinaryTreeLevelOrderTraversalSolver().levelOrder(root));
    }
}
