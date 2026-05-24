package com.practice.dsa.problems.sliding_window.minimum_window_substring;

public class LC76MinimumWindowSubstringMain {
    public static void main(String[] args) {
        // Create solver object.
        LC76MinimumWindowSubstringSolver solver = new LC76MinimumWindowSubstringSolver();
        // Print the smallest valid window that contains all required characters.
        System.out.println(solver.minWindow("ADOBECODEBANC", "ABC"));
    }
}
