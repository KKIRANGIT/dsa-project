package com.practice.dsa.patterns.strings;

public class PT1KmpStringMatchingTemplateMain {
    public static void main(String[] args) {
        PT1KmpStringMatchingTemplate template = new PT1KmpStringMatchingTemplate();
        System.out.println(template.indexOf("abxabcabcaby", "abcaby"));
    }
}
