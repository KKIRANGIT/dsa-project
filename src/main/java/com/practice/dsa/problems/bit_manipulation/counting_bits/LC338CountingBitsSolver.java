package com.practice.dsa.problems.bit_manipulation.counting_bits;

/**
 * LC 338 - Counting Bits
 *
 * Beginner idea:
 * For any number i:
 * - i >> 1 removes the last bit
 * - i & 1 tells whether the last bit was 1
 *
 * So:
 * bits(i) = bits(i >> 1) + (i & 1)
 */
public class LC338CountingBitsSolver {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }
}
