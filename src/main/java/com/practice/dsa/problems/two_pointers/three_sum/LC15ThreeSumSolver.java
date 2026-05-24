package com.practice.dsa.problems.two_pointers.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LC 15 - 3Sum
 *
 * Beginner idea:
 * 1. Sort the array.
 * 2. Fix one number.
 * 3. Solve the remaining two-number part with two pointers.
 *
 * Sorting also helps us skip duplicates cleanly.
 */
public class LC15ThreeSumSolver {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate first values so we do not repeat triplets.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicate second values.
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // Skip duplicate third values.
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    // Need a larger sum.
                    left++;
                } else {
                    // Need a smaller sum.
                    right--;
                }
            }
        }

        return result;
    }
}
