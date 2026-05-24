package com.practice.dsa.basics.graph;

/**
 * Beginner adjacency matrix reference.
 *
 * matrix[from][to] == 1 means an edge exists.
 */
public class AdjacencyMatrixBasics {
    public int[][] buildUndirectedMatrix(int nodeCount, int[][] edges) {
        int[][] matrix = new int[nodeCount][nodeCount];

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            matrix[from][to] = 1;
            matrix[to][from] = 1;
        }

        return matrix;
    }

    public boolean hasEdge(int[][] matrix, int from, int to) {
        return matrix[from][to] == 1;
    }
}
