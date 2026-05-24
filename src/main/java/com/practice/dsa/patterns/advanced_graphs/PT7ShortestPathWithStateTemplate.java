package com.practice.dsa.patterns.advanced_graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Beginner shortest-path-with-state pattern.
 *
 * Use when the BFS/Dijkstra state is not only position,
 * but position plus extra information like key-mask, steps used, or parity.
 */
public class PT7ShortestPathWithStateTemplate {
    public int shortestPathVisitAllNodes(int[][] graph) {
        int n = graph.length;
        int finalMask = (1 << n) - 1;
        int[][] distance = new int[n][1 << n];

        for (int[] row : distance) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        for (int node = 0; node < n; node++) {
            int mask = 1 << node;
            queue.offer(new int[]{node, mask});
            distance[node][mask] = 0;
        }

        while (!queue.isEmpty()) {
            int[] state = queue.poll();
            int node = state[0];
            int mask = state[1];

            if (mask == finalMask) {
                return distance[node][mask];
            }

            for (int neighbor : graph[node]) {
                int nextMask = mask | (1 << neighbor);
                if (distance[neighbor][nextMask] == -1) {
                    distance[neighbor][nextMask] = distance[node][mask] + 1;
                    queue.offer(new int[]{neighbor, nextMask});
                }
            }
        }

        return -1;
    }
}
