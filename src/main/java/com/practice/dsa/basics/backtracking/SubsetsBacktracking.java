package com.practice.dsa.basics.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner backtracking reference for subsets.
 *
 * path   = current subset being built
 * result = all completed subsets collected so far
 *
 * Rule:
 * Every time we enter backtrack, the current path itself is already a valid subset.
 *
 * Important beginner idea:
 * subsets do not need a base case tied to exact length.
 * We record the current path at every level because every partial choice is valid.
 */
public class SubsetsBacktracking {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        // Save the current subset before exploring further choices.
        result.add(new ArrayList<>(path));

        for (int i = index; i < nums.length; i++) {
            // Choose current number.
            path.add(nums[i]);
            // Explore deeper subsets that include this choice.
            backtrack(nums, i + 1, path, result);
            // Unchoose so the next branch starts clean.
            path.remove(path.size() - 1);
        }
    }
}
