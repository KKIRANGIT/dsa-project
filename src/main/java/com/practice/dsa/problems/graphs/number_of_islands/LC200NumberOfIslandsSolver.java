package com.practice.dsa.problems.graphs.number_of_islands;

public class LC200NumberOfIslandsSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    // Flood fill turns the whole island into visited water.
                    flood(grid, row, col);
                }
            }
        }

        return islands;
    }

    private void flood(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != '1') {
            return;
        }

        // Mark visited so we do not count this land twice.
        grid[row][col] = '0';
        for (int[] direction : DIRECTIONS) {
            flood(grid, row + direction[0], col + direction[1]);
        }
    }
}
