package com.practice.dsa.problems.linked_list.merge_two_sorted_lists;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;

public class LC21MergeTwoSortedListsMain {
    public static void main(String[] args) {
        // Build first sorted list.
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // Build second sorted list.
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        // Create solver object.
        LC21MergeTwoSortedListsSolver solver = new LC21MergeTwoSortedListsSolver();
        // Merge the two lists and print the result.
        System.out.println(LinkedListPrinter.stringify(solver.mergeTwoLists(list1, list2)));
    }
}
