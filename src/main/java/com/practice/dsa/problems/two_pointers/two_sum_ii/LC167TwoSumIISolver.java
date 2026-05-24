package com.practice.dsa.problems.two_pointers.two_sum_ii;

/**
 * LC 167 - Two Sum II
 *
 * Beginner idea:
 * The array is already sorted.
 * If the sum is too small, move left forward.
 * If the sum is too large, move right backward.
 */
public class LC167TwoSumIISolver {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            // Need a bigger sum.
            if (sum < target) {
                left++;
            } else {
                // Need a smaller sum.
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
