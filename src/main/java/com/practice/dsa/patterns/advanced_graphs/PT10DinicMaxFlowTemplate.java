package com.practice.dsa.patterns.advanced_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * Beginner Dinic max-flow pattern.
 *
 * Use for flow / cut style graph problems.
 */
public class PT10DinicMaxFlowTemplate {
    private static class Edge {
        int to;
        int rev;
        int capacity;

        Edge(int to, int rev, int capacity) {
            this.to = to;
            this.rev = rev;
            this.capacity = capacity;
        }
    }

    private final List<List<Edge>> graph;
    private final int[] level;
    private final int[] nextEdge;

    public PT10DinicMaxFlowTemplate(int n) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        level = new int[n];
        nextEdge = new int[n];
    }

    public void addEdge(int from, int to, int capacity) {
        Edge forward = new Edge(to, graph.get(to).size(), capacity);
        Edge backward = new Edge(from, graph.get(from).size(), 0);
        graph.get(from).add(forward);
        graph.get(to).add(backward);
    }

    public int maxFlow(int source, int sink) {
        int flow = 0;

        while (buildLevelGraph(source, sink)) {
            Arrays.fill(nextEdge, 0);
            int pushed;
            while ((pushed = dfs(source, sink, Integer.MAX_VALUE)) > 0) {
                flow += pushed;
            }
        }

        return flow;
    }

    private boolean buildLevelGraph(int source, int sink) {
        Arrays.fill(level, -1);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(source);
        level[source] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Edge edge : graph.get(node)) {
                if (edge.capacity > 0 && level[edge.to] == -1) {
                    level[edge.to] = level[node] + 1;
                    queue.offer(edge.to);
                }
            }
        }

        return level[sink] != -1;
    }

    private int dfs(int node, int sink, int flow) {
        if (node == sink) {
            return flow;
        }

        for (; nextEdge[node] < graph.get(node).size(); nextEdge[node]++) {
            Edge edge = graph.get(node).get(nextEdge[node]);
            if (edge.capacity <= 0 || level[edge.to] != level[node] + 1) {
                continue;
            }

            int pushed = dfs(edge.to, sink, Math.min(flow, edge.capacity));
            if (pushed > 0) {
                edge.capacity -= pushed;
                graph.get(edge.to).get(edge.rev).capacity += pushed;
                return pushed;
            }
        }

        return 0;
    }
}
