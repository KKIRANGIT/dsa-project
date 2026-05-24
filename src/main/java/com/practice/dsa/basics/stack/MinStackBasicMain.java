package com.practice.dsa.basics.stack;

public class MinStackBasicMain {
    public static void main(String[] args) {
        // Create stack object.
        MinStackBasic stack = new MinStackBasic();
        // Push sample values.
        stack.push(5);
        stack.push(2);
        stack.push(7);

        // Minimum should be 2.
        System.out.println("min = " + stack.getMin());
        // Pop 7.
        stack.pop();
        // Pop 2.
        stack.pop();
        // Minimum should now be 5.
        System.out.println("min = " + stack.getMin());
    }
}
