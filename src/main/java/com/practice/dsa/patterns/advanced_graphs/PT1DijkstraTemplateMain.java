package com.practice.dsa.patterns.advanced_graphs;

import com.practice.dsa.common.Edge;

import java.util.Arrays;
import java.util.List;

public class PT1DijkstraTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1DijkstraTemplate template = new PT1DijkstraTemplate();
        // Run shortest paths from node 0.
        int[] distance = template.shortestPaths(5, List.of(
                new Edge(0, 1, 4),
                new Edge(0, 2, 1),
                new Edge(2, 1, 2),
                new Edge(1, 3, 1),
                new Edge(2, 3, 5),
                new Edge(3, 4, 3)
        ), 0);

        // Print all shortest distances.
        System.out.println(Arrays.toString(distance));
    }
}
