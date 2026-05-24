package com.practice.dsa.basics.stack;

public class ArrayStackMain {
    public static void main(String[] args) {
        // Create stack object.
        ArrayStack stack = new ArrayStack();

        // Push three values.
        stack.push(5);
        stack.push(8);
        stack.push(13);

        // Top should be 13.
        System.out.println("peek = " + stack.peek());
        // Remove top value.
        System.out.println("pop  = " + stack.pop());
        // Top should now be 8.
        System.out.println("peek = " + stack.peek());
    }
}
