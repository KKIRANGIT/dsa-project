package com.practice.dsa.patterns.dp;

public class PT10GameDpMinimaxTemplateMain {
    public static void main(String[] args) {
        PT10GameDpMinimaxTemplate template = new PT10GameDpMinimaxTemplate();
        System.out.println(template.firstPlayerWins(new int[]{1, 5, 2}));
        System.out.println(template.firstPlayerWins(new int[]{1, 5, 233, 7}));
    }
}
