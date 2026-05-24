package com.practice.dsa.basics.trees;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;
import com.practice.dsa.common.TreePrinter;

public class ValidateBinarySearchTreeBasicsMain {
    public static void main(String[] args) {
        TreeNode valid = StructureBuilder.buildTreeLevelOrder(2, 1, 3);
        TreeNode invalid = StructureBuilder.buildTreeLevelOrder(5, 1, 4, null, null, 3, 6);

        ValidateBinarySearchTreeBasics basics = new ValidateBinarySearchTreeBasics();
        System.out.println("valid tree   = " + TreePrinter.levelOrder(valid));
        System.out.println("is valid BST = " + basics.isValid(valid));
        System.out.println("invalid tree = " + TreePrinter.levelOrder(invalid));
        System.out.println("is valid BST = " + basics.isValid(invalid));
    }
}
