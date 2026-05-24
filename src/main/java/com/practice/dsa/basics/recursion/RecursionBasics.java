package com.practice.dsa.basics.recursion;

/**
 * Beginner recursion reference.
 *
 * factorial(n) = n * factorial(n - 1)
 * Base case stops the recursion.
 *
 * Every recursion problem should be read in this order:
 * 1. what is the smaller subproblem?
 * 2. when must we stop?
 * 3. what work happens before or after the recursive call?
 */
public class RecursionBasics {
    public int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1.
        if (n <= 1) {
            return 1;
        }
        // Recursive case: reduce problem size by 1,
        // then multiply by the current n when the call stack returns.
        return n * factorial(n - 1);
    }
}
