package com.practice.dsa.basics.dp;

/**
 * Beginner DP reconstruction reference.
 *
 * Many DP problems are not only about the best score.
 * They also ask for one actual optimal answer.
 */
public class LongestCommonSubsequenceReconstructionBasic {
    public String buildLcs(String first, String second) {
        int[][] dp = new int[first.length() + 1][second.length() + 1];

        for (int i = 1; i <= first.length(); i++) {
            for (int j = 1; j <= second.length(); j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder reversed = new StringBuilder();
        int row = first.length();
        int col = second.length();

        while (row > 0 && col > 0) {
            if (first.charAt(row - 1) == second.charAt(col - 1)) {
                reversed.append(first.charAt(row - 1));
                row--;
                col--;
            } else if (dp[row - 1][col] >= dp[row][col - 1]) {
                row--;
            } else {
                col--;
            }
        }

        return reversed.reverse().toString();
    }
}
