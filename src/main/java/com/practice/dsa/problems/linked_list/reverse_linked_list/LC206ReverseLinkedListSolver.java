package com.practice.dsa.problems.linked_list.reverse_linked_list;

import com.practice.dsa.common.ListNode;

/**
 * LC 206 - Reverse Linked List
 *
 * Beginner idea:
 * Reverse one arrow at a time.
 *
 * previous <- current -> next
 *
 * Save next first, then reverse the arrow,
 * then move the pointers forward.
 */
public class LC206ReverseLinkedListSolver {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            // Save the original next node before changing current.next.
            ListNode next = current.next;
            // Reverse the arrow.
            current.next = previous;
            // Move previous and current one step forward.
            previous = current;
            current = next;
        }

        // previous becomes the new head.
        return previous;
    }
}
