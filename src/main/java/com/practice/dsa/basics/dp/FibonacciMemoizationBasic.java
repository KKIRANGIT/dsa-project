package com.practice.dsa.basics.dp;

import java.util.Arrays;

/**
 * Beginner top-down DP reference.
 *
 * This shows memoization explicitly:
 * solve recursively, but cache answers so repeated work disappears.
 */
public class FibonacciMemoizationBasic {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return fib(n, memo);
    }

    private int fib(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}
