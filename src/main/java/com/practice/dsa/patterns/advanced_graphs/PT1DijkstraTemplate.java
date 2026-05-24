package com.practice.dsa.patterns.advanced_graphs;

import com.practice.dsa.common.Edge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Beginner Dijkstra pattern.
 *
 * Finds shortest path from one source in a graph with non-negative weights.
 */
public class PT1DijkstraTemplate {
    public int[] shortestPaths(int n, List<Edge> edges, int source) {
        // Build adjacency list: each entry stores {neighbor, weight}.
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (Edge edge : edges) {
            graph.get(edge.from).add(new int[]{edge.to, edge.weight});
        }

        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        // Priority queue stores {node, best-known-distance}.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];

            // Ignore stale longer states.
            if (dist > distance[node]) {
                continue;
            }

            for (int[] neighbor : graph.get(node)) {
                int next = neighbor[0];
                int weight = neighbor[1];
                int candidate = dist + weight;

                if (candidate < distance[next]) {
                    // Found better path.
                    distance[next] = candidate;
                    pq.offer(new int[]{next, candidate});
                }
            }
        }

        return distance;
    }
}
