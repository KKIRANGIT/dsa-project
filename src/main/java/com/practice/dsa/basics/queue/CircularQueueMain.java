package com.practice.dsa.basics.queue;

public class CircularQueueMain {
    public static void main(String[] args) {
        // Create queue with capacity 5.
        CircularQueue queue = new CircularQueue(5);

        // Add three values.
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // Front should be 1.
        System.out.println("peek = " + queue.peek());
        // Remove front.
        System.out.println("poll = " + queue.poll());
        // Add one more value.
        queue.offer(4);
        // Front should now be 2.
        System.out.println("peek = " + queue.peek());
    }
}
