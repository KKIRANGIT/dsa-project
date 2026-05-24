package com.practice.dsa.patterns.advanced_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Beginner Tarjan SCC pattern.
 *
 * Use for strongly connected components in directed graphs.
 */
public class PT5TarjanSccTemplate {
    private int time;
    private int[] discovery;
    private int[] low;
    private boolean[] inStack;
    private Deque<Integer> stack;
    private List<List<Integer>> components;

    public List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        time = 0;
        discovery = new int[n];
        low = new int[n];
        inStack = new boolean[n];
        stack = new ArrayDeque<>();
        components = new ArrayList<>();

        for (int node = 0; node < n; node++) {
            if (discovery[node] == 0) {
                dfs(graph, node);
            }
        }

        return components;
    }

    private void dfs(List<List<Integer>> graph, int node) {
        discovery[node] = low[node] = ++time;
        stack.push(node);
        inStack[node] = true;

        for (int neighbor : graph.get(node)) {
            if (discovery[neighbor] == 0) {
                dfs(graph, neighbor);
                low[node] = Math.min(low[node], low[neighbor]);
            } else if (inStack[neighbor]) {
                low[node] = Math.min(low[node], discovery[neighbor]);
            }
        }

        if (low[node] == discovery[node]) {
            List<Integer> component = new ArrayList<>();
            while (true) {
                int popped = stack.pop();
                inStack[popped] = false;
                component.add(popped);
                if (popped == node) {
                    break;
                }
            }
            components.add(component);
        }
    }
}
