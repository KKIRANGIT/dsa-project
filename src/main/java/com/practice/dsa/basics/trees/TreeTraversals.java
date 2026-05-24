package com.practice.dsa.basics.trees;

import com.practice.dsa.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner tree traversal reference.
 *
 * preorder  = root, left, right
 * inorder   = left, root, right
 * postorder = left, right, root
 *
 * These three traversals are not just syntax practice.
 * They teach a beginner one of the most important tree ideas:
 * the position of the "visit current node" line changes the meaning of the traversal.
 */
public class TreeTraversals {
    public List<Integer> preorder(TreeNode root) {
        // Create output list.
        List<Integer> order = new ArrayList<>();
        // Fill it recursively.
        preorder(root, order);
        return order;
    }

    public List<Integer> inorder(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        inorder(root, order);
        return order;
    }

    public List<Integer> postorder(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        postorder(root, order);
        return order;
    }

    private void preorder(TreeNode node, List<Integer> order) {
        if (node == null) {
            return;
        }
        // Preorder means:
        // 1. visit current node now
        // 2. then solve the left subtree
        // 3. then solve the right subtree
        order.add(node.val);
        preorder(node.left, order);
        preorder(node.right, order);
    }

    private void inorder(TreeNode node, List<Integer> order) {
        if (node == null) {
            return;
        }
        // Inorder means:
        // 1. finish the entire left subtree first
        // 2. then visit current node
        // 3. then finish the right subtree
        inorder(node.left, order);
        order.add(node.val);
        inorder(node.right, order);
    }

    private void postorder(TreeNode node, List<Integer> order) {
        if (node == null) {
            return;
        }
        // Postorder means:
        // 1. finish left subtree
        // 2. finish right subtree
        // 3. visit current node last
        postorder(node.left, order);
        postorder(node.right, order);
        order.add(node.val);
    }
}
