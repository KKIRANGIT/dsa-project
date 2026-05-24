package com.practice.dsa.patterns.advanced_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Beginner DAG-DP pattern.
 *
 * Use when answers propagate along a directed acyclic graph.
 */
public class PT6DagDpTemplate {
    public int longestPathLength(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int node = 0; node < n; node++) {
            if (indegree[node] == 0) {
                queue.offer(node);
            }
        }

        int best = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            best = Math.max(best, dp[node]);

            for (int neighbor : graph.get(node)) {
                dp[neighbor] = Math.max(dp[neighbor], dp[node] + 1);
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return best;
    }
}
