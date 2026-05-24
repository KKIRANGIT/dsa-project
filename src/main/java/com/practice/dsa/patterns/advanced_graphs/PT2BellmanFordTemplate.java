package com.practice.dsa.patterns.advanced_graphs;

import com.practice.dsa.common.Edge;

import java.util.Arrays;
import java.util.List;

/**
 * Beginner Bellman-Ford pattern.
 */
public class PT2BellmanFordTemplate {
    public int[] shortestPaths(int n, List<Edge> edges, int source) {
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean changed = false;
            for (Edge edge : edges) {
                if (distance[edge.from] != Integer.MAX_VALUE && distance[edge.from] + edge.weight < distance[edge.to]) {
                    distance[edge.to] = distance[edge.from] + edge.weight;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }

        return distance;
    }
}
