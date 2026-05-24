package com.practice.dsa.basics.math;

/**
 * Beginner math utilities reference.
 *
 * gcd uses Euclid's algorithm.
 * fastPower uses repeated squaring.
 */
public class MathUtilities {
    public int gcd(int a, int b) {
        // Keep replacing (a, b) with (b, a % b) until remainder becomes 0.
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        // Use absolute value to avoid negative result.
        return Math.abs(a);
    }

    public long fastPower(long base, long exponent) {
        // Start with multiplicative identity.
        long result = 1;
        while (exponent > 0) {
            // If current exponent bit is 1, multiply result by current base.
            if ((exponent & 1) == 1) {
                result *= base;
            }
            // Square the base for the next bit position.
            base *= base;
            // Shift exponent right by one bit.
            exponent >>= 1;
        }
        // Return computed power.
        return result;
    }
}
