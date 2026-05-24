package com.practice.dsa.basics.recursion;

/**
 * Beginner recursion reference using factorial.
 *
 * This helps explain:
 * - base case
 * - recursive call
 * - call stack growth
 */
public class FactorialRecursion {
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
