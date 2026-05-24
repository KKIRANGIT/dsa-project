package com.practice.dsa.problems.dp2.coin_change_ii;

/**
 * LC 518 - Coin Change II
 *
 * Beginner idea:
 * dp[amount] means how many combinations can build that amount.
 * Process one coin at a time so combinations are not counted in different orders.
 */
public class LC518CoinChangeIISolver {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int currentAmount = coin; currentAmount <= amount; currentAmount++) {
                dp[currentAmount] += dp[currentAmount - coin];
            }
        }

        return dp[amount];
    }
}
