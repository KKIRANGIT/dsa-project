package com.practice.dsa.problems.sliding_window.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC121BestTimeToBuyAndSellStockSolverTest {
    @Test
    void computesMaximumProfit() {
        LC121BestTimeToBuyAndSellStockSolver solver = new LC121BestTimeToBuyAndSellStockSolver();

        assertEquals(5, solver.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solver.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
