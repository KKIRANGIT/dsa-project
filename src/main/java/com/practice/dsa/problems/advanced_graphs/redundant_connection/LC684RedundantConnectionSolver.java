package com.practice.dsa.problems.advanced_graphs.redundant_connection;

import com.practice.dsa.basics.unionfind.UnionFind;

/**
 * LC 684 - Redundant Connection
 *
 * Beginner idea:
 * If two nodes are already connected, adding another edge between them creates a cycle.
 * Union Find is a fast way to track connected components.
 */
public class LC684RedundantConnectionSolver {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind unionFind = new UnionFind(edges.length + 1);

        for (int[] edge : edges) {
            // union(...) returns false when both nodes already share the same parent.
            if (!unionFind.union(edge[0], edge[1])) {
                return edge;
            }
        }

        return new int[]{-1, -1};
    }
}
