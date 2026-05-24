package com.practice.dsa.problems.arrays_hashing;

import com.practice.dsa.problems.arrays_hashing.contains_duplicate.LC217ContainsDuplicateSolver;
import com.practice.dsa.problems.arrays_hashing.group_anagrams.LC49GroupAnagramsSolver;
import com.practice.dsa.problems.arrays_hashing.longest_consecutive_sequence.LC128LongestConsecutiveSequenceSolver;
import com.practice.dsa.problems.arrays_hashing.product_of_array_except_self.LC238ProductOfArrayExceptSelfSolver;
import com.practice.dsa.problems.arrays_hashing.top_k_frequent_elements.LC347TopKFrequentElementsSolver;
import com.practice.dsa.problems.arrays_hashing.two_sum.LC1TwoSumSolver;
import com.practice.dsa.problems.arrays_hashing.valid_anagram.LC242ValidAnagramSolver;

import java.util.Arrays;

/**
 * Beginner topic runner.
 *
 * Use this class when you want one quick entry point
 * for the Arrays and Hashing topic.
 */
public class ArraysHashingProblemsMain {
    public static void main(String[] args) {
        // Run a small sample for Two Sum.
        System.out.println("LC1   = " + Arrays.toString(new LC1TwoSumSolver().twoSum(new int[]{2, 7, 11, 15}, 9)));
        // Run a duplicate check sample.
        System.out.println("LC217 = " + new LC217ContainsDuplicateSolver().containsDuplicate(new int[]{1, 2, 3, 1}));
        // Run an anagram sample.
        System.out.println("LC242 = " + new LC242ValidAnagramSolver().isAnagram("anagram", "nagaram"));
        // Run a group-anagrams sample.
        System.out.println("LC49  = " + new LC49GroupAnagramsSolver().groupAnagrams(new String[]{"eat", "tea", "ate", "bat"}));
        // Run a top-k-frequency sample.
        System.out.println("LC347 = " + Arrays.toString(new LC347TopKFrequentElementsSolver().topKFrequent(new int[]{1, 1, 2, 2, 2, 3}, 2)));
        // Run a product-except-self sample.
        System.out.println("LC238 = " + Arrays.toString(new LC238ProductOfArrayExceptSelfSolver().productExceptSelf(new int[]{1, 2, 3, 4})));
        // Run a longest-consecutive-sequence sample.
        System.out.println("LC128 = " + new LC128LongestConsecutiveSequenceSolver().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
