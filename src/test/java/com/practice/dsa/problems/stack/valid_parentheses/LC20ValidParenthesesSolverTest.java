package com.practice.dsa.problems.stack.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LC20ValidParenthesesSolverTest {
    @Test
    void validatesBracketSequence() {
        LC20ValidParenthesesSolver solver = new LC20ValidParenthesesSolver();

        assertTrue(solver.isValid("()[]{}"));
        assertFalse(solver.isValid("(]"));
    }
}
