package com.practice.dsa.problems.trees.invert_binary_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 226 - Invert Binary Tree
 *
 * Beginner idea:
 * Swap left and right children for every node in the tree.
 * Recursion handles the same job for all subtrees.
 */
public class LC226InvertBinaryTreeSolver {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Save one side before overwriting it.
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
