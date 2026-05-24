package com.practice.dsa.patterns.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner bridge-finding pattern.
 *
 * Use when removing one edge may disconnect the graph.
 */
public class PT8BridgeFindingTemplate {
    private int time;
    private int[] discovery;
    private int[] low;
    private List<List<Integer>> graph;
    private List<List<Integer>> bridges;

    public List<List<Integer>> findBridges(int n, int[][] edges) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        time = 0;
        discovery = new int[n];
        low = new int[n];
        bridges = new ArrayList<>();

        dfs(0, -1);
        return bridges;
    }

    private void dfs(int node, int parent) {
        discovery[node] = low[node] = ++time;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) {
                continue;
            }

            if (discovery[neighbor] == 0) {
                dfs(neighbor, node);
                low[node] = Math.min(low[node], low[neighbor]);
                if (low[neighbor] > discovery[node]) {
                    bridges.add(List.of(node, neighbor));
                }
            } else {
                low[node] = Math.min(low[node], discovery[neighbor]);
            }
        }
    }
}
