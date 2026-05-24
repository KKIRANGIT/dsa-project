package com.practice.dsa.problems.arrays_hashing.group_anagrams;

import java.util.Arrays;

public class LC49GroupAnagramsMain {
    public static void main(String[] args) {
        // Input words to be grouped.
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // Create solver object.
        LC49GroupAnagramsSolver solver = new LC49GroupAnagramsSolver();

        // Print original words.
        System.out.println("words  = " + Arrays.toString(words));
        // Print grouped anagrams.
        System.out.println("groups = " + solver.groupAnagrams(words));
    }
}
