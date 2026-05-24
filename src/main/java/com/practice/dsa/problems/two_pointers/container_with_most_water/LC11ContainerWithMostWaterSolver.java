package com.practice.dsa.problems.two_pointers.container_with_most_water;

/**
 * LC 11 - Container With Most Water
 *
 * Beginner idea:
 * The width is the distance between the two pointers.
 * The height is limited by the shorter line.
 *
 * After computing the current area, move the shorter line inward,
 * because moving the taller line cannot help while the shorter line
 * is still the bottleneck.
 */
public class LC11ContainerWithMostWaterSolver {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int best = 0;

        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            best = Math.max(best, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return best;
    }
}
