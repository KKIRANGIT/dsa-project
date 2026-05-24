package com.practice.dsa.basics.trees;

import com.practice.dsa.common.StructureBuilder;
import com.practice.dsa.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Beginner tree serialization reference.
 *
 * This converts a tree into level-order text with "null" markers,
 * then rebuilds the tree from that text.
 */
public class TreeSerializationBasics {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        List<String> values = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                values.add("null");
                continue;
            }

            values.add(String.valueOf(current.val));
            queue.offer(current.left);
            queue.offer(current.right);
        }

        int last = values.size() - 1;
        while (last >= 0 && "null".equals(values.get(last))) {
            last--;
        }

        return "[" + String.join(", ", values.subList(0, last + 1)) + "]";
    }

    public TreeNode deserialize(Integer... values) {
        return StructureBuilder.buildTreeLevelOrder(values);
    }
}
