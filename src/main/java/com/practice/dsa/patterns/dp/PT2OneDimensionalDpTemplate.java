package com.practice.dsa.patterns.dp;

/**
 * Beginner 1-D DP pattern.
 *
 * This example keeps only the next two answers instead of a full array.
 */
public class PT2OneDimensionalDpTemplate {
    public int minCostClimbingStairs(int[] cost) {
        // Cost to reach top from one step ahead.
        int oneStepAhead = 0;
        // Cost to reach top from two steps ahead.
        int twoStepsAhead = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            // Best cost from this step.
            int current = cost[i] + Math.min(oneStepAhead, twoStepsAhead);
            twoStepsAhead = oneStepAhead;
            oneStepAhead = current;
        }

        // Can start from step 0 or step 1.
        return Math.min(oneStepAhead, twoStepsAhead);
    }
}
