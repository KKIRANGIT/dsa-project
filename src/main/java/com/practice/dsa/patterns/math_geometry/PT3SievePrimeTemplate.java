package com.practice.dsa.patterns.math_geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner sieve pattern.
 *
 * Use when many prime queries are needed.
 */
public class PT3SievePrimeTemplate {
    public List<Integer> primesUpTo(int n) {
        boolean[] prime = new boolean[n + 1];
        java.util.Arrays.fill(prime, true);

        if (n >= 0) {
            prime[0] = false;
        }
        if (n >= 1) {
            prime[1] = false;
        }

        for (int value = 2; value * value <= n; value++) {
            if (!prime[value]) {
                continue;
            }
            for (int multiple = value * value; multiple <= n; multiple += value) {
                prime[multiple] = false;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int value = 2; value <= n; value++) {
            if (prime[value]) {
                result.add(value);
            }
        }
        return result;
    }
}
