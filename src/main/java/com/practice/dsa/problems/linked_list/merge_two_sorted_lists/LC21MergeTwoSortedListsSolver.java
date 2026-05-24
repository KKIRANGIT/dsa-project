package com.practice.dsa.problems.linked_list.merge_two_sorted_lists;

import com.practice.dsa.common.ListNode;

/**
 * LC 21 - Merge Two Sorted Lists
 *
 * Beginner idea:
 * Keep taking the smaller front node from the two lists.
 * A dummy node makes the code easier because the head handling
 * becomes uniform.
 */
public class LC21MergeTwoSortedListsSolver {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            // tail always points to the last node in the merged list.
            tail = tail.next;
        }

        // One list may still have leftover nodes.
        tail.next = list1 != null ? list1 : list2;
        return dummy.next;
    }
}
