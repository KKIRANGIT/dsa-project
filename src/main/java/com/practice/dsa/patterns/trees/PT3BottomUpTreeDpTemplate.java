package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner bottom-up tree DP pattern.
 *
 * Use when each node answer is built from child answers.
 */
public class PT3BottomUpTreeDpTemplate {
    public int diameterLikeHeight(TreeNode root) {
        return height(root);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
