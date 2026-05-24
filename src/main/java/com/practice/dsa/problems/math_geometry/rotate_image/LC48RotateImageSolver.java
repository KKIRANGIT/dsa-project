package com.practice.dsa.problems.math_geometry.rotate_image;

/**
 * LC 48 - Rotate Image
 *
 * Beginner idea:
 * 90-degree clockwise rotation can be done in two steps:
 * 1. transpose the matrix
 * 2. reverse each row
 */
public class LC48RotateImageSolver {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Reverse each row to finish the clockwise rotation.
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][n - 1 - col];
                matrix[row][n - 1 - col] = temp;
            }
        }
    }
}
