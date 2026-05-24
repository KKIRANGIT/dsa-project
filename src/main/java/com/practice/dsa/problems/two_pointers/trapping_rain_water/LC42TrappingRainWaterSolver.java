package com.practice.dsa.problems.two_pointers.trapping_rain_water;

/**
 * LC 42 - Trapping Rain Water
 *
 * Beginner idea:
 * Water above a bar depends on the tallest wall on the left
 * and the tallest wall on the right.
 *
 * We move the smaller side first because that side is the one
 * whose water level is already determined.
 */
public class LC42TrappingRainWaterSolver {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                // If current bar is lower than leftMax, it traps water.
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                // Same idea on the right side.
                water += rightMax - height[right];
                right--;
            }
        }

        return water;
    }
}
