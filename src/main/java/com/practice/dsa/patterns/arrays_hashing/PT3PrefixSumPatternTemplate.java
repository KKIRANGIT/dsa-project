package com.practice.dsa.patterns.arrays_hashing;

/**
 * Beginner prefix-sum pattern.
 *
 * Use this when a problem asks many range-sum style queries.
 */
public class PT3PrefixSumPatternTemplate {
    public int[] buildPrefix(int[] nums) {
        int[] prefix = new int[nums.length];
        int running = 0;

        for (int i = 0; i < nums.length; i++) {
            running += nums[i];
            prefix[i] = running;
        }

        return prefix;
    }

    public int query(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}
