package com.practice.dsa.basics.bit;

public class BitMaskEnumerationBasicsMain {
    public static void main(String[] args) {
        BitMaskEnumerationBasics basics = new BitMaskEnumerationBasics();
        // For 3 values, total subsets should be 2^3 = 8.
        System.out.println(basics.subsets(new int[]{1, 2, 3}));
    }
}
