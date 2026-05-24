package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

public class PT4BstValidationTemplateMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        PT4BstValidationTemplate template = new PT4BstValidationTemplate();
        System.out.println(template.isValid(root));
    }
}
