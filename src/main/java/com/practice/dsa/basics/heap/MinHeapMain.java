package com.practice.dsa.basics.heap;

public class MinHeapMain {
    public static void main(String[] args) {
        // Create heap object.
        MinHeap heap = new MinHeap();
        // Insert values.
        // Heap order is not full sorting; it only guarantees the smallest root.
        heap.add(9);
        heap.add(2);
        heap.add(7);
        heap.add(1);

        // Smallest value should be on top.
        System.out.println("peek = " + heap.peek());
        // Remove smallest value.
        System.out.println("poll = " + heap.poll());
        // Check next smallest after removing the old root.
        System.out.println("peek = " + heap.peek());
    }
}
