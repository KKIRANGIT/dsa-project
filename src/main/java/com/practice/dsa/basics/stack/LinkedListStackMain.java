package com.practice.dsa.basics.stack;

public class LinkedListStackMain {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Push order: 10 goes in first, 30 goes in last.
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Because stack is LIFO, the most recent value comes out first.
        System.out.println("peek = " + stack.peek());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("isEmpty = " + stack.isEmpty());
    }
}
