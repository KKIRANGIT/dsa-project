package com.practice.dsa.problems.trees.balanced_binary_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 110 - Balanced Binary Tree
 *
 * Beginner idea:
 * Return subtree height when balanced.
 * Return -1 immediately when some subtree is unbalanced.
 */
public class LC110BalancedBinaryTreeSolver {
    public boolean isBalanced(TreeNode root) {
        return heightOrFail(root) != -1;
    }

    private int heightOrFail(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = heightOrFail(node.left);
        if (left == -1) {
            return -1;
        }

        int right = heightOrFail(node.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}
