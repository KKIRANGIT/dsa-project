package com.practice.dsa.problems.trees.maximum_depth_of_binary_tree;

import com.practice.dsa.common.TreeNode;

/**
 * LC 104 - Maximum Depth of Binary Tree
 *
 * Beginner idea:
 * Depth of a node =
 * 1 + deeper side between left subtree and right subtree.
 */
public class LC104MaximumDepthOfBinaryTreeSolver {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
