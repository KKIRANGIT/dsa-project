package com.practice.dsa.problems.sliding_window;

import com.practice.dsa.problems.sliding_window.best_time_to_buy_and_sell_stock.LC121BestTimeToBuyAndSellStockSolver;
import com.practice.dsa.problems.sliding_window.longest_repeating_character_replacement.LC424LongestRepeatingCharacterReplacementSolver;
import com.practice.dsa.problems.sliding_window.longest_substring_without_repeating_characters.LC3LongestSubstringWithoutRepeatingCharactersSolver;
import com.practice.dsa.problems.sliding_window.minimum_window_substring.LC76MinimumWindowSubstringSolver;
import com.practice.dsa.problems.sliding_window.permutation_in_string.LC567PermutationInStringSolver;
import com.practice.dsa.problems.sliding_window.sliding_window_maximum.LC239SlidingWindowMaximumSolver;

import java.util.Arrays;

/**
 * Beginner topic runner for Sliding Window.
 */
public class SlidingWindowProblemsMain {
    public static void main(String[] args) {
        // Run a stock-profit sample.
        System.out.println("LC121 = " + new LC121BestTimeToBuyAndSellStockSolver().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        // Run a longest-substring sample.
        System.out.println("LC3   = " + new LC3LongestSubstringWithoutRepeatingCharactersSolver().lengthOfLongestSubstring("pwwkew"));
        // Run a character-replacement sample.
        System.out.println("LC424 = " + new LC424LongestRepeatingCharacterReplacementSolver().characterReplacement("AABABBA", 1));
        // Run a permutation-in-string sample.
        System.out.println("LC567 = " + new LC567PermutationInStringSolver().checkInclusion("ab", "eidbaooo"));
        // Run a minimum-window sample.
        System.out.println("LC76  = " + new LC76MinimumWindowSubstringSolver().minWindow("ADOBECODEBANC", "ABC"));
        // Run a sliding-window-maximum sample.
        System.out.println("LC239 = " + Arrays.toString(new LC239SlidingWindowMaximumSolver().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
