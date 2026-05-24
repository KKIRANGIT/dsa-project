package com.practice.dsa.basics.dp;

import java.util.Arrays;

public class CoinChangeBasicMain {
    public static void main(String[] args) {
        // Best way to make 11 here is 5 + 5 + 1, so answer is 3 coins.
        int[] coins = {1, 2, 5};
        CoinChangeBasic dp = new CoinChangeBasic();

        System.out.println("coins = " + Arrays.toString(coins));
        System.out.println("minimum coins for 11 = " + dp.minCoins(coins, 11));
    }
}
