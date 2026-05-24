package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;
import com.practice.dsa.common.StructureBuilder;

public class ReverseLinkedListBasicsMain {
    public static void main(String[] args) {
        // Original list goes left to right.
        ListNode head = StructureBuilder.buildLinkedList(1, 2, 3, 4, 5);
        ReverseLinkedListBasics basics = new ReverseLinkedListBasics();

        System.out.println("before = " + LinkedListPrinter.stringify(head));
        // After reversal, all arrows point in the opposite direction.
        System.out.println("after  = " + LinkedListPrinter.stringify(basics.reverse(head)));
    }
}
