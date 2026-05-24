package com.practice.dsa.basics.math;

public class MathUtilitiesMain {
    public static void main(String[] args) {
        // Create helper object.
        MathUtilities utilities = new MathUtilities();
        // Print gcd of 24 and 18.
        System.out.println("gcd(24, 18) = " + utilities.gcd(24, 18));
        // Print 2 raised to power 10.
        System.out.println("2^10        = " + utilities.fastPower(2, 10));
    }
}
