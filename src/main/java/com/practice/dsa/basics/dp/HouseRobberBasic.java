package com.practice.dsa.basics.dp;

/**
 * Beginner take-or-skip DP reference.
 *
 * At each house, either:
 * - rob it and skip the previous house
 * - skip it and keep the previous best
 *
 * Variable meaning:
 * - prevTwo = best answer up to house i-2
 * - prevOne = best answer up to house i-1
 */
public class HouseRobberBasic {
    public int rob(int[] nums) {
        int prevTwo = 0;
        int prevOne = 0;

        for (int money : nums) {
            // If we rob this house, we must add it to the best answer
            // that ended two houses back.
            int takeCurrent = money + prevTwo;
            // If we skip this house, we keep the previous best.
            int skipCurrent = prevOne;
            int currentBest = Math.max(takeCurrent, skipCurrent);

            // Slide the DP window forward for the next iteration.
            prevTwo = prevOne;
            prevOne = currentBest;
        }

        return prevOne;
    }
}
