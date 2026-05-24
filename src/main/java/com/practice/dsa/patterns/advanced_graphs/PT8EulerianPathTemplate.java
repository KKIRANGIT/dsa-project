package com.practice.dsa.patterns.advanced_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Beginner Eulerian-path / Hierholzer pattern.
 *
 * Use when each edge must be used exactly once.
 */
public class PT8EulerianPathTemplate {
    public List<Integer> path(int[][] edges, int start) {
        Map<Integer, Deque<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], ignored -> new ArrayDeque<>()).offer(edge[1]);
        }

        List<Integer> order = new ArrayList<>();
        dfs(graph, start, order);
        java.util.Collections.reverse(order);
        return order;
    }

    private void dfs(Map<Integer, Deque<Integer>> graph, int node, List<Integer> order) {
        Deque<Integer> nextNodes = graph.getOrDefault(node, new ArrayDeque<>());

        while (!nextNodes.isEmpty()) {
            dfs(graph, nextNodes.pollFirst(), order);
        }

        order.add(node);
    }
}
