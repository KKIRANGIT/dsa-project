package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;

/**
 * Beginner singly linked list reference.
 *
 * Each node stores:
 * - a value
 * - a reference to the next node
 */
public class SinglyLinkedList {
    // head points to the first node of the list.
    private ListNode head;

    public void addLast(int value) {
        // Create new node to insert.
        ListNode node = new ListNode(value);
        // If list is empty, new node becomes head.
        if (head == null) {
            head = node;
            return;
        }

        // Walk to the last node.
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Attach new node at the end.
        current.next = node;
    }

    public void reverse() {
        // previous starts as null because new tail should point to null.
        ListNode previous = null;
        // current starts from the head.
        ListNode current = head;

        while (current != null) {
            // Save original next node before changing any links.
            ListNode next = current.next;
            // Reverse the current arrow.
            current.next = previous;
            // Move previous one step forward.
            previous = current;
            // Move current one step forward using saved next.
            current = next;
        }

        // previous becomes the new head after reversal.
        head = previous;
    }

    public ListNode head() {
        // Return first node.
        return head;
    }

    public String display() {
        // Convert list to printable string form.
        return LinkedListPrinter.stringify(head);
    }
}
