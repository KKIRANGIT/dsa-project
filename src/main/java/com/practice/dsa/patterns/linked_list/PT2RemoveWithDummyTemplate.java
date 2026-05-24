package com.practice.dsa.patterns.linked_list;

import com.practice.dsa.common.ListNode;

/**
 * Beginner remove-with-dummy pattern.
 *
 * Use when deleting nodes and head-removal should be handled uniformly.
 */
public class PT2RemoveWithDummyTemplate {
    public ListNode removeValue(ListNode head, int target) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == target) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
