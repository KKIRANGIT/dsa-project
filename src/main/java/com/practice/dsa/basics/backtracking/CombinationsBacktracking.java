package com.practice.dsa.basics.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner combinations backtracking reference.
 *
 * Order does not matter here.
 */
public class CombinationsBacktracking {
    public List<List<Integer>> combine(int n, int k) {
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
            path.add(value);
            backtrack(value + 1, n, k, path, result);
            path.remove(path.size() - 1);
        }
    }
}
