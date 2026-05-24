package com.practice.dsa.basics.arrays;

/**
 * Beginner 2D prefix sum reference.
 *
 * prefix[row][col] stores the sum of the rectangle from (0,0) to (row,col).
 * This is the matrix version of normal prefix sums.
 *
 * Formula idea:
 * current cell contribution
 * + top rectangle
 * + left rectangle
 * - overlap rectangle counted twice
 */
public class TwoDimensionalPrefixSum {
    public int[][] buildPrefix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] prefix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int top = row > 0 ? prefix[row - 1][col] : 0;
                int left = col > 0 ? prefix[row][col - 1] : 0;
                int overlap = row > 0 && col > 0 ? prefix[row - 1][col - 1] : 0;
                // Add current value and combine the rectangles around it.
                prefix[row][col] = grid[row][col] + top + left - overlap;
            }
        }

        return prefix;
    }

    public int rectangleSum(int[][] prefix, int topRow, int leftCol, int bottomRow, int rightCol) {
        // Start from the full prefix rectangle ending at bottom-right.
        int total = prefix[bottomRow][rightCol];
        // Remove the rectangle above the query.
        int top = topRow > 0 ? prefix[topRow - 1][rightCol] : 0;
        // Remove the rectangle left of the query.
        int left = leftCol > 0 ? prefix[bottomRow][leftCol - 1] : 0;
        // Add back the overlap because it was removed twice.
        int overlap = topRow > 0 && leftCol > 0 ? prefix[topRow - 1][leftCol - 1] : 0;
        return total - top - left + overlap;
    }
}
