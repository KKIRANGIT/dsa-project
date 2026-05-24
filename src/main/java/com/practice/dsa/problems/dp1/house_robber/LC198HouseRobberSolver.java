package com.practice.dsa.problems.dp1.house_robber;

/**
 * LC 198 - House Robber
 *
 * Beginner idea:
 * At each house, either:
 * - rob it and therefore skip the previous house
 * - skip it and keep the best answer so far
 */
public class LC198HouseRobberSolver {
    public int rob(int[] nums) {
        int robPrev = 0;
        int skipPrev = 0;

        for (int num : nums) {
            int newRob = skipPrev + num;
            // Best skip state means we take the best of previous rob/skip.
            skipPrev = Math.max(skipPrev, robPrev);
            robPrev = newRob;
        }

        return Math.max(robPrev, skipPrev);
    }
}
