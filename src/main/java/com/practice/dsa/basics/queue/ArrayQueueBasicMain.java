package com.practice.dsa.basics.queue;

public class ArrayQueueBasicMain {
    public static void main(String[] args) {
        ArrayQueueBasic queue = new ArrayQueueBasic(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("peek = " + queue.peek());
        System.out.println("poll = " + queue.poll());
        System.out.println("poll = " + queue.poll());
        System.out.println("isEmpty = " + queue.isEmpty());
    }
}
