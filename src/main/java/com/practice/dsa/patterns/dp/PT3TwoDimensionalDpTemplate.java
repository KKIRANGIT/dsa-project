package com.practice.dsa.patterns.dp;

/**
 * Beginner 2-D DP pattern.
 *
 * Use for grid path counting.
 */
public class PT3TwoDimensionalDpTemplate {
    public int countPaths(int rows, int cols) {
        int[][] dp = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            dp[row][0] = 1;
        }
        for (int col = 0; col < cols; col++) {
            dp[0][col] = 1;
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
