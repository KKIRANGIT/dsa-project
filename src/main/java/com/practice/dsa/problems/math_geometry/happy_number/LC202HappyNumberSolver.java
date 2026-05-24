package com.practice.dsa.problems.math_geometry.happy_number;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 202 - Happy Number
 *
 * Beginner idea:
 * Repeatedly replace the number with the sum of squares of its digits.
 * If we reach 1, it is happy.
 * If we repeat a previous number, we are stuck in a cycle.
 */
public class LC202HappyNumberSolver {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && seen.add(n)) {
            n = next(n);
        }

        return n == 1;
    }

    private int next(int n) {
        int total = 0;
        while (n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }
}
