package com.practice.dsa.basics.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Beginner Dijkstra reference.
 *
 * Use this when edges have non-negative weights.
 *
 * Queue state format:
 * - index 0 = node
 * - index 1 = current known distance to that node
 */
public class DijkstraBasics {
    public int[] shortestPaths(int nodeCount, int[][] edges, int source) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int node = 0; node < nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            // edge = {from, to, weight}
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        int[] distance = new int[nodeCount];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        minHeap.offer(new int[]{source, 0});

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int node = current[0];
            int cost = current[1];

            if (cost > distance[node]) {
                // This queue entry is stale.
                // A better route to this node was already found later.
                continue;
            }

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                int nextCost = cost + weight;

                if (nextCost < distance[nextNode]) {
                    // Found a better path to the neighbor.
                    distance[nextNode] = nextCost;
                    minHeap.offer(new int[]{nextNode, nextCost});
                }
            }
        }

        return distance;
    }
}
