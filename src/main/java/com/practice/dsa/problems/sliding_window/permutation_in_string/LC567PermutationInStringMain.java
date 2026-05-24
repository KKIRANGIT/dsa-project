package com.practice.dsa.problems.sliding_window.permutation_in_string;

public class LC567PermutationInStringMain {
    public static void main(String[] args) {
        // Create solver object.
        LC567PermutationInStringSolver solver = new LC567PermutationInStringSolver();
        // Print whether s2 contains any permutation of s1.
        System.out.println(solver.checkInclusion("ab", "eidbaooo"));
    }
}
