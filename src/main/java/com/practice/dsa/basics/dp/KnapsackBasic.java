package com.practice.dsa.basics.dp;

/**
 * Beginner 0/1 knapsack reference.
 *
 * dp[item][capacity] stores the best value using items up to that point.
 */
public class KnapsackBasic {
    public int maxValue(int[] weights, int[] values, int capacity) {
        int itemCount = weights.length;
        int[][] dp = new int[itemCount + 1][capacity + 1];

        for (int item = 1; item <= itemCount; item++) {
            int weight = weights[item - 1];
            int value = values[item - 1];

            for (int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++) {
                dp[item][currentCapacity] = dp[item - 1][currentCapacity];

                if (weight <= currentCapacity) {
                    dp[item][currentCapacity] = Math.max(
                            dp[item][currentCapacity],
                            value + dp[item - 1][currentCapacity - weight]
                    );
                }
            }
        }

        return dp[itemCount][capacity];
    }
}
