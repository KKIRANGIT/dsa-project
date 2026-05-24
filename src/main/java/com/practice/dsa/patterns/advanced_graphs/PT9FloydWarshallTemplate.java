package com.practice.dsa.patterns.advanced_graphs;

import java.util.Arrays;

/**
 * Beginner Floyd-Warshall pattern.
 *
 * Use for all-pairs shortest paths on small graphs.
 */
public class PT9FloydWarshallTemplate {
    public int[][] allPairsShortestPath(int n, int[][] edges) {
        int[][] distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], 1_000_000_000);
            distance[i][i] = 0;
        }
        for (int[] edge : edges) {
            distance[edge[0]][edge[1]] = Math.min(distance[edge[0]][edge[1]], edge[2]);
        }

        for (int mid = 0; mid < n; mid++) {
            for (int from = 0; from < n; from++) {
                for (int to = 0; to < n; to++) {
                    distance[from][to] = Math.min(distance[from][to], distance[from][mid] + distance[mid][to]);
                }
            }
        }

        return distance;
    }
}
