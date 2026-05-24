package com.practice.dsa.problems.math_geometry.rotate_image;

import java.util.Arrays;

public class LC48RotateImageMain {
    public static void main(String[] args) {
        // Build a square matrix.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Rotate the matrix in place.
        new LC48RotateImageSolver().rotate(matrix);
        // Print the rotated matrix.
        System.out.println(Arrays.deepToString(matrix));
    }
}
