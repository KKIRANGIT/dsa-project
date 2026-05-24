package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner tree metrics reference.
 *
 * This class shows two core recursive tree ideas:
 * - computing height
 * - counting total nodes
 */
public class TreeMetricsBasics {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
