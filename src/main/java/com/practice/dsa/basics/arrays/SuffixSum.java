package com.practice.dsa.basics.arrays;

/**
 * Beginner suffix sum reference.
 *
 * suffix[i] stores the sum of elements from index i to the end.
 *
 * Example:
 * nums   = [2, 4, 1, 7]
 * suffix = [14, 12, 8, 7]
 */
public class SuffixSum {
    public int[] buildSuffixSum(int[] nums) {
        // Create result array.
        int[] suffix = new int[nums.length];
        // running stores the sum while moving from right to left.
        int running = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            // Add current number into the running sum.
            running += nums[i];
            // Save the sum from i all the way to the last index.
            suffix[i] = running;
        }

        // Return completed suffix array.
        return suffix;
    }
}
