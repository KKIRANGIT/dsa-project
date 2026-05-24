package com.practice.dsa.patterns.linked_list;

import com.practice.dsa.common.ListNode;

/**
 * Beginner reverse-sublist pattern.
 *
 * Use for problems like reversing a range inside a linked list.
 */
public class PT3ReverseSublistTemplate {
    public ListNode reverseFirstK(ListNode head, int k) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null && k > 0) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            k--;
        }

        if (head != null) {
            head.next = current;
        }

        return previous;
    }
}
