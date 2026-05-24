package com.practice.dsa.problems.dp1.coin_change;

import java.util.Arrays;

/**
 * LC 322 - Coin Change
 *
 * Beginner idea:
 * dp[value] = minimum coins needed to make that value.
 * For each amount, try every coin as the last coin used.
 */
public class LC322CoinChangeSolver {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int value = 1; value <= amount; value++) {
            for (int coin : coins) {
                if (coin <= value) {
                    dp[value] = Math.min(dp[value], 1 + dp[value - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
