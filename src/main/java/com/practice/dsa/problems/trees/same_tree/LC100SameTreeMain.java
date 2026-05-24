package com.practice.dsa.problems.trees.same_tree;

import com.practice.dsa.common.TreeNode;

public class LC100SameTreeMain {
    public static void main(String[] args) {
        TreeNode first = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode second = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println(new LC100SameTreeSolver().isSameTree(first, second));
    }
}
