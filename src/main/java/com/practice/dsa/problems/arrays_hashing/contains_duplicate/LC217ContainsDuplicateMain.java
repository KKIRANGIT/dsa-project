package com.practice.dsa.problems.arrays_hashing.contains_duplicate;

import java.util.Arrays;

public class LC217ContainsDuplicateMain {
    public static void main(String[] args) {
        // Input array that may or may not contain repeated values.
        int[] nums = {1, 2, 3, 1};
        // Create the solver object.
        LC217ContainsDuplicateSolver solver = new LC217ContainsDuplicateSolver();

        // Print the input array.
        System.out.println("nums = " + Arrays.toString(nums));
        // Print whether a duplicate exists.
        System.out.println("containsDuplicate = " + solver.containsDuplicate(nums));
    }
}
