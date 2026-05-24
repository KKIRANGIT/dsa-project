package com.practice.dsa.problems.trees.binary_tree_level_order_traversal;

import com.practice.dsa.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * LC 102 - Binary Tree Level Order Traversal
 *
 * Beginner idea:
 * This is BFS on a tree.
 * The queue stores nodes waiting to be processed.
 * Each loop over queue.size() processes exactly one level.
 */
public class LC102BinaryTreeLevelOrderTraversalSolver {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            // Process only the nodes that were already in the queue
            // when this level started.
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}
