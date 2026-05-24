package com.practice.dsa.basics.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Beginner graph traversal reference.
 *
 * BFS:
 * - uses a queue
 * - explores layer by layer
 *
 * DFS:
 * - uses recursion here
 * - goes deep first, then comes back
 *
 * A beginner should notice that trees are a special kind of graph,
 * but general graphs need a visited set because cycles may exist.
 */
public class GraphTraversal {
    public List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> seen = new HashSet<>();

        queue.offer(start);
        seen.add(start);

        while (!queue.isEmpty()) {
            // Remove the next node to process in FIFO order.
            // FIFO is the reason BFS explores level by level.
            int node = queue.poll();
            order.add(node);
            for (int neighbor : graph.getOrDefault(node, List.of())) {
                // seen.add(...) returns true only the first time we visit a node.
                // That single line prevents infinite loops on cyclic graphs.
                if (seen.add(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }

        return order;
    }

    public List<Integer> dfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        dfs(graph, start, seen, order);
        return order;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> seen, List<Integer> order) {
        if (!seen.add(node)) {
            return;
        }

        // Visit current node first.
        // This is a preorder-style DFS.
        order.add(node);
        // Then explore each neighbor deeply before coming back.
        for (int neighbor : graph.getOrDefault(node, List.of())) {
            dfs(graph, neighbor, seen, order);
        }
    }
}
