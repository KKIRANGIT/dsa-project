package com.practice.dsa.problems.dp2.unique_paths_ii;

/**
 * LC 63 - Unique Paths II
 *
 * Beginner idea:
 * This is the same as Unique Paths, but blocked cells contribute zero paths.
 */
public class LC63UniquePathsIISolver {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        dp[0][0] = 1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (obstacleGrid[row][col] == 1) {
                    dp[row][col] = 0;
                    continue;
                }
                if (row > 0) {
                    dp[row][col] += dp[row - 1][col];
                }
                if (col > 0) {
                    dp[row][col] += dp[row][col - 1];
                }
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
