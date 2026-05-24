package com.practice.dsa.problems.math_geometry.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 54 - Spiral Matrix
 *
 * Beginner idea:
 * Walk the matrix boundary layer by layer:
 * top row, right column, bottom row, left column.
 */
public class LC54SpiralMatrixSolver {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                answer.add(matrix[top][col]);
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                answer.add(matrix[row][right]);
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    answer.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    answer.add(matrix[row][left]);
                }
                left++;
            }
        }

        return answer;
    }
}
