package com.practice.dsa.basics.arrays;

import java.util.Arrays;

public class SuffixSumMain {
    public static void main(String[] args) {
        // Create helper object.
        SuffixSum suffixSum = new SuffixSum();
        // Example input array.
        int[] nums = {2, 4, 1, 7, 3};

        // Print original array.
        System.out.println("nums   = " + Arrays.toString(nums));
        // Print suffix sums.
        // Example: suffix[1] means 4 + 1 + 7 + 3 = 15.
        System.out.println("suffix = " + Arrays.toString(suffixSum.buildSuffixSum(nums)));
    }
}
