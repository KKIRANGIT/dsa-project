package com.practice.dsa.basics.graph;

import java.util.List;

/**
 * Beginner connected-components reference.
 *
 * This is one of the most common graph foundations.
 */
public class ConnectedComponentsBasics {
    public int countComponents(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        int components = 0;

        for (int node = 0; node < graph.size(); node++) {
            if (!visited[node]) {
                components++;
                dfs(graph, node, visited);
            }
        }

        return components;
    }

    private void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            dfs(graph, neighbor, visited);
        }
    }
}
