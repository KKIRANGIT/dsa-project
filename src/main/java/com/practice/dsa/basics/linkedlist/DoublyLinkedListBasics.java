package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.DoublyListNode;

/**
 * Beginner doubly linked list reference.
 *
 * Each node stores:
 * - prev pointer
 * - next pointer
 *
 * That allows movement in both directions.
 */
public class DoublyLinkedListBasics {
    // First node in the list.
    private DoublyListNode head;
    // Last node in the list.
    private DoublyListNode tail;

    public void addLast(int value) {
        // Create new node.
        DoublyListNode node = new DoublyListNode(value);
        // Empty list case.
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        // Link current tail to new node.
        tail.next = node;
        node.prev = tail;
        // Move tail pointer to new last node.
        tail = node;
    }

    public void removeLast() {
        // Nothing to remove.
        if (tail == null) {
            return;
        }
        // Single-node case.
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        // Move tail backward.
        tail = tail.prev;
        // Break forward link from new tail.
        tail.next = null;
    }

    public String forward() {
        // Build printable output from head to tail.
        StringBuilder builder = new StringBuilder();
        DoublyListNode current = head;

        while (current != null) {
            builder.append(current.val);
            if (current.next != null) {
                builder.append(" <-> ");
            }
            current = current.next;
        }

        // Return final string.
        return builder.toString();
    }
}
