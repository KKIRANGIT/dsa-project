package com.practice.dsa.patterns.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner LIS patience-sorting pattern.
 *
 * Use for Longest Increasing Subsequence in O(n log n).
 */
public class PT7LisPatienceSortingTemplate {
    public int lengthOfLis(int[] nums) {
        List<Integer> piles = new ArrayList<>();

        for (int num : nums) {
            int left = 0;
            int right = piles.size();

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (piles.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left == piles.size()) {
                piles.add(num);
            } else {
                piles.set(left, num);
            }
        }

        return piles.size();
    }
}
