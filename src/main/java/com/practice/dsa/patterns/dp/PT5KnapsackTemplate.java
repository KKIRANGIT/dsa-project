package com.practice.dsa.patterns.dp;

/**
 * Beginner 0/1 knapsack pattern.
 *
 * Use when each item can be taken at most once
 * and there is a capacity constraint.
 */
public class PT5KnapsackTemplate {
    public int maximumValue(int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];

        for (int item = 0; item < weights.length; item++) {
            for (int currentCapacity = capacity; currentCapacity >= weights[item]; currentCapacity--) {
                dp[currentCapacity] = Math.max(
                        dp[currentCapacity],
                        values[item] + dp[currentCapacity - weights[item]]
                );
            }
        }

        return dp[capacity];
    }
}
