package com.practice.dsa.patterns.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Beginner topological-sort pattern using Kahn's algorithm.
 *
 * Works for directed acyclic graphs.
 */
public class PT5TopologicalSortTemplate {
    public List<Integer> topoSort(int n, int[][] edges) {
        // Graph adjacency list.
        List<List<Integer>> graph = new ArrayList<>();
        // indegree[node] counts incoming edges.
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        // Queue starts with nodes that have no prerequisites.
        Queue<Integer> queue = new ArrayDeque<>();
        for (int node = 0; node < n; node++) {
            if (indegree[node] == 0) {
                queue.offer(node);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            // Remove next available node.
            int node = queue.poll();
            order.add(node);

            for (int neighbor : graph.get(node)) {
                // One prerequisite has been satisfied.
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return order;
    }
}
