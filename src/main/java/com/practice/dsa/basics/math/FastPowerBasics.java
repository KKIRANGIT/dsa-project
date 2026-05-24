package com.practice.dsa.basics.math;

/**
 * Beginner fast power reference.
 *
 * Uses repeated squaring to reduce time from O(exponent) to O(log exponent).
 *
 * Binary idea:
 * if the current exponent bit is 1, include the current base in the answer.
 * Then square the base and shift the exponent right.
 */
public class FastPowerBasics {
    public long power(long base, int exponent) {
        long result = 1;
        long currentBase = base;
        int currentExponent = exponent;

        while (currentExponent > 0) {
            if ((currentExponent & 1) == 1) {
                // This bit says the current power contributes to the answer.
                result *= currentBase;
            }
            // Move from base^(2^k) to base^(2^(k+1)).
            currentBase *= currentBase;
            // Drop the bit we already processed.
            currentExponent >>= 1;
        }

        return result;
    }
}
