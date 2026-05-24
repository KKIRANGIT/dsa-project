package com.practice.dsa.patterns.math_geometry;

/**
 * Beginner modular-arithmetic pattern.
 *
 * Use when answers must be kept under a modulus.
 */
public class PT4ModularArithmeticTemplate {
    public long modPow(long base, long exponent, long mod) {
        long result = 1 % mod;
        base %= mod;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }

        return result;
    }
}
