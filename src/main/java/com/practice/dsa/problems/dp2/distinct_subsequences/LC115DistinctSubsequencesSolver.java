package com.practice.dsa.problems.dp2.distinct_subsequences;

/**
 * LC 115 - Distinct Subsequences
 *
 * Beginner idea:
 * dp[i][j] = number of ways source prefix i can form target prefix j.
 */
public class LC115DistinctSubsequencesSolver {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];

        for (int i = 0; i <= s.length(); i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                dp[i][j] = dp[i - 1][j];
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
