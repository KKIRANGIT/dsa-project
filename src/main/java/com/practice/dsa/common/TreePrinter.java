package com.practice.dsa.common;

import java.util.ArrayDeque;
import java.util.Queue;

public final class TreePrinter {
    private TreePrinter() {
    }

    public static String levelOrder(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            builder.append(node.val).append(", ");

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}
