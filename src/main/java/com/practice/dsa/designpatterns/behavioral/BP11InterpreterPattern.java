package com.practice.dsa.designpatterns.behavioral;

/**
 * Interpreter models a tiny language by representing grammar rules as objects.
 *
 * Use this when:
 * - the language is small and domain-specific
 * - grammar rules should be represented explicitly in code
 *
 * Expert note:
 * This pattern becomes hard to maintain for large languages.
 * Real parsers are better when grammar complexity grows.
 */
public class BP11InterpreterPattern {
    // Common interface for all grammar nodes.
    interface Expression {
        int interpret();
    }

    static class NumberExpression implements Expression {
        private final int value;

        NumberExpression(int value) {
            this.value = value;
        }

        public int interpret() {
            return value;
        }
    }

    static class AddExpression implements Expression {
        private final Expression left;
        private final Expression right;

        AddExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        public int interpret() {
            // Recursively interpret child expressions, then combine them.
            return left.interpret() + right.interpret();
        }
    }

    public static void main(String[] args) {
        // Expression tree for: 5 + 7
        Expression expression = new AddExpression(new NumberExpression(5), new NumberExpression(7));
        System.out.println("result = " + expression.interpret());
    }
}
