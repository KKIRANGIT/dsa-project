package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreePrinter;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        // Create BST object.
        BinarySearchTree bst = new BinarySearchTree();
        // Insert sample values.
        // Their relative sizes determine the tree shape.
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);

        // Print tree in level order.
        System.out.println("tree = " + TreePrinter.levelOrder(bst.root()));
        // Search for present value: path is 8 -> 3 -> 6.
        System.out.println("search 6  = " + bst.search(6));
        // Search for missing value.
        System.out.println("search 14 = " + bst.search(14));
    }
}
