package com.practice.dsa.problems.math_geometry.spiral_matrix;

public class LC54SpiralMatrixMain {
    public static void main(String[] args) {
        // Build a matrix.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Print the spiral traversal order.
        System.out.println(new LC54SpiralMatrixSolver().spiralOrder(matrix));
    }
}
