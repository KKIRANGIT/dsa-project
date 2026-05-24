package com.practice.dsa.problems.sliding_window.best_time_to_buy_and_sell_stock;

/**
 * LC 121 - Best Time to Buy and Sell Stock
 *
 * Beginner idea:
 * left  = best day to buy so far
 * right = current day to consider selling
 *
 * If we find a cheaper price, we move the buy day.
 * Otherwise we check the profit from buying at left and selling at right.
 */
public class LC121BestTimeToBuyAndSellStockSolver {
    public int maxProfit(int[] prices) {
        int left = 0;
        int best = 0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[right] < prices[left]) {
                // Found a cheaper buy day.
                left = right;
            } else {
                // Use the cheapest buy day seen so far with today's price.
                best = Math.max(best, prices[right] - prices[left]);
            }
        }

        return best;
    }
}
