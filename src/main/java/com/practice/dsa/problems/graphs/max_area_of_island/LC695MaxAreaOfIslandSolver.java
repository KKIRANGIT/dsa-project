package com.practice.dsa.problems.graphs.max_area_of_island;

public class LC695MaxAreaOfIslandSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int maxAreaOfIsland(int[][] grid) {
        int best = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    // Measure the full connected island starting here.
                    best = Math.max(best, area(grid, row, col));
                }
            }
        }

        return best;
    }

    private int area(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }

        // Mark visited land.
        grid[row][col] = 0;
        int total = 1;
        for (int[] direction : DIRECTIONS) {
            total += area(grid, row + direction[0], col + direction[1]);
        }
        return total;
    }
}
