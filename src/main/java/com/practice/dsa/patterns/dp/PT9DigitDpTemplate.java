package com.practice.dsa.patterns.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Beginner digit-DP pattern.
 *
 * Use when counting numbers in a range with digit-based constraints.
 */
public class PT9DigitDpTemplate {
    public int countNumbersWithoutDigitFour(int limit) {
        char[] digits = String.valueOf(limit).toCharArray();
        return dfs(digits, 0, true, false, new HashMap<>());
    }

    private int dfs(char[] digits, int index, boolean tight, boolean started, Map<String, Integer> memo) {
        if (index == digits.length) {
            return 1;
        }

        String key = index + "|" + tight + "|" + started;
        if (!tight && memo.containsKey(key)) {
            return memo.get(key);
        }

        int upper = tight ? digits[index] - '0' : 9;
        int total = 0;

        for (int digit = 0; digit <= upper; digit++) {
            if (digit == 4) {
                continue;
            }
            total += dfs(digits, index + 1, tight && digit == upper, started || digit != 0, memo);
        }

        if (!tight) {
            memo.put(key, total);
        }

        return total;
    }
}
