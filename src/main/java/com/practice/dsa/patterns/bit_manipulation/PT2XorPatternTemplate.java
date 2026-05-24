package com.practice.dsa.patterns.bit_manipulation;

/**
 * Beginner XOR pattern.
 */
public class PT2XorPatternTemplate {
    public int singleValue(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer ^= num;
        }
        return answer;
    }
}
