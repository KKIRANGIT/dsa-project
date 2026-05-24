package com.practice.dsa.problems.dp1.decode_ways;

/**
 * LC 91 - Decode Ways
 *
 * Beginner idea:
 * At every index, try:
 * 1. taking one digit if it is not '0'
 * 2. taking two digits if they form a number from 10 to 26
 */
public class LC91DecodeWaysSolver {
    public int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            char oneDigit = s.charAt(i - 1);
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit != '0') {
                dp[i] += dp[i - 1];
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }
}
