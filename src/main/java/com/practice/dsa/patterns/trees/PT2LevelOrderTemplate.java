package com.practice.dsa.patterns.trees;

import com.practice.dsa.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Beginner level-order traversal pattern.
 *
 * This is BFS on a tree.
 * Queue processes nodes level by level.
 */
public class PT2LevelOrderTemplate {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Result holds one list per tree level.
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Queue stores nodes waiting to be processed.
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // Number of nodes currently in this level.
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                // Children belong to the next level.
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
