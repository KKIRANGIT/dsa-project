package com.practice.dsa.basics.arrays;

/**
 * Beginner array traversal reference.
 *
 * This class shows the most basic array operations that later patterns build on:
 * - forward traversal
 * - reverse traversal
 * - finding min and max
 */
public class ArrayTraversalBasics {
    public int sumForward(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int sumBackward(int[] nums) {
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
        }
        return sum;
    }

    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
