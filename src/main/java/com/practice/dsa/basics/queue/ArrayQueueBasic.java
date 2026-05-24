package com.practice.dsa.basics.queue;

/**
 * Beginner queue reference using a simple array.
 *
 * This version is educational, not optimized for unlimited reuse.
 */
public class ArrayQueueBasic {
    private final int[] data;
    private int size;

    public ArrayQueueBasic(int capacity) {
        this.data = new int[capacity];
    }

    public void offer(int value) {
        if (size == data.length) {
            throw new IllegalStateException("queue is full");
        }

        data[size] = value;
        size++;
    }

    public int poll() {
        if (size == 0) {
            throw new IllegalStateException("queue is empty");
        }

        int value = data[0];
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return value;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("queue is empty");
        }
        return data[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
