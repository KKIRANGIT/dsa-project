package com.practice.dsa.problems.bit_manipulation;

import com.practice.dsa.problems.bit_manipulation.counting_bits.LC338CountingBitsSolver;
import com.practice.dsa.problems.bit_manipulation.number_of_1_bits.LC191NumberOf1BitsSolver;
import com.practice.dsa.problems.bit_manipulation.single_number.LC136SingleNumberSolver;

import java.util.Arrays;

public class BitManipulationProblemsMain {
    public static void main(String[] args) {
        // Run single-number sample.
        System.out.println("LC136 = " + new LC136SingleNumberSolver().singleNumber(new int[]{2, 2, 1}));
        // Run number-of-1-bits sample.
        System.out.println("LC191 = " + new LC191NumberOf1BitsSolver().hammingWeight(11));
        // Run counting-bits sample.
        System.out.println("LC338 = " + Arrays.toString(new LC338CountingBitsSolver().countBits(5)));
    }
}
