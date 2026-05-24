package com.practice.dsa.problems.trees.balanced_binary_tree;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;

public class LC110BalancedBinaryTreeMain {
    public static void main(String[] args) {
        TreeNode root = StructureBuilder.buildTreeLevelOrder(3, 9, 20, null, null, 15, 7);
        System.out.println(new LC110BalancedBinaryTreeSolver().isBalanced(root));
    }
}
