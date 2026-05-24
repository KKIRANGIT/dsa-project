package com.practice.dsa.problems.advanced_graphs.path_with_maximum_probability;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LC 1514 - Path With Maximum Probability
 *
 * Beginner idea:
 * This is Dijkstra-like, but instead of minimizing distance, we maximize probability.
 * Always expand the node with the best probability seen so far.
 */
public class LC1514PathWithMaximumProbabilitySolver {
    public double maxProbability(int n, int[][] edges, double[] succProb, int startNode, int endNode) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            double probability = succProb[i];
            graph.get(from).add(new Edge(to, probability));
            graph.get(to).add(new Edge(from, probability));
        }

        double[] best = new double[n];
        best[startNode] = 1.0;

        PriorityQueue<State> maxHeap = new PriorityQueue<>((first, second) -> Double.compare(second.probability, first.probability));
        maxHeap.offer(new State(startNode, 1.0));

        while (!maxHeap.isEmpty()) {
            State state = maxHeap.poll();

            if (state.node == endNode) {
                return state.probability;
            }
            if (state.probability < best[state.node]) {
                continue;
            }

            for (Edge edge : graph.get(state.node)) {
                double nextProbability = state.probability * edge.probability;
                if (nextProbability > best[edge.to]) {
                    best[edge.to] = nextProbability;
                    maxHeap.offer(new State(edge.to, nextProbability));
                }
            }
        }

        return 0.0;
    }

    private static class Edge {
        private final int to;
        private final double probability;

        private Edge(int to, double probability) {
            this.to = to;
            this.probability = probability;
        }
    }

    private static class State {
        private final int node;
        private final double probability;

        private State(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
    }
}
