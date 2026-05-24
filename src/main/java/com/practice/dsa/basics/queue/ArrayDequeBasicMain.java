package com.practice.dsa.basics.queue;

public class ArrayDequeBasicMain {
    public static void main(String[] args) {
        // Create deque with capacity 6.
        ArrayDequeBasic deque = new ArrayDequeBasic(6);
        // Insert values from both ends.
        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerFirst(5);

        // Remove from front.
        System.out.println("pollFirst = " + deque.pollFirst());
        // Remove from back.
        System.out.println("pollLast  = " + deque.pollLast());
    }
}
