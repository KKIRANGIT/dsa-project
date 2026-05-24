package com.practice.dsa.problems.backtracking.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 78 - Subsets
 *
 * Beginner idea:
 * At each position, we can choose the current number or skip it.
 * Backtracking explores those choices systematically.
 */
public class LC78SubsetsSolver {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        // Every path built so far is a valid subset.
        result.add(new ArrayList<>(path));

        for (int i = index; i < nums.length; i++) {
            // Choose nums[i].
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            // Undo the choice before trying the next branch.
            path.remove(path.size() - 1);
        }
    }
}
