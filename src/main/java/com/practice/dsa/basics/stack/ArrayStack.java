package com.practice.dsa.basics.stack;

import java.util.Arrays;

/**
 * Beginner array-based stack reference.
 *
 * Stack rule:
 * Last In, First Out (LIFO)
 */
public class ArrayStack {
    // Internal array storage.
    private int[] data = new int[4];
    // size tells how many elements are currently in the stack.
    private int size;

    public void push(int value) {
        // Grow array if needed.
        ensureCapacity();
        // Place value at the next free position, then grow size.
        data[size++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Decrease size first so top element becomes the old last item.
        return data[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Top element is at size - 1.
        return data[size - 1];
    }

    public boolean isEmpty() {
        // Empty when size is zero.
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            // Double the array size when full.
            data = Arrays.copyOf(data, data.length * 2);
        }
    }
}
