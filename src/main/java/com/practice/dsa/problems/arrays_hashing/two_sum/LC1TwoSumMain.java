package com.practice.dsa.problems.arrays_hashing.two_sum;

import java.util.Arrays;

public class LC1TwoSumMain {
    public static void main(String[] args) {
        // Input array for the problem.
        int[] nums = {2, 7, 11, 15};
        // Target sum we want to build using two numbers.
        int target = 9;
        // Create the solver object.
        LC1TwoSumSolver solver = new LC1TwoSumSolver();

        // Print the input so it is easy to compare with the output.
        System.out.println("nums   = " + Arrays.toString(nums));
        // Print the target value.
        System.out.println("target = " + target);
        // Run the solver and print the returned indexes.
        System.out.println("answer = " + Arrays.toString(solver.twoSum(nums, target)));
    }
}
