package com.practice.dsa.problems.dp1.climbing_stairs;

/**
 * LC 70 - Climbing Stairs
 *
 * Beginner idea:
 * To reach step n, you must come from:
 * - step n - 1
 * - step n - 2
 *
 * So the answer follows a Fibonacci-style recurrence.
 */
public class LC70ClimbingStairsSolver {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
