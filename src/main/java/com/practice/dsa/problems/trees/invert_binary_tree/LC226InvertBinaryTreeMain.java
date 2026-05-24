package com.practice.dsa.problems.trees.invert_binary_tree;

import com.practice.dsa.common.TreeNode;
import com.practice.dsa.common.TreePrinter;

public class LC226InvertBinaryTreeMain {
    public static void main(String[] args) {
        // Build the sample tree.
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        // Invert the tree and print level-order traversal.
        System.out.println(TreePrinter.levelOrder(new LC226InvertBinaryTreeSolver().invertTree(root)));
    }
}
