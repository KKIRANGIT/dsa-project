package com.practice.dsa.patterns.dp;

/**
 * Beginner take-or-skip DP pattern.
 *
 * Use for problems where each item can be taken or skipped.
 */
public class PT4TakeOrSkipDpTemplate {
    public int maximumNonAdjacentSum(int[] nums) {
        int take = 0;
        int skip = 0;

        for (int num : nums) {
            int newTake = skip + num;
            skip = Math.max(skip, take);
            take = newTake;
        }

        return Math.max(take, skip);
    }
}
