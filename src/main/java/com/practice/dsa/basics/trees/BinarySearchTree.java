package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner binary search tree reference.
 *
 * BST rule:
 * - left subtree values are smaller
 * - right subtree values are larger
 *
 * Important beginner idea:
 * the BST rule lets us throw away half of the search space conceptually,
 * because every comparison tells us whether to go left or right.
 */
public class BinarySearchTree {
    // Root node of the tree.
    private TreeNode root;

    public void insert(int value) {
        // Rebuild root after recursive insertion.
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        // Empty spot found: create the new node here.
        if (node == null) {
            return new TreeNode(value);
        }

        if (value < node.val) {
            // Smaller values go left.
            node.left = insert(node.left, value);
        } else if (value > node.val) {
            // Larger values go right.
            node.right = insert(node.right, value);
        }
        // Return current node so links stay connected.
        return node;
    }

    public boolean search(int value) {
        // Start from root.
        TreeNode current = root;
        while (current != null) {
            if (value == current.val) {
                return true;
            }
            // Choose direction based on BST rule:
            // smaller goes left, larger goes right.
            current = value < current.val ? current.left : current.right;
        }
        return false;
    }

    public TreeNode root() {
        // Return root node.
        return root;
    }
}
