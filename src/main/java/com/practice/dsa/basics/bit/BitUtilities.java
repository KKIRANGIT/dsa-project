package com.practice.dsa.basics.bit;

/**
 * Beginner bit-manipulation reference.
 */
public class BitUtilities {
    public boolean isPowerOfTwo(int n) {
        // A power of two has exactly one set bit.
        return n > 0 && (n & (n - 1)) == 0;
    }

    public int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            // Remove the lowest set bit.
            n &= (n - 1);
            count++;
        }
        // Return number of removed set bits.
        return count;
    }
}
