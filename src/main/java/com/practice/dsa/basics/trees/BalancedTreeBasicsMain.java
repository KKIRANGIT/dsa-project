package com.practice.dsa.basics.trees;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;
import com.practice.dsa.common.TreePrinter;

public class BalancedTreeBasicsMain {
    public static void main(String[] args) {
        // Complete-looking tree: heights stay close on both sides.
        TreeNode balanced = StructureBuilder.buildTreeLevelOrder(1, 2, 3, 4, 5, 6, 7);
        // Left-heavy chain: the balance rule breaks here.
        TreeNode unbalanced = StructureBuilder.buildTreeLevelOrder(1, 2, null, 3, null, 4, null);

        BalancedTreeBasics basics = new BalancedTreeBasics();
        System.out.println("balanced tree shape = " + TreePrinter.levelOrder(balanced));
        System.out.println("balanced tree = " + basics.isBalanced(balanced));
        System.out.println("unbalanced tree shape = " + TreePrinter.levelOrder(unbalanced));
        System.out.println("unbalanced tree = " + basics.isBalanced(unbalanced));
    }
}
