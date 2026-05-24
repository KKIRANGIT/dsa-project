package com.practice.dsa.problems.trees.construct_binary_tree_from_preorder_and_inorder_traversal;

import com.practice.dsa.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 105 - Construct Binary Tree from Preorder and Inorder Traversal
 *
 * Beginner idea:
 * Preorder gives the root first.
 * Inorder tells us how the tree splits into left subtree and right subtree.
 */
public class LC105ConstructBinaryTreeFromPreorderAndInorderTraversalSolver {
    private int preorderIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        int inorderIndex = inorderIndexMap.get(rootValue);

        root.left = build(preorder, left, inorderIndex - 1);
        root.right = build(preorder, inorderIndex + 1, right);
        return root;
    }
}
