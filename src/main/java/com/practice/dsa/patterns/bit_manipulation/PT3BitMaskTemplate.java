package com.practice.dsa.patterns.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner bitmask pattern.
 *
 * Each bit in mask tells whether a value is included in the subset.
 */
public class PT3BitMaskTemplate {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // There are 2^n possible masks.
        int totalMasks = 1 << nums.length;

        for (int mask = 0; mask < totalMasks; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int bit = 0; bit < nums.length; bit++) {
                // If current bit is 1, include nums[bit].
                if ((mask & (1 << bit)) != 0) {
                    subset.add(nums[bit]);
                }
            }
            result.add(subset);
        }

        return result;
    }
}
