package com.practice.dsa.patterns.advanced_graphs;

import com.practice.dsa.basics.unionfind.UnionFind;

/**
 * Beginner union-find graph pattern.
 *
 * Use for connectivity and cycle detection in edge lists.
 */
public class PT4UnionFindGraphTemplate {
    public boolean edgeCreatesCycle(int n, int[][] edges) {
        UnionFind unionFind = new UnionFind(n);

        for (int[] edge : edges) {
            if (!unionFind.union(edge[0], edge[1])) {
                return true;
            }
        }

        return false;
    }
}
