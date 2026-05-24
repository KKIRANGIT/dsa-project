package com.practice.dsa.patterns.bit_manipulation;

/**
 * Beginner single-bit operations pattern.
 */
public class PT1BitOperationsTemplate {
    public boolean isSet(int mask, int bit) {
        return (mask & (1 << bit)) != 0;
    }

    public int setBit(int mask, int bit) {
        return mask | (1 << bit);
    }

    public int clearBit(int mask, int bit) {
        return mask & ~(1 << bit);
    }
}
