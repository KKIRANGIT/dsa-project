package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.ListNode;

/**
 * Beginner linked list reversal reference.
 *
 * This is one of the most repeated linked-list operations in interviews.
 *
 * Pointer meaning:
 * - previous = head of the already reversed part
 * - current = node we are processing right now
 * - next = saved pointer so we do not lose the rest of the list
 */
public class ReverseLinkedListBasics {
    public ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            // Save the unreversed remainder before rewiring the current node.
            ListNode next = current.next;
            // Reverse the pointer direction for current node.
            current.next = previous;
            // Expand the reversed part by one node.
            previous = current;
            // Move forward into the unreversed remainder.
            current = next;
        }

        // previous becomes the new head after the loop finishes.
        return previous;
    }
}
