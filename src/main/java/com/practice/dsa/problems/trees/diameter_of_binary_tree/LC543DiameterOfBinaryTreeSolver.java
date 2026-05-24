package com.practice.dsa.problems.trees.diameter_of_binary_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 543 - Diameter of Binary Tree
 *
 * Beginner idea:
 * At each node, candidate diameter =
 * left subtree height + right subtree height.
 */
public class LC543DiameterOfBinaryTreeSolver {
    private int bestDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        bestDiameter = 0;
        height(root);
        return bestDiameter;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        bestDiameter = Math.max(bestDiameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
