package com.practice.dsa.problems.dp1.min_cost_climbing_stairs;

/**
 * LC 746 - Min Cost Climbing Stairs
 *
 * Beginner idea:
 * To stand on step i, we must come from step i - 1 or step i - 2.
 * So each state keeps the cheapest cost to reach that position.
 */
public class LC746MinCostClimbingStairsSolver {
    public int minCostClimbingStairs(int[] cost) {
        int first = 0;
        int second = 0;

        for (int i = 2; i <= cost.length; i++) {
            int current = Math.min(second + cost[i - 1], first + cost[i - 2]);
            first = second;
            second = current;
        }

        return second;
    }
}
