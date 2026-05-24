package com.practice.dsa.problems.dp1.word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LC 139 - Word Break
 *
 * Beginner idea:
 * dp[i] means the prefix ending before index i can be fully segmented.
 */
public class LC139WordBreakSolver {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end; start++) {
                if (dp[start] && words.contains(s.substring(start, end))) {
                    dp[end] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
