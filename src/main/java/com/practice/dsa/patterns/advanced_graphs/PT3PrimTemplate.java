package com.practice.dsa.patterns.advanced_graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Beginner Prim's algorithm pattern.
 */
public class PT3PrimTemplate {
    public int minimumSpanningTreeCost(int n, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
            graph.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }

        boolean[] used = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{0, 0});

        int total = 0;
        int usedCount = 0;

        while (!pq.isEmpty() && usedCount < n) {
            int[] current = pq.poll();
            int node = current[0];
            int cost = current[1];

            if (used[node]) {
                continue;
            }

            used[node] = true;
            usedCount++;
            total += cost;

            for (int[] neighbor : graph.get(node)) {
                if (!used[neighbor[0]]) {
                    pq.offer(new int[]{neighbor[0], neighbor[1]});
                }
            }
        }

        return usedCount == n ? total : -1;
    }
}
