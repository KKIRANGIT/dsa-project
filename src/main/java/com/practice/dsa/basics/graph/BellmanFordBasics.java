package com.practice.dsa.basics.graph;

import com.practice.dsa.common.Edge;

import java.util.Arrays;

/**
 * Beginner Bellman-Ford reference.
 *
 * Use this when:
 * - weights may be negative
 * - repeated edge relaxation is easier than Dijkstra
 */
public class BellmanFordBasics {
    public int[] shortestPaths(int nodeCount, Edge[] edges, int source) {
        int[] distance = new int[nodeCount];
        Arrays.fill(distance, Integer.MAX_VALUE / 4);
        distance[source] = 0;

        for (int round = 1; round <= nodeCount - 1; round++) {
            boolean changed = false;

            for (Edge edge : edges) {
                if (distance[edge.from] + edge.weight < distance[edge.to]) {
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
