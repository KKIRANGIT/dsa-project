package com.practice.dsa.basics.queue;

/**
 * Beginner deque reference.
 *
 * Deque means double-ended queue.
 * We can insert and remove from both front and back.
 */
public class ArrayDequeBasic {
    private final int[] data;
    private int front;
    private int size;

    public ArrayDequeBasic(int capacity) {
        // Create storage with fixed capacity.
        data = new int[capacity];
    }

    public void offerFirst(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Deque is full");
        }
        // Move front backward in circular fashion.
        front = (front - 1 + data.length) % data.length;
        data[front] = value;
        size++;
    }

    public void offerLast(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Deque is full");
        }
        // rear is the position after the current last element.
        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;
    }

    public int pollFirst() {
        // Read front value.
        int value = data[front];
        // Move front forward.
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public int pollLast() {
        // Compute rear index of current last element.
        int rear = (front + size - 1 + data.length) % data.length;
        int value = data[rear];
        size--;
        return value;
    }
}
