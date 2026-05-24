package com.practice.dsa.problems.trees.same_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 100 - Same Tree
 *
 * Beginner idea:
 * Two trees are the same only if:
 * - both nodes are null
 * - or both values match and both subtrees match
 */
public class LC100SameTreeSolver {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
