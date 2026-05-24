package com.practice.dsa.patterns.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Beginner graph BFS pattern.
 */
public class PT2GraphBfsTemplate {
    public List<Integer> traverse(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> seen = new HashSet<>();

        queue.offer(start);
        seen.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);

            for (int neighbor : graph.getOrDefault(node, List.of())) {
                if (seen.add(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }

        return order;
    }
}
