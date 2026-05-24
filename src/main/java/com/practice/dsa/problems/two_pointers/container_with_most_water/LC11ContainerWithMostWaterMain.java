package com.practice.dsa.problems.two_pointers.container_with_most_water;

public class LC11ContainerWithMostWaterMain {
    public static void main(String[] args) {
        // Create solver object.
        LC11ContainerWithMostWaterSolver solver = new LC11ContainerWithMostWaterSolver();
        // Print the maximum water area.
        System.out.println(solver.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
