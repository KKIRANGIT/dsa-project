package com.practice.dsa.problems.advanced_graphs.min_cost_to_connect_all_points;

import java.util.PriorityQueue;

/**
 * LC 1584 - Min Cost to Connect All Points
 *
 * Beginner idea:
 * This is Prim's MST algorithm on an implicit complete graph.
 */
public class LC1584MinCostToConnectAllPointsSolver {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        minHeap.offer(new int[]{0, 0});

        int totalCost = 0;
        int used = 0;

        while (used < n) {
            int[] current = minHeap.poll();
            int point = current[0];
            int cost = current[1];

            if (visited[point]) {
                continue;
            }

            visited[point] = true;
            totalCost += cost;
            used++;

            for (int next = 0; next < n; next++) {
                if (!visited[next]) {
                    int distance = Math.abs(points[point][0] - points[next][0])
                            + Math.abs(points[point][1] - points[next][1]);
                    minHeap.offer(new int[]{next, distance});
                }
            }
        }

        return totalCost;
    }
}
