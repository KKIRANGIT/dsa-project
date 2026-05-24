package com.practice.dsa.problems.linked_list;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;
import com.practice.dsa.problems.linked_list.linked_list_cycle.LC141LinkedListCycleSolver;
import com.practice.dsa.problems.linked_list.merge_two_sorted_lists.LC21MergeTwoSortedListsSolver;
import com.practice.dsa.problems.linked_list.reverse_linked_list.LC206ReverseLinkedListSolver;

/**
 * Beginner topic runner for Linked List problems.
 */
public class LinkedListProblemsMain {
    public static void main(String[] args) {
        // Build a sample list for reverse operation.
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        // Run reverse-linked-list sample.
        System.out.println("LC206 = " + LinkedListPrinter.stringify(new LC206ReverseLinkedListSolver().reverseList(head)));

        // Build two sorted lists.
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        // Run merge-two-sorted-lists sample.
        System.out.println("LC21  = " + LinkedListPrinter.stringify(new LC21MergeTwoSortedListsSolver().mergeTwoLists(list1, list2)));

        // Build a tiny cycle list.
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;
        two.next = one;
        // Run linked-list-cycle sample.
        System.out.println("LC141 = " + new LC141LinkedListCycleSolver().hasCycle(one));
    }
}
