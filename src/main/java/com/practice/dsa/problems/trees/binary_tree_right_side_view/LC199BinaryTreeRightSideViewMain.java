package com.practice.dsa.problems.trees.binary_tree_right_side_view;

import com.practice.dsa.common.TreeNode;

public class LC199BinaryTreeRightSideViewMain {
    public static void main(String[] args) {
        // Build a tree where each level has a clear rightmost node.
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));

        System.out.println("LC199 = " + new LC199BinaryTreeRightSideViewSolver().rightSideView(root));
    }
}
