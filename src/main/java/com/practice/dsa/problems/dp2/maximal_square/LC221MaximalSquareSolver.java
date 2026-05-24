package com.practice.dsa.problems.dp2.maximal_square;

/**
 * LC 221 - Maximal Square
 *
 * Beginner idea:
 * A square of size bigger than 1 can end at this cell only if
 * top, left, and top-left cells can also support a square.
 */
public class LC221MaximalSquareSolver {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1];
        int largestSide = 0;

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (matrix[row - 1][col - 1] == '1') {
                    dp[row][col] = 1 + Math.min(dp[row - 1][col - 1],
                            Math.min(dp[row - 1][col], dp[row][col - 1]));
                    largestSide = Math.max(largestSide, dp[row][col]);
                }
            }
        }

        return largestSide * largestSide;
    }
}
