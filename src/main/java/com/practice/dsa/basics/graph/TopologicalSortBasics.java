package com.practice.dsa.basics.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Beginner topological sort reference using Kahn's algorithm.
 *
 * Important beginner idea:
 * indegree[node] means how many prerequisites are still unfinished.
 */
public class TopologicalSortBasics {
    public List<Integer> topoSort(int nodeCount, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[nodeCount];

        for (int node = 0; node < nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            indegree[to]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int node = 0; node < nodeCount; node++) {
            if (indegree[node] == 0) {
                // Nodes with indegree 0 are ready immediately.
                queue.offer(node);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);

            for (int neighbor : graph.get(node)) {
                // "Finish" current node, so each outgoing neighbor
                // loses one remaining prerequisite.
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return order;
    }
}
