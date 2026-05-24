package com.practice.dsa.patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner combination backtracking pattern.
 *
 * Choose numbers in increasing order so duplicates are avoided.
 */
public class PT2CombinationTemplate {
    public List<List<Integer>> combine(int n, int k) {
        // Result holds all size-k combinations.
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int value = start; value <= n; value++) {
            // Choose current value.
            path.add(value);
            // Explore next choices from value + 1 onward.
            backtrack(value + 1, n, k, path, result);
            // Undo choice.
            path.remove(path.size() - 1);
        }
    }
}
