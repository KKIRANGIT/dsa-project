package com.practice.dsa.problems.dp1.coin_change;

public class LC322CoinChangeMain {
    public static void main(String[] args) {
        // Print the minimum number of coins needed to make 11.
        System.out.println(new LC322CoinChangeSolver().coinChange(new int[]{1, 2, 5}, 11));
    }
}
