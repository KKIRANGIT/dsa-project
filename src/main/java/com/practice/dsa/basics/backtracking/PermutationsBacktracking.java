package com.practice.dsa.basics.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner permutations backtracking reference.
 *
 * Order matters here, so each position must choose among unused values.
 */
public class PermutationsBacktracking {
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

        for (int index = 0; index < nums.length; index++) {
            if (used[index]) {
                continue;
            }

            used[index] = true;
            path.add(nums[index]);
            backtrack(nums, used, path, result);
            path.remove(path.size() - 1);
            used[index] = false;
        }
    }
}
