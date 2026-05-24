package com.practice.dsa.basics.arrays;

/**
 * Beginner maximum subarray reference.
 *
 * This teaches the idea of carrying the best subarray ending at the current index.
 *
 * Variable meaning:
 * - bestEndingHere = best sum of a subarray that must end at the current index
 * - bestOverall = best sum seen anywhere so far
 */
public class KadaneBasics {
    public int maxSubarraySum(int[] nums) {
        int bestEndingHere = nums[0];
        int bestOverall = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either:
            // 1. start a new subarray at nums[i]
            // 2. extend the previous bestEndingHere subarray
            bestEndingHere = Math.max(nums[i], bestEndingHere + nums[i]);
            // Update global answer after processing index i.
            bestOverall = Math.max(bestOverall, bestEndingHere);
        }

        return bestOverall;
    }
}
