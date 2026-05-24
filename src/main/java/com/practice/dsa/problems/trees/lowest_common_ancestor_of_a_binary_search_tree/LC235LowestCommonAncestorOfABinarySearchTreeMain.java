package com.practice.dsa.problems.trees.lowest_common_ancestor_of_a_binary_search_tree;

import com.practice.dsa.common.TreeNode;

public class LC235LowestCommonAncestorOfABinarySearchTreeMain {
    public static void main(String[] args) {
        // Build a BST because this problem depends on BST ordering.
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));

        // Choose two nodes from different sides of node 2.
        TreeNode p = root.left;
        TreeNode q = root.left.right;

        // The answer should be node 2 because it is the first split point.
        TreeNode answer = new LC235LowestCommonAncestorOfABinarySearchTreeSolver().lowestCommonAncestor(root, p, q);
        System.out.println("LC235 = " + (answer == null ? "null" : answer.val));
    }
}
