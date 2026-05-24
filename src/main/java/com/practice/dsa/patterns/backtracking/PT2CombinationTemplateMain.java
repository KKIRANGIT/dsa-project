package com.practice.dsa.patterns.backtracking;

public class PT2CombinationTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT2CombinationTemplate template = new PT2CombinationTemplate();
        // Print all 2-element combinations from 1..4.
        System.out.println(template.combine(4, 2));
    }
}
