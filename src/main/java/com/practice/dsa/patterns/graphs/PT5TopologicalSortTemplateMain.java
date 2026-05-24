package com.practice.dsa.patterns.graphs;

public class PT5TopologicalSortTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT5TopologicalSortTemplate template = new PT5TopologicalSortTemplate();
        // Directed edges.
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 3}
        };

        // Print one valid topological order.
        System.out.println(template.topoSort(4, edges));
    }
}
