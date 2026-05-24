package com.practice.dsa.problems.backtracking.permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 46 - Permutations
 *
 * Beginner idea:
 * Build the answer one position at a time.
 * used[i] tells us whether nums[i] is already in the current path.
 */
public class LC46PermutationsSolver {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            // Choose nums[i] for the next position.
            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, used, path, result);
            // Undo so other branches can use nums[i].
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
