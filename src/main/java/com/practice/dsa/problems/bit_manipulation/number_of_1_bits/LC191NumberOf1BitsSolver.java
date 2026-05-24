package com.practice.dsa.problems.bit_manipulation.number_of_1_bits;

/**
 * LC 191 - Number of 1 Bits
 *
 * Beginner idea:
 * n & (n - 1) removes the lowest set bit.
 * Count how many times that can happen before the number becomes zero.
 */
public class LC191NumberOf1BitsSolver {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
