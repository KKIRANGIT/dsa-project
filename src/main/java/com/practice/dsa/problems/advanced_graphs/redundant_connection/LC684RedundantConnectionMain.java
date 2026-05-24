package com.practice.dsa.problems.advanced_graphs.redundant_connection;

import java.util.Arrays;

public class LC684RedundantConnectionMain {
    public static void main(String[] args) {
        // Build an undirected graph edge list.
        int[][] edges = {
                {1, 2},
                {1, 3},
                {2, 3}
        };
        // Print the edge that creates the cycle.
        System.out.println(Arrays.toString(new LC684RedundantConnectionSolver().findRedundantConnection(edges)));
    }
}
