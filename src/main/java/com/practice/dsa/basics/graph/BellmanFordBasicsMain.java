package com.practice.dsa.basics.graph;

import com.practice.dsa.common.Edge;

import java.util.Arrays;

public class BellmanFordBasicsMain {
    public static void main(String[] args) {
        Edge[] edges = {
                new Edge(0, 1, 4),
                new Edge(0, 2, 5),
                new Edge(1, 2, -2),
                new Edge(2, 3, 3)
        };

        BellmanFordBasics basics = new BellmanFordBasics();
        System.out.println("distances = " + Arrays.toString(basics.shortestPaths(4, edges, 0)));
    }
}
