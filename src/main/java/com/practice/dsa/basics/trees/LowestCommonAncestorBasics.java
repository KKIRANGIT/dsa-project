package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner LCA reference for a normal binary tree.
 *
 * The lowest common ancestor is the lowest node that has both targets in its subtree.
 *
 * A good beginner way to think about the recursion:
 * each subtree answers this question:
 * "Did I find either target down here, and if so which node should I return upward?"
 */
public class LowestCommonAncestorBasics {
    public TreeNode lca(TreeNode root, TreeNode first, TreeNode second) {
        if (root == null) {
            return null;
        }

        if (root == first || root == second) {
            // If current node is one of the targets,
            // return it upward as a successful find.
            return root;
        }

        // Search both subtrees independently.
        TreeNode left = lca(root.left, first, second);
        TreeNode right = lca(root.right, first, second);

        if (left != null && right != null) {
            // One target was found on the left and the other on the right.
            // That makes the current node their lowest common ancestor.
            return root;
        }

        // Otherwise return whichever side found something.
        return left != null ? left : right;
    }
}
