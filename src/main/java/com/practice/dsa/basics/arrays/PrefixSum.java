package com.practice.dsa.basics.arrays;

/**
 * Beginner prefix sum reference.
 *
 * prefix[i] stores the sum of elements from index 0 to index i.
 * Once that array is built, range sums become very fast.
 *
 * Example:
 * nums   = [2, 4, 1, 7]
 * prefix = [2, 6, 7, 14]
 *
 * Then sum from index 1 to 3 is:
 * prefix[3] - prefix[0] = 14 - 2 = 12
 */
public class PrefixSum {
    public int[] buildPrefixSum(int[] nums) {
        // Create result array with the same size as the input.
        int[] prefix = new int[nums.length];
        // running stores the sum seen so far while moving left to right.
        int running = 0;

        for (int i = 0; i < nums.length; i++) {
            // Add current number into the running sum.
            running += nums[i];
            // Save the running sum at this index.
            prefix[i] = running;
        }

        // Return the completed prefix array.
        return prefix;
    }

    public int rangeSum(int[] prefix, int left, int right) {
        // If the range starts at 0, the answer is just prefix[right].
        if (left == 0) {
            return prefix[right];
        }
        // Otherwise subtract the sum that belongs strictly before left.
        return prefix[right] - prefix[left - 1];
    }
}
