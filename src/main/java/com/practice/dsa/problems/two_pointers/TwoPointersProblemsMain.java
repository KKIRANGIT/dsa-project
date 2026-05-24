package com.practice.dsa.problems.two_pointers;

import com.practice.dsa.problems.two_pointers.container_with_most_water.LC11ContainerWithMostWaterSolver;
import com.practice.dsa.problems.two_pointers.three_sum.LC15ThreeSumSolver;
import com.practice.dsa.problems.two_pointers.trapping_rain_water.LC42TrappingRainWaterSolver;
import com.practice.dsa.problems.two_pointers.two_sum_ii.LC167TwoSumIISolver;
import com.practice.dsa.problems.two_pointers.valid_palindrome.LC125ValidPalindromeSolver;

import java.util.Arrays;

/**
 * Beginner topic runner for Two Pointers.
 */
public class TwoPointersProblemsMain {
    public static void main(String[] args) {
        // Run a valid-palindrome sample.
        System.out.println("LC125 = " + new LC125ValidPalindromeSolver().isPalindrome("race a car"));
        // Run a sorted-two-sum sample.
        System.out.println("LC167 = " + Arrays.toString(new LC167TwoSumIISolver().twoSum(new int[]{2, 7, 11, 15}, 9)));
        // Run a 3Sum sample.
        System.out.println("LC15  = " + new LC15ThreeSumSolver().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        // Run a max-water sample.
        System.out.println("LC11  = " + new LC11ContainerWithMostWaterSolver().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        // Run a trapping-rain-water sample.
        System.out.println("LC42  = " + new LC42TrappingRainWaterSolver().trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
