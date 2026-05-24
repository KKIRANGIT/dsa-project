package com.practice.dsa.problems.trees.validate_binary_search_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 98 - Validate Binary Search Tree
 *
 * Beginner idea:
 * Every node must stay inside a valid range.
 *
 * Example:
 * - Left subtree values must be smaller than the parent.
 * - Right subtree values must be larger than the parent.
 *
 * The allowed range becomes tighter as we go down the tree.
 */
public class LC98ValidateBinarySearchTreeSolver {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        // Current node must fit inside its allowed range.
        if (node.val <= lower || node.val >= upper) {
            return false;
        }

        return validate(node.left, lower, node.val) && validate(node.right, node.val, upper);
    }
}
