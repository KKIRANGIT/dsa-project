package com.practice.dsa.problems.stack.valid_parentheses;

public class LC20ValidParenthesesMain {
    public static void main(String[] args) {
        // Create solver object.
        LC20ValidParenthesesSolver solver = new LC20ValidParenthesesSolver();
        // Print whether the bracket sequence is valid.
        System.out.println(solver.isValid("()[]{}"));
    }
}
