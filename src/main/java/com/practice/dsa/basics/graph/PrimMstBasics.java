package com.practice.dsa.basics.graph;

import com.practice.dsa.common.Edge;
import com.practice.dsa.common.StructureBuilder;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Beginner minimum spanning tree reference using Prim's algorithm.
 *
 * Use this when:
 * - the graph is weighted
 * - you want to connect all nodes with minimum total edge weight
 * - the graph is undirected
 */
public class PrimMstBasics {
    public int mstCost(int nodeCount, int[][] edges) {
        List<List<Edge>> graph = StructureBuilder.buildWeightedUndirectedGraph(nodeCount, edges);
        boolean[] visited = new boolean[nodeCount];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));

        minHeap.offer(new Edge(-1, 0, 0));
        int totalCost = 0;
        int visitedCount = 0;

        while (!minHeap.isEmpty() && visitedCount < nodeCount) {
            Edge current = minHeap.poll();
            int node = current.to;

            if (visited[node]) {
                continue;
            }

            visited[node] = true;
            visitedCount++;
            totalCost += current.weight;

            for (Edge next : graph.get(node)) {
                if (!visited[next.to]) {
                    minHeap.offer(next);
                }
            }
        }

        return visitedCount == nodeCount ? totalCost : -1;
    }
}
