package com.practice.dsa.patterns.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner permutation backtracking pattern.
 */
public class PT3PermutationTemplate {
    public List<List<Integer>> permute(int[] nums) {
        // Result holds all complete permutations.
        List<List<Integer>> result = new ArrayList<>();
        // used[i] tells whether nums[i] is already in path.
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

            // Choose nums[i].
            used[i] = true;
            path.add(nums[i]);
            // Explore deeper.
            backtrack(nums, used, path, result);
            // Undo choice.
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
