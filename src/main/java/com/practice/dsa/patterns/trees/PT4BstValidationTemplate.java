package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner BST-validation pattern.
 *
 * Use when each node must stay inside a valid lower/upper range.
 */
public class PT4BstValidationTemplate {
    public boolean isValid(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return validate(node.left, lower, node.val) && validate(node.right, node.val, upper);
    }
}
