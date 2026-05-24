package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.ListNode;
import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.StructureBuilder;

public class MiddleNodeBasicsMain {
    public static void main(String[] args) {
        // For odd length, the exact center node should be returned.
        ListNode head = StructureBuilder.buildLinkedList(1, 2, 3, 4, 5);
        ListNode middle = new MiddleNodeBasics().middleNode(head);

        System.out.println("list = " + LinkedListPrinter.stringify(head));
        System.out.println("middle value = " + middle.val);
    }
}
