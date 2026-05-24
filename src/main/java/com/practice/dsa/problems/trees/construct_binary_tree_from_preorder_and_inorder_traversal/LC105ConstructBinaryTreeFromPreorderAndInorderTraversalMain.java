package com.practice.dsa.problems.trees.construct_binary_tree_from_preorder_and_inorder_traversal;

import com.practice.dsa.common.TreePrinter;

public class LC105ConstructBinaryTreeFromPreorderAndInorderTraversalMain {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        System.out.println("LC105 = " + TreePrinter.levelOrder(
                new LC105ConstructBinaryTreeFromPreorderAndInorderTraversalSolver().buildTree(preorder, inorder)));
    }
}
