package com.practice.dsa.basics.arrays;

import java.util.Arrays;

public class PrefixSumMain {
    public static void main(String[] args) {
        // Create helper object.
        PrefixSum prefixSum = new PrefixSum();
        // Example input array.
        int[] nums = {2, 4, 1, 7, 3};

        // Build the prefix array.
        int[] prefix = prefixSum.buildPrefixSum(nums);

        // Print original array.
        System.out.println("nums    = " + Arrays.toString(nums));
        // Print prefix sums.
        System.out.println("prefix  = " + Arrays.toString(prefix));
        // Query range sum from index 1 to index 3.
        // That means 4 + 1 + 7 = 12.
        System.out.println("sum[1..3] = " + prefixSum.rangeSum(prefix, 1, 3));
    }
}
