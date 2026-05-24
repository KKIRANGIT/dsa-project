package com.practice.dsa.problems.dp2.minimum_path_sum;

/**
 * LC 64 - Minimum Path Sum
 *
 * Beginner idea:
 * To reach any cell, we must come either from the top or from the left.
 * So the best cost for this cell is its value plus the smaller of those two costs.
 */
public class LC64MinimumPathSumSolver {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        dp[0][0] = grid[0][0];

        for (int row = 1; row < rows; row++) {
            dp[row][0] = dp[row - 1][0] + grid[row][0];
        }
        for (int col = 1; col < cols; col++) {
            dp[0][col] = dp[0][col - 1] + grid[0][col];
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                dp[row][col] = grid[row][col] + Math.min(dp[row - 1][col], dp[row][col - 1]);
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
