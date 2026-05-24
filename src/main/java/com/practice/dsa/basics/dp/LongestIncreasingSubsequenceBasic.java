package com.practice.dsa.basics.dp;

/**
 * Beginner LIS reference using O(n^2) DP.
 *
 * dp[i] means the LIS length ending exactly at index i.
 *
 * Important beginner idea:
 * "ending exactly at i" is much easier to reason about
 * than "best answer anywhere so far".
 */
public class LongestIncreasingSubsequenceBasic {
    public int lisLength(int[] nums) {
        int[] dp = new int[nums.length];
        int best = 1;

        for (int i = 0; i < nums.length; i++) {
            // At minimum, the number itself forms a subsequence of length 1.
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // If nums[i] can extend the subsequence ending at j,
                    // try improving dp[i].
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            // Track the best LIS length seen anywhere so far.
            best = Math.max(best, dp[i]);
        }

        return best;
    }
}
