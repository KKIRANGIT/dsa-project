package com.practice.dsa.patterns.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Beginner graph DFS pattern.
 */
public class PT1GraphDfsTemplate {
    public List<Integer> traverse(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        dfs(graph, start, new HashSet<>(), order);
        return order;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> seen, List<Integer> order) {
        if (!seen.add(node)) {
            return;
        }
        order.add(node);
        for (int neighbor : graph.getOrDefault(node, List.of())) {
            dfs(graph, neighbor, seen, order);
        }
    }
}
