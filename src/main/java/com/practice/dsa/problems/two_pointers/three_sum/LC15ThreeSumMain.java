package com.practice.dsa.problems.two_pointers.three_sum;

public class LC15ThreeSumMain {
    public static void main(String[] args) {
        // Create solver object.
        LC15ThreeSumSolver solver = new LC15ThreeSumSolver();
        // Print all unique triplets whose sum is zero.
        System.out.println(solver.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
