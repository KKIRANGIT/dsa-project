package com.practice.dsa.patterns.backtracking;

public class PT3PermutationTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT3PermutationTemplate template = new PT3PermutationTemplate();
        // Print all permutations.
        System.out.println(template.permute(new int[]{1, 2, 3}));
    }
}
