package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

public class PT1DepthFirstTraversalTemplateMain {
    public static void main(String[] args) {
        // Build sample tree.
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15));

        // Create template helper.
        PT1DepthFirstTraversalTemplate template = new PT1DepthFirstTraversalTemplate();
        // Print preorder traversal.
        System.out.println("preorder  = " + template.preorder(root));
        // Print inorder traversal.
        System.out.println("inorder   = " + template.inorder(root));
        // Print postorder traversal.
        System.out.println("postorder = " + template.postorder(root));
    }
}
