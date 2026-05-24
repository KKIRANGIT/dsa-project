package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

public class PT3BottomUpTreeDpTemplateMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        PT3BottomUpTreeDpTemplate template = new PT3BottomUpTreeDpTemplate();
        System.out.println(template.diameterLikeHeight(root));
    }
}
