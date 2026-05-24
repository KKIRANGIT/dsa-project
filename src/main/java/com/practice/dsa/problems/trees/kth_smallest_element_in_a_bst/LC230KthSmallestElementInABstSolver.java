package com.practice.dsa.problems.trees.kth_smallest_element_in_a_bst;

import com.practice.dsa.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LC 230 - Kth Smallest Element in a BST
 *
 * Beginner idea:
 * Inorder traversal of a BST visits values in sorted order.
 * So the kth visited node is the kth smallest value.
 */
public class LC230KthSmallestElementInABstSolver {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        int visitedCount = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            visitedCount++;
            if (visitedCount == k) {
                return current.val;
            }

            current = current.right;
        }

        throw new IllegalArgumentException("k is out of range");
    }
}
