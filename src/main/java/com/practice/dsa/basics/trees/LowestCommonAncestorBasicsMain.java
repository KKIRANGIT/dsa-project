package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

public class LowestCommonAncestorBasicsMain {
    public static void main(String[] args) {
        // Build the classic sample tree often used in LCA explanations.
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        LowestCommonAncestorBasics basics = new LowestCommonAncestorBasics();
        // Here the targets are 5 and 1, so the answer should be 3.
        TreeNode answer = basics.lca(root, root.left, root.right);
        System.out.println("LCA value = " + answer.val);
    }
}
