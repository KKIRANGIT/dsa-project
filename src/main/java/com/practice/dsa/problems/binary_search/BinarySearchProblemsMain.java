package com.practice.dsa.problems.binary_search;

import com.practice.dsa.problems.binary_search.binary_search.LC704BinarySearchSolver;
import com.practice.dsa.problems.binary_search.koko_eating_bananas.LC875KokoEatingBananasSolver;
import com.practice.dsa.problems.binary_search.search_in_rotated_sorted_array.LC33SearchInRotatedSortedArraySolver;

/**
 * Beginner topic runner for Binary Search problems.
 */
public class BinarySearchProblemsMain {
    public static void main(String[] args) {
        // Run a normal binary-search sample.
        System.out.println("LC704 = " + new LC704BinarySearchSolver().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        // Run a rotated-array search sample.
        System.out.println("LC33  = " + new LC33SearchInRotatedSortedArraySolver().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        // Run a binary-search-on-answer sample.
        System.out.println("LC875 = " + new LC875KokoEatingBananasSolver().minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
