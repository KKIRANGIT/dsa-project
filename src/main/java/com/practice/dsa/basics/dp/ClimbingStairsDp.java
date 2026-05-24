package com.practice.dsa.basics.dp;

/**
 * Beginner 1D DP reference.
 *
 * dp[i] means the number of ways to reach step i.
 */
public class ClimbingStairsDp {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int step = 3; step <= n; step++) {
            dp[step] = dp[step - 1] + dp[step - 2];
        }

        return dp[n];
    }
}
