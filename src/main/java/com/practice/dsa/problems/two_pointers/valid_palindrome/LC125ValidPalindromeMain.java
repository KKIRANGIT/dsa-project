package com.practice.dsa.problems.two_pointers.valid_palindrome;

public class LC125ValidPalindromeMain {
    public static void main(String[] args) {
        // Create solver object.
        LC125ValidPalindromeSolver solver = new LC125ValidPalindromeSolver();
        // Check whether the sentence becomes a palindrome after ignoring symbols and case.
        System.out.println(solver.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
