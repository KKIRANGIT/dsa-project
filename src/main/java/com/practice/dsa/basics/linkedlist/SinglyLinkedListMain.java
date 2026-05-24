package com.practice.dsa.basics.linkedlist;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        // Create list object.
        SinglyLinkedList list = new SinglyLinkedList();
        // Add a few values.
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Print list before reversing.
        System.out.println("before reverse = " + list.display());
        // Reverse the links.
        list.reverse();
        // Print list after reversing.
        System.out.println("after reverse  = " + list.display());
    }
}
