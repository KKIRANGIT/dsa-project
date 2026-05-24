package com.practice.dsa.patterns.math_geometry;

public class PT1MatrixSimulationTemplateMain {
    public static void main(String[] args) {
        // Build sample matrix.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Create template helper.
        PT1MatrixSimulationTemplate template = new PT1MatrixSimulationTemplate();
        // Print spiral order.
        System.out.println(template.spiralOrder(matrix));
    }
}
