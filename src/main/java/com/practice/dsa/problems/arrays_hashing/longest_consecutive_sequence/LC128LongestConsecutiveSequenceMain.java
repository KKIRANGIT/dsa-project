package com.practice.dsa.problems.arrays_hashing.longest_consecutive_sequence;

public class LC128LongestConsecutiveSequenceMain {
    public static void main(String[] args) {
        // Create solver object.
        LC128LongestConsecutiveSequenceSolver solver = new LC128LongestConsecutiveSequenceSolver();
        // Print the longest consecutive sequence length.
        System.out.println("longest = " + solver.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
