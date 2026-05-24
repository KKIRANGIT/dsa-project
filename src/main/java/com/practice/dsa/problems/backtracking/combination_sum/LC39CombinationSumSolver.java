package com.practice.dsa.problems.backtracking.combination_sum;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 39 - Combination Sum
 *
 * Beginner idea:
 * Try each candidate starting from the current position.
 * We are allowed to reuse the same number, so the recursive call keeps i.
 */
public class LC39CombinationSumSolver {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start, List<Integer> path, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (remaining < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }
}
