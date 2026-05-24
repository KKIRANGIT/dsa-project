package com.practice.dsa.patterns.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner binary-lifting LCA pattern.
 *
 * Use for many ancestor/LCA queries on the same tree.
 */
public class PT5BinaryLiftingLcaTemplate {
    private int log;
    private int[][] up;
    private int[] depth;
    private List<List<Integer>> graph;

    public void build(int n, int[][] edges, int root) {
        log = 1;
        while ((1 << log) <= n) {
            log++;
        }

        up = new int[log][n];
        depth = new int[n];
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        dfs(root, root);

        for (int j = 1; j < log; j++) {
            for (int node = 0; node < n; node++) {
                up[j][node] = up[j - 1][up[j - 1][node]];
            }
        }
    }

    private void dfs(int node, int parent) {
        up[0][node] = parent;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) {
                continue;
            }
            depth[neighbor] = depth[node] + 1;
            dfs(neighbor, node);
        }
    }

    public int lca(int a, int b) {
        if (depth[a] < depth[b]) {
            int temp = a;
            a = b;
            b = temp;
        }

        int diff = depth[a] - depth[b];
        for (int j = 0; j < log; j++) {
            if (((diff >> j) & 1) == 1) {
                a = up[j][a];
            }
        }

        if (a == b) {
            return a;
        }

        for (int j = log - 1; j >= 0; j--) {
            if (up[j][a] != up[j][b]) {
                a = up[j][a];
                b = up[j][b];
            }
        }

        return up[0][a];
    }
}
