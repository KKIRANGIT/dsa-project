package com.practice.dsa.problems.trees.kth_smallest_element_in_a_bst;

import com.practice.dsa.common.TreeNode;

public class LC230KthSmallestElementInABstMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(6));

        System.out.println("LC230 = " + new LC230KthSmallestElementInABstSolver().kthSmallest(root, 3));
    }
}
