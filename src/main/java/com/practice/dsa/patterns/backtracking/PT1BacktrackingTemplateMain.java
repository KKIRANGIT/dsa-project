package com.practice.dsa.patterns.backtracking;

public class PT1BacktrackingTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1BacktrackingTemplate template = new PT1BacktrackingTemplate();
        // Print all binary strings of length 3.
        System.out.println(template.generateBinaryStrings(3));
    }
}
