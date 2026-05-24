package com.practice.dsa.patterns.math_geometry;

/**
 * Beginner matrix-exponentiation pattern.
 *
 * Use when a recurrence can be represented as matrix multiplication.
 */
public class PT5MatrixExponentiationTemplate {
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long[][] base = {
                {1, 1},
                {1, 0}
        };

        long[][] result = power(base, n - 1);
        return result[0][0];
    }

    private long[][] power(long[][] matrix, int exponent) {
        long[][] result = {
                {1, 0},
                {0, 1}
        };

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = multiply(result, matrix);
            }
            matrix = multiply(matrix, matrix);
            exponent >>= 1;
        }

        return result;
    }

    private long[][] multiply(long[][] a, long[][] b) {
        long[][] product = new long[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return product;
    }
}
