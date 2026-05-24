package com.practice.dsa.problems.advanced_graphs.network_delay_time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LC 743 - Network Delay Time
 *
 * Beginner idea:
 * This is Dijkstra's algorithm.
 * The priority queue always expands the node with the smallest known distance first.
 */
public class LC743NetworkDelayTimeSolver {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] time : times) {
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];

            // Ignore outdated longer paths.
            if (dist > distance[node]) {
                continue;
            }

            for (int[] neighbor : graph.get(node)) {
                int next = neighbor[0];
                int candidate = dist + neighbor[1];
                if (candidate < distance[next]) {
                    // Found a better path to next.
                    distance[next] = candidate;
                    pq.offer(new int[]{next, candidate});
                }
            }
        }

        int answer = 0;
        for (int node = 1; node <= n; node++) {
            if (distance[node] == Integer.MAX_VALUE) {
                return -1;
            }
            answer = Math.max(answer, distance[node]);
        }
        return answer;
    }
}
