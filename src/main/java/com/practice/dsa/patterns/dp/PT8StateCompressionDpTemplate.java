package com.practice.dsa.patterns.dp;

/**
 * Beginner state-compression DP pattern.
 *
 * Use when a small set of chosen/un-chosen states can be stored in a bitmask.
 */
public class PT8StateCompressionDpTemplate {
    public int countSubsetsWithEvenSize(int n) {
        int total = 0;
        int allMasks = 1 << n;

        for (int mask = 0; mask < allMasks; mask++) {
            if (Integer.bitCount(mask) % 2 == 0) {
                total++;
            }
        }

        return total;
    }
}
