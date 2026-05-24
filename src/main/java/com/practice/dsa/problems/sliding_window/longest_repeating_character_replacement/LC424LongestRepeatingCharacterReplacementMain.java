package com.practice.dsa.problems.sliding_window.longest_repeating_character_replacement;

public class LC424LongestRepeatingCharacterReplacementMain {
    public static void main(String[] args) {
        // Create solver object.
        LC424LongestRepeatingCharacterReplacementSolver solver = new LC424LongestRepeatingCharacterReplacementSolver();
        // Print the best window length after at most one replacement.
        System.out.println(solver.characterReplacement("AABABBA", 1));
    }
}
