package com.practice.dsa.patterns.graphs;

public class PT3MatrixBfsTemplateMain {
    public static void main(String[] args) {
        // Sample matrix.
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Create template helper.
        PT3MatrixBfsTemplate template = new PT3MatrixBfsTemplate();
        // Print shortest distance from start to value 9.
        System.out.println("distance = " + template.shortestPathToTarget(grid, 9));
    }
}
