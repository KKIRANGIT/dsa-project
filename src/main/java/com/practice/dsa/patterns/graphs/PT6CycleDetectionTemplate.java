package com.practice.dsa.patterns.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Beginner cycle-detection pattern for directed graphs.
 */
public class PT6CycleDetectionTemplate {
    public boolean hasCycle(Map<Integer, List<Integer>> graph) {
        Set<Integer> visiting = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int node : graph.keySet()) {
            if (dfs(graph, node, visiting, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visiting, Set<Integer> visited) {
        if (visited.contains(node)) {
            return false;
        }
        if (!visiting.add(node)) {
            return true;
        }

        for (int neighbor : graph.getOrDefault(node, List.of())) {
            if (dfs(graph, neighbor, visiting, visited)) {
                return true;
            }
        }

        visiting.remove(node);
        visited.add(node);
        return false;
    }
}
