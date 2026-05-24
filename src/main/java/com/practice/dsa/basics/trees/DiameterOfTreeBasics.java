package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

/**
 * Beginner diameter reference.
 *
 * Diameter means the number of edges on the longest path between any two nodes.
 *
 * Important beginner idea:
 * height and diameter are related.
 * At every node, the longest path through that node is:
 * left subtree height + right subtree height
 */
public class DiameterOfTreeBasics {
    private int bestDiameter;

    public int diameter(TreeNode root) {
        // Reset shared answer before each fresh calculation.
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

        // If the longest path passes through this node,
        // it uses the deepest edge-chain from the left
        // plus the deepest edge-chain from the right.
        bestDiameter = Math.max(bestDiameter, leftHeight + rightHeight);

        // Return subtree height upward so the parent can use it.
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
