package com.practice.dsa.problems.trees.lowest_common_ancestor_of_a_binary_search_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 235 - Lowest Common Ancestor of a Binary Search Tree
 *
 * Beginner idea:
 * A BST keeps smaller values on the left and larger values on the right.
 * So if both target nodes are smaller, walk left.
 * If both target nodes are larger, walk right.
 * The first node where they split is the answer.
 */
public class LC235LowestCommonAncestorOfABinarySearchTreeSolver {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while (current != null) {
            if (p.val < current.val && q.val < current.val) {
                current = current.left;
            } else if (p.val > current.val && q.val > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }

        return null;
    }
}
