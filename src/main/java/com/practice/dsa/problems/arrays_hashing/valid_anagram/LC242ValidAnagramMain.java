package com.practice.dsa.problems.arrays_hashing.valid_anagram;

public class LC242ValidAnagramMain {
    public static void main(String[] args) {
        // Create the solver.
        LC242ValidAnagramSolver solver = new LC242ValidAnagramSolver();
        // Compare two words and print whether they are anagrams.
        System.out.println("anagram = " + solver.isAnagram("listen", "silent"));
    }
}
