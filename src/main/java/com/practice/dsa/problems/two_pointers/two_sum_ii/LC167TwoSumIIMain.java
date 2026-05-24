package com.practice.dsa.problems.two_pointers.two_sum_ii;

import java.util.Arrays;

public class LC167TwoSumIIMain {
    public static void main(String[] args) {
        // Create solver object.
        LC167TwoSumIISolver solver = new LC167TwoSumIISolver();
        // Print 1-based indexes of the matching pair.
        System.out.println(Arrays.toString(solver.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
