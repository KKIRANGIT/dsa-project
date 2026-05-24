package com.practice.dsa.problems.advanced_graphs.connecting_cities_with_minimum_cost;

import java.util.Arrays;

/**
 * LC 1135 - Connecting Cities With Minimum Cost
 *
 * Beginner idea:
 * This is a minimum spanning tree problem.
 * Kruskal's algorithm sorts edges by cost and keeps only the edges that connect new components.
 */
public class LC1135ConnectingCitiesWithMinimumCostSolver {
    public int minimumCost(int n, int[][] connections) {
        Arrays.sort(connections, (first, second) -> Integer.compare(first[2], second[2]));
        UnionFind unionFind = new UnionFind(n + 1);
        int totalCost = 0;
        int usedEdges = 0;

        for (int[] connection : connections) {
            if (unionFind.union(connection[0], connection[1])) {
                totalCost += connection[2];
                usedEdges++;
            }
        }

        return usedEdges == n - 1 ? totalCost : -1;
    }

    private static class UnionFind {
        private final int[] parent;
        private final int[] rank;

        private UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        private int find(int value) {
            if (parent[value] != value) {
                parent[value] = find(parent[value]);
            }
            return parent[value];
        }

        private boolean union(int first, int second) {
            int rootFirst = find(first);
            int rootSecond = find(second);
            if (rootFirst == rootSecond) {
                return false;
            }

            if (rank[rootFirst] < rank[rootSecond]) {
                parent[rootFirst] = rootSecond;
            } else if (rank[rootFirst] > rank[rootSecond]) {
                parent[rootSecond] = rootFirst;
            } else {
                parent[rootSecond] = rootFirst;
                rank[rootFirst]++;
            }
            return true;
        }
    }
}
