package com.practice.dsa.basics.dp;

/**
 * Beginner 2D DP reference.
 *
 * dp[row][col] stores how many ways can reach that cell.
 *
 * This is a good first 2D DP because:
 * - the state meaning is easy
 * - the transition is small
 * - the table fills in a clean left-to-right, top-to-bottom order
 */
public class GridPathsDp {
    public int uniquePaths(int rows, int cols) {
        int[][] dp = new int[rows][cols];

        // First column:
        // there is only one way to keep moving down to reach any cell here.
        for (int row = 0; row < rows; row++) {
            dp[row][0] = 1;
        }
        // First row:
        // there is only one way to keep moving right to reach any cell here.
        for (int col = 0; col < cols; col++) {
            dp[0][col] = 1;
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                // To reach this cell, come either from:
                // - the cell above
                // - the cell on the left
                dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
            }
        }

        // Bottom-right cell stores the final answer.
        return dp[rows - 1][cols - 1];
    }
}
