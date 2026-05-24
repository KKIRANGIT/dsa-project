package com.practice.dsa.problems.linked_list.linked_list_cycle;

import com.practice.dsa.common.ListNode;

public class LC141LinkedListCycleMain {
    public static void main(String[] args) {
        // Create nodes manually.
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(0);
        ListNode four = new ListNode(-4);
        // Link them into a chain.
        one.next = two;
        two.next = three;
        three.next = four;
        // Create a cycle by pointing the last node back to node two.
        four.next = two;

        // Create solver object.
        LC141LinkedListCycleSolver solver = new LC141LinkedListCycleSolver();
        // Print whether a cycle exists.
        System.out.println(solver.hasCycle(one));
    }
}
