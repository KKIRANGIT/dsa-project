package com.practice.dsa.basics.queue;

public class LinkedListQueueBasicMain {
    public static void main(String[] args) {
        LinkedListQueueBasic queue = new LinkedListQueueBasic();

        // Offer order: 11 enters first, then 22, then 33.
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);

        // Because queue is FIFO, the earliest value leaves first.
        System.out.println("peek = " + queue.peek());
        System.out.println("poll = " + queue.poll());
        System.out.println("poll = " + queue.poll());
        System.out.println("isEmpty = " + queue.isEmpty());
    }
}
