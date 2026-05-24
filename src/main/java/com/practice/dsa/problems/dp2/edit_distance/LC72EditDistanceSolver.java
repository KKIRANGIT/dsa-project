package com.practice.dsa.problems.dp2.edit_distance;

/**
 * LC 72 - Edit Distance
 *
 * Beginner idea:
 * dp[i][j] = minimum edits needed to convert word1 from i onward
 * into word2 from j onward.
 *
 * If characters already match, no edit is needed there.
 * Otherwise try insert, delete, and replace.
 */
public class LC72EditDistanceSolver {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            dp[i][word2.length()] = word1.length() - i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            dp[word1.length()][j] = word2.length() - j;
        }

        for (int i = word1.length() - 1; i >= 0; i--) {
            for (int j = word2.length() - 1; j >= 0; j--) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j + 1], Math.min(dp[i + 1][j], dp[i][j + 1]));
                }
            }
        }

        return dp[0][0];
    }
}
