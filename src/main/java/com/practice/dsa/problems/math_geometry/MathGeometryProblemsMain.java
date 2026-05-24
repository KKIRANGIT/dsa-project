package com.practice.dsa.problems.math_geometry;

import com.practice.dsa.problems.math_geometry.happy_number.LC202HappyNumberSolver;
import com.practice.dsa.problems.math_geometry.rotate_image.LC48RotateImageSolver;
import com.practice.dsa.problems.math_geometry.spiral_matrix.LC54SpiralMatrixSolver;

import java.util.Arrays;

public class MathGeometryProblemsMain {
    public static void main(String[] args) {
        // Build matrix for rotation example.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Run rotate-image sample.
        new LC48RotateImageSolver().rotate(matrix);
        System.out.println("LC48  = " + Arrays.deepToString(matrix));
        // Run spiral-matrix sample.
        System.out.println("LC54  = " + new LC54SpiralMatrixSolver().spiralOrder(new int[][]{{1, 2}, {3, 4}}));
        // Run happy-number sample.
        System.out.println("LC202 = " + new LC202HappyNumberSolver().isHappy(19));
    }
}
