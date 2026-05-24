package com.practice.dsa.problems.trees.binary_tree_right_side_view;

import com.practice.dsa.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * LC 199 - Binary Tree Right Side View
 *
 * Beginner idea:
 * Level-order traversal lets us process the tree one level at a time.
 * The last node we see in each level is the node visible from the right side.
 */
public class LC199BinaryTreeRightSideViewSolver {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (i == levelSize - 1) {
                    answer.add(node.val);
                }
            }
        }

        return answer;
    }
}
