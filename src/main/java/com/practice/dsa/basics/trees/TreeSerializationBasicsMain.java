package com.practice.dsa.basics.trees;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;
import com.practice.dsa.common.TreePrinter;

public class TreeSerializationBasicsMain {
    public static void main(String[] args) {
        TreeNode root = StructureBuilder.buildTreeLevelOrder(1, 2, 3, null, 4, 5, null);
        TreeSerializationBasics basics = new TreeSerializationBasics();

        String serialized = basics.serialize(root);
        TreeNode rebuilt = basics.deserialize(1, 2, 3, null, 4, 5, null);

        System.out.println("serialized = " + serialized);
        System.out.println("rebuilt    = " + TreePrinter.levelOrder(rebuilt));
    }
}
