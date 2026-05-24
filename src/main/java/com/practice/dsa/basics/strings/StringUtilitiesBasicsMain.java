package com.practice.dsa.basics.strings;

import java.util.Arrays;

public class StringUtilitiesBasicsMain {
    public static void main(String[] args) {
        StringUtilitiesBasics basics = new StringUtilitiesBasics();
        String text = "level";
        String other = "banana";

        // Reverse checks left-right swapping logic.
        System.out.println("reverse(" + other + ") = " + basics.reverse(other));
        // "level" should stay a palindrome because both sides mirror perfectly.
        System.out.println("isPalindrome(" + text + ") = " + basics.isPalindrome(text));
        // Frequency array uses index 0 for 'a', index 1 for 'b', and so on.
        System.out.println("frequency(" + other + ") = " + Arrays.toString(basics.lowercaseFrequency(other)));
    }
}
