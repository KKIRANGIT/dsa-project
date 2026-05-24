package com.practice.dsa.patterns.tries;

public class PT2PrefixReplacementTemplateMain {
    public static void main(String[] args) {
        PT2PrefixReplacementTemplate template = new PT2PrefixReplacementTemplate();
        System.out.println(template.chooseMatchingRoot(new String[]{"cat", "bat", "rat"}, "cattle"));
    }
}
