package com.practice.dsa.common;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class StructureBuilder {
    private StructureBuilder() {
    }

    public static ListNode buildLinkedList(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        return dummy.next;
    }

    public static DoublyListNode buildDoublyLinkedList(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        DoublyListNode head = new DoublyListNode(values[0]);
        DoublyListNode current = head;

        for (int index = 1; index < values.length; index++) {
            DoublyListNode next = new DoublyListNode(values[index]);
            current.next = next;
            next.prev = current;
            current = next;
        }

        return head;
    }

    public static TreeNode buildTreeLevelOrder(Integer... values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            if (index < values.length && values[index] != null) {
                current.left = new TreeNode(values[index]);
                queue.offer(current.left);
            }
            index++;

            if (index < values.length && values[index] != null) {
                current.right = new TreeNode(values[index]);
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

    public static List<List<Integer>> buildUndirectedGraph(int nodeCount, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int node = 0; node < nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        if (edges == null) {
            return graph;
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        return graph;
    }

    public static List<List<Integer>> buildDirectedGraph(int nodeCount, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int node = 0; node < nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        if (edges == null) {
            return graph;
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        return graph;
    }

    public static List<List<Edge>> buildWeightedUndirectedGraph(int nodeCount, int[][] edges) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int node = 0; node < nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        if (edges == null) {
            return graph;
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            graph.get(from).add(new Edge(from, to, weight));
            graph.get(to).add(new Edge(to, from, weight));
        }

        return graph;
    }

    public static List<List<Edge>> buildWeightedDirectedGraph(int nodeCount, int[][] edges) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int node = 0; node < nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        if (edges == null) {
            return graph;
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            graph.get(from).add(new Edge(from, to, weight));
        }

        return graph;
    }
}
