package com.practice.dsa.problems.two_pointers.trapping_rain_water;

public class LC42TrappingRainWaterMain {
    public static void main(String[] args) {
        // Create solver object.
        LC42TrappingRainWaterSolver solver = new LC42TrappingRainWaterSolver();
        // Print the total trapped water.
        System.out.println(solver.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
