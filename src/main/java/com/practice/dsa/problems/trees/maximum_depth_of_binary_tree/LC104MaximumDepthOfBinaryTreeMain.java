package com.practice.dsa.problems.trees.maximum_depth_of_binary_tree;

import com.practice.dsa.common.TreeNode;

public class LC104MaximumDepthOfBinaryTreeMain {
    public static void main(String[] args) {
        // Build a sample tree.
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        // Print the maximum depth of the tree.
        System.out.println(new LC104MaximumDepthOfBinaryTreeSolver().maxDepth(root));
    }
}
