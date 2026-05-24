package com.practice.dsa.basics.graph;

import java.util.Arrays;

public class DijkstraBasicsMain {
    public static void main(String[] args) {
        // edge format = {from, to, weight}
        int[][] edges = {
                {0, 1, 4},
                {0, 2, 1},
                {2, 1, 2},
                {1, 3, 1},
                {2, 3, 5}
        };

        DijkstraBasics basics = new DijkstraBasics();
        System.out.println("source node = 0");
        System.out.println("distances = " + Arrays.toString(basics.shortestPaths(4, edges, 0)));
    }
}
