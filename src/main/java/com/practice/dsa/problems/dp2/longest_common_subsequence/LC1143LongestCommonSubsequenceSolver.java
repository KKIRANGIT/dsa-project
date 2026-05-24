package com.practice.dsa.problems.dp2.longest_common_subsequence;

/**
 * LC 1143 - Longest Common Subsequence
 *
 * Beginner idea:
 * dp[i][j] means:
 * answer for text1 starting at i and text2 starting at j
 *
 * If the characters match, use both.
 * If not, try skipping one side at a time.
 */
public class LC1143LongestCommonSubsequenceSolver {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }
}
