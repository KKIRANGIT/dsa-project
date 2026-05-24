package com.practice.dsa.patterns.math_geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner matrix-simulation pattern.
 *
 * This example walks a matrix in spiral order.
 */
public class PT1MatrixSimulationTemplate {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        // Current boundaries of the remaining rectangle.
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Walk top row.
            for (int col = left; col <= right; col++) {
                order.add(matrix[top][col]);
            }
            top++;

            // Walk right column.
            for (int row = top; row <= bottom; row++) {
                order.add(matrix[row][right]);
            }
            right--;

            if (top <= bottom) {
                // Walk bottom row.
                for (int col = right; col >= left; col--) {
                    order.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                // Walk left column.
                for (int row = bottom; row >= top; row--) {
                    order.add(matrix[row][left]);
                }
                left++;
            }
        }

        return order;
    }
}
