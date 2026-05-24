package com.practice.dsa.basics.graph;

import java.util.List;

/**
 * Beginner undirected-graph cycle detection reference.
 */
public class GraphCycleDetectionBasics {
    public boolean hasCycle(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];

        for (int node = 0; node < graph.size(); node++) {
            if (!visited[node] && dfs(graph, node, -1, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean dfs(List<List<Integer>> graph, int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, node, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}
