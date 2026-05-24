package com.practice.dsa.problems.dp1.longest_increasing_subsequence;

/**
 * LC 300 - Longest Increasing Subsequence
 *
 * Beginner idea:
 * dp[i] = LIS length ending exactly at index i.
 */
public class LC300LongestIncreasingSubsequenceSolver {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int best = 1;

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            best = Math.max(best, dp[i]);
        }

        return best;
    }
}
