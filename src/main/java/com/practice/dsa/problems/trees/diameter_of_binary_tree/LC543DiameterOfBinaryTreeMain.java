package com.practice.dsa.problems.trees.diameter_of_binary_tree;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;

public class LC543DiameterOfBinaryTreeMain {
    public static void main(String[] args) {
        TreeNode root = StructureBuilder.buildTreeLevelOrder(1, 2, 3, 4, 5);
        System.out.println(new LC543DiameterOfBinaryTreeSolver().diameterOfBinaryTree(root));
    }
}
