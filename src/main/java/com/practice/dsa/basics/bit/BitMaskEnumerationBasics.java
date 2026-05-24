package com.practice.dsa.basics.bit;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner bitmask enumeration reference.
 *
 * Each mask represents one subset choice.
 *
 * Example for 3 numbers:
 * - mask 000 means choose nothing
 * - mask 101 means choose index 0 and index 2
 */
public class BitMaskEnumerationBasics {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Total number of subsets of n items is 2^n.
        int totalMasks = 1 << nums.length;

        for (int mask = 0; mask < totalMasks; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                // Check whether the bit at this index is turned on.
                if ((mask & (1 << index)) != 0) {
                    subset.add(nums[index]);
                }
            }
            result.add(subset);
        }

        return result;
    }
}
