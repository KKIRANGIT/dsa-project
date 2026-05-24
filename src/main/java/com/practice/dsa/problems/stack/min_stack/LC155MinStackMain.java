package com.practice.dsa.problems.stack.min_stack;

public class LC155MinStackMain {
    public static void main(String[] args) {
        // Create the custom stack.
        LC155MinStack stack = new LC155MinStack();
        // Push a few values.
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        // Current minimum should be -3.
        System.out.println("min = " + stack.getMin());
        // Remove top value -3.
        stack.pop();
        // Current top becomes 0.
        System.out.println("top = " + stack.top());
        // Current minimum becomes -2.
        System.out.println("min = " + stack.getMin());
    }
}
