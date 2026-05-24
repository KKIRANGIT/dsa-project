package com.practice.dsa.patterns.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Beginner memoization pattern.
 *
 * Save results of repeated subproblems in a map.
 */
public class PT1MemoizationTemplate {
    public int climbStairs(int n) {
        // Start recursive solution with empty memo.
        return climb(n, new HashMap<>());
    }

    private int climb(int n, Map<Integer, Integer> memo) {
        // Base answers.
        if (n <= 2) {
            return n;
        }
        // Return saved result if already computed.
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute current answer from smaller subproblems.
        int answer = climb(n - 1, memo) + climb(n - 2, memo);
        // Save result for reuse.
        memo.put(n, answer);
        return answer;
    }
}
