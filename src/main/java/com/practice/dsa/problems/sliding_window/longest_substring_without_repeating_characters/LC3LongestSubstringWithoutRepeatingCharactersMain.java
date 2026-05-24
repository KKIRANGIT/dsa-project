package com.practice.dsa.problems.sliding_window.longest_substring_without_repeating_characters;

public class LC3LongestSubstringWithoutRepeatingCharactersMain {
    public static void main(String[] args) {
        // Create solver object.
        LC3LongestSubstringWithoutRepeatingCharactersSolver solver = new LC3LongestSubstringWithoutRepeatingCharactersSolver();
        // Print the length of the longest duplicate-free substring.
        System.out.println(solver.lengthOfLongestSubstring("abcabcbb"));
    }
}
