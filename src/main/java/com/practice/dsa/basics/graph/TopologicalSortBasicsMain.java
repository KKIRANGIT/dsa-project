package com.practice.dsa.basics.graph;

public class TopologicalSortBasicsMain {
    public static void main(String[] args) {
        TopologicalSortBasics basics = new TopologicalSortBasics();
        // 0 must come before 1 and 2.
        // 1 and 2 must come before 3.
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 3}
        };

        System.out.println("topological order = " + basics.topoSort(4, edges));
    }
}
