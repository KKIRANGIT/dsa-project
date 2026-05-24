package com.practice.dsa.patterns.two_pointers;

public class PT1OppositeTwoPointersTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1OppositeTwoPointersTemplate template = new PT1OppositeTwoPointersTemplate();
        // Print whether any pair sums to 9.
        System.out.println("hasPair = " + template.hasPairWithTarget(new int[]{1, 2, 4, 7, 11}, 9));
    }
}
