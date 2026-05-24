package com.practice.dsa.basics.unionfind;

/**
 * Beginner Union Find reference.
 *
 * parent[i] tells which group node i belongs to.
 * find(...) returns the representative parent of a group.
 * union(...) merges two groups.
 *
 * Important beginner idea:
 * we do not store full groups explicitly.
 * We store parent pointers that eventually lead to a root representative.
 */
public class UnionFind {
    private final int[] parent;
    private final int[] rank;

    public UnionFind(int size) {
        // Every node starts as its own parent.
        parent = new int[size];
        // rank helps keep trees shallow.
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int node) {
        // If node is not its own parent, keep climbing.
        if (parent[node] != node) {
            // Path compression:
            // make this node point directly closer to the root
            // so future finds become faster.
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }

    public boolean union(int a, int b) {
        // Find group representatives.
        int rootA = find(a);
        int rootB = find(b);

        // Same root means already connected.
        if (rootA == rootB) {
            return false;
        }

        // Attach smaller-rank tree under larger-rank tree.
        // This helps keep the structure shallow.
        if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else {
            // If ranks equal, choose one and increase its rank.
            parent[rootB] = rootA;
            rank[rootA]++;
        }
        return true;
    }

    public boolean connected(int a, int b) {
        // Two nodes are connected when their roots match.
        return find(a) == find(b);
    }
}
