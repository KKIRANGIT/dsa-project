package com.practice.dsa.basics.bit;

public class BitUtilitiesMain {
    public static void main(String[] args) {
        // Create helper object.
        BitUtilities utilities = new BitUtilities();
        // Check whether 16 is a power of two.
        System.out.println("isPowerOfTwo(16) = " + utilities.isPowerOfTwo(16));
        // Count set bits in binary form of 13.
        System.out.println("setBits(13)      = " + utilities.countSetBits(13));
    }
}
