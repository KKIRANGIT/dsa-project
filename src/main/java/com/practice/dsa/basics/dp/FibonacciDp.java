package com.practice.dsa.basics.dp;

/**
 * Beginner dynamic programming reference using Fibonacci.
 *
 * Each value depends on the previous two values.
 * We keep only the needed previous answers instead of a full array.
 */
public class FibonacciDp {
    public int fib(int n) {
        // Base cases.
        if (n <= 1) {
            return n;
        }

        // fib(0)
        int prev2 = 0;
        // fib(1)
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {
            // Current Fibonacci value.
            int current = prev1 + prev2;
            // Shift values forward.
            prev2 = prev1;
            prev1 = current;
        }
        // prev1 now stores fib(n).
        return prev1;
    }
}
