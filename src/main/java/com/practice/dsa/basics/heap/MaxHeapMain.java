package com.practice.dsa.basics.heap;

public class MaxHeapMain {
    public static void main(String[] args) {
        // Create heap object.
        MaxHeap heap = new MaxHeap();
        // Insert values.
        // Heap order is partial order, not full array sorting.
        heap.add(9);
        heap.add(2);
        heap.add(7);
        heap.add(15);

        // Largest value should be on top.
        System.out.println("peek = " + heap.peek());
        // Remove largest value.
        System.out.println("poll = " + heap.poll());
        // Check next largest after removing the old root.
        System.out.println("peek = " + heap.peek());
    }
}
