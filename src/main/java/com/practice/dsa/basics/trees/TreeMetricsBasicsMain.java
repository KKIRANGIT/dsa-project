package com.practice.dsa.basics.trees;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;

public class TreeMetricsBasicsMain {
    public static void main(String[] args) {
        TreeNode root = StructureBuilder.buildTreeLevelOrder(1, 2, 3, 4, 5, null, 7);
        TreeMetricsBasics basics = new TreeMetricsBasics();

        System.out.println("height = " + basics.height(root));
        System.out.println("count nodes = " + basics.countNodes(root));
    }
}
