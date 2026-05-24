package com.practice.dsa.problems.bit_manipulation.single_number;

/**
 * LC 136 - Single Number
 *
 * Beginner idea:
 * x ^ x = 0
 * x ^ 0 = x
 *
 * So duplicate numbers cancel out, leaving only the single number.
 */
public class LC136SingleNumberSolver {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer ^= num;
        }
        return answer;
    }
}
