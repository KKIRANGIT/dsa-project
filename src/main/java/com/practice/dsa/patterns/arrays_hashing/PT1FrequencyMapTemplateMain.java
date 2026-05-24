package com.practice.dsa.patterns.arrays_hashing;

public class PT1FrequencyMapTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1FrequencyMapTemplate template = new PT1FrequencyMapTemplate();
        // Build frequency table for sample string.
        System.out.println(template.buildFrequency("banana"));
    }
}
