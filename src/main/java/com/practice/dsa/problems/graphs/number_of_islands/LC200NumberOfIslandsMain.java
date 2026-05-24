package com.practice.dsa.problems.graphs.number_of_islands;

public class LC200NumberOfIslandsMain {
    public static void main(String[] args) {
        // Build a grid where '1' means land and '0' means water.
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        // Print how many islands exist.
        System.out.println(new LC200NumberOfIslandsSolver().numIslands(grid));
    }
}
