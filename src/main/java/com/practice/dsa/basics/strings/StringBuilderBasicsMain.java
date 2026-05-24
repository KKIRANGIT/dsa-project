package com.practice.dsa.basics.strings;

public class StringBuilderBasicsMain {
    public static void main(String[] args) {
        StringBuilderBasics basics = new StringBuilderBasics();

        System.out.println("join = " + basics.joinWithComma(new String[]{"apple", "banana", "cherry"}));
        System.out.println("repeat = " + basics.repeatCharacter('*', 5));
    }
}
