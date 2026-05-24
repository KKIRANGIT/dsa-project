package com.practice.dsa.basics.trees;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;
import com.practice.dsa.common.TreePrinter;

public class DiameterOfTreeBasicsMain {
    public static void main(String[] args) {
        // Longest path here is 4 -> 2 -> 1 -> 3, so diameter is 3 edges.
        TreeNode root = StructureBuilder.buildTreeLevelOrder(1, 2, 3, 4, 5);
        System.out.println("tree shape = " + TreePrinter.levelOrder(root));
        System.out.println("diameter = " + new DiameterOfTreeBasics().diameter(root));
    }
}
