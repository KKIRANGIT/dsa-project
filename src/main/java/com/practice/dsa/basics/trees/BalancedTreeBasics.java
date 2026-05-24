package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner balanced-tree reference.
 *
 * A tree is height-balanced when, for every node,
 * the left and right subtree heights differ by at most 1.
 *
 * Important beginner idea:
 * we do not want to compute subtree height again and again.
 * So one recursion call returns:
 * - the subtree height if everything is still balanced
 * - `-1` as a special failure signal if balance already broke below
 */
public class BalancedTreeBasics {
    public boolean isBalanced(TreeNode root) {
        // If the helper returns -1, some subtree was unbalanced.
        return heightOrFail(root) != -1;
    }

    private int heightOrFail(TreeNode node) {
        if (node == null) {
            // Empty subtree height is 0.
            return 0;
        }

        // Ask the left subtree for its height.
        int leftHeight = heightOrFail(node.left);
        if (leftHeight == -1) {
            // Left subtree already found an imbalance.
            // Bubble the failure upward immediately.
            return -1;
        }

        // Ask the right subtree for its height.
        int rightHeight = heightOrFail(node.right);
        if (rightHeight == -1) {
            // Right subtree already found an imbalance.
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            // Current node itself breaks the balance rule.
            return -1;
        }

        // Tree is balanced here, so return its height upward.
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
