package com.practice.dsa.problems.graphs.max_area_of_island;

public class LC695MaxAreaOfIslandMain {
    public static void main(String[] args) {
        // Build a small grid containing one island.
        int[][] grid = {
                {0, 0, 1, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0}
        };
        // Print the largest island area.
        System.out.println(new LC695MaxAreaOfIslandSolver().maxAreaOfIsland(grid));
    }
}
