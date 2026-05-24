package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner DFS tree traversal pattern.
 *
 * Shows the three classic recursive orders:
 * preorder, inorder, postorder
 */
public class PT1DepthFirstTraversalTemplate {
    public List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Root before children.
        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Root between left and right.
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Root after children.
        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.val);
    }
}
