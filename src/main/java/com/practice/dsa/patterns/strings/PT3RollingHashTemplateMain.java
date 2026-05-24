package com.practice.dsa.patterns.strings;

public class PT3RollingHashTemplateMain {
    public static void main(String[] args) {
        PT3RollingHashTemplate template = new PT3RollingHashTemplate();
        String text = "banana";
        long[] prefix = template.buildPrefixHash(text);
        long[] powers = template.buildPowers(text.length());

        System.out.println(template.substringHash(prefix, powers, 1, 4));
        System.out.println(template.substringHash(prefix, powers, 3, 6));
    }
}
