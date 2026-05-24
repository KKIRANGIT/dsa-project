package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

public class PT2LevelOrderTemplateMain {
    public static void main(String[] args) {
        // Build sample tree.
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));

        // Create template helper.
        PT2LevelOrderTemplate template = new PT2LevelOrderTemplate();
        // Print level-order traversal.
        System.out.println(template.levelOrder(root));
    }
}
