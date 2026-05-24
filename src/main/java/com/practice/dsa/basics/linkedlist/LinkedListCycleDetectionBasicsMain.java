package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.ListNode;

public class LinkedListCycleDetectionBasicsMain {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;

        System.out.println("has cycle = " + new LinkedListCycleDetectionBasics().hasCycle(one));
    }
}
