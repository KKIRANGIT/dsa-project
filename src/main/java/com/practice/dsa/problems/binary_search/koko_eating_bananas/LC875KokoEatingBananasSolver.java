package com.practice.dsa.problems.binary_search.koko_eating_bananas;

/**
 * LC 875 - Koko Eating Bananas
 *
 * Beginner idea:
 * We do binary search on the answer itself.
 *
 * Question:
 * "If Koko eats at speed X, can she finish in time?"
 *
 * That yes/no check allows binary search.
 */
public class LC875KokoEatingBananasSolver {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                // mid works, so maybe a smaller speed also works.
                right = mid;
            } else {
                // mid is too slow, so increase speed.
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long neededHours = 0;
        for (int pile : piles) {
            // Ceiling division: how many whole hours for this pile?
            neededHours += (pile + speed - 1) / speed;
        }
        return neededHours <= h;
    }
}
