package com.practice.dsa.patterns.binary_search;

/**
 * Beginner binary-search-on-answer pattern.
 *
 * Instead of searching inside an array directly,
 * search for the smallest answer that satisfies a yes/no condition.
 */
public class PT1BinarySearchTemplate {
    public int searchOnAnswer(int[] piles, int hours) {
        // Minimum possible speed.
        int left = 1;
        // Maximum possible speed is the largest pile.
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, hours, mid)) {
                // mid works, try smaller answer.
                right = mid;
            } else {
                // mid is too small, try larger answer.
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canFinish(int[] piles, int hours, int speed) {
        // Total hours needed at the chosen speed.
        long needed = 0;
        for (int pile : piles) {
            needed += (pile + speed - 1) / speed;
        }
        // Valid if total time is within allowed hours.
        return needed <= hours;
    }
}
