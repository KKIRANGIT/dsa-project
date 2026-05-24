package com.practice.dsa.problems.arrays_hashing.product_of_array_except_self;

import java.util.Arrays;

public class LC238ProductOfArrayExceptSelfMain {
    public static void main(String[] args) {
        // Example input array.
        int[] nums = {1, 2, 3, 4};
        // Create solver object.
        LC238ProductOfArrayExceptSelfSolver solver = new LC238ProductOfArrayExceptSelfSolver();

        // Print answer array.
        System.out.println("answer = " + Arrays.toString(solver.productExceptSelf(nums)));
    }
}
