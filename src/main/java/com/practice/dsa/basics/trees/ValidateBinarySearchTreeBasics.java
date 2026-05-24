package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner BST validation reference.
 *
 * Important beginner idea:
 * checking only the direct children is not enough.
 * Every node must stay inside the full valid range passed down from ancestors.
 */
public class ValidateBinarySearchTreeBasics {
    public boolean isValid(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long lowerBound, long upperBound) {
        if (node == null) {
            return true;
        }

        if (node.val <= lowerBound || node.val >= upperBound) {
            return false;
        }

        return validate(node.left, lowerBound, node.val)
                && validate(node.right, node.val, upperBound);
    }
}
