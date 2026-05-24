package com.practice.dsa.patterns.sliding_window;

public class PT2VariableWindowTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT2VariableWindowTemplate template = new PT2VariableWindowTemplate();
        // Print longest valid window length.
        System.out.println("best = " + template.longestOnesAfterFlippingAtMostKZeros(
                new int[]{1, 1, 0, 0, 1, 1, 1, 0}, 1));
    }
}
