package com.practice.dsa.basics.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner sieve reference.
 *
 * Marks non-prime values so prime lookups become fast.
 */
public class PrimeSieveBasics {
    public List<Integer> primesUpTo(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int value = 2; value <= limit; value++) {
            isPrime[value] = true;
        }

        for (int value = 2; value * value <= limit; value++) {
            if (!isPrime[value]) {
                continue;
            }

            for (int multiple = value * value; multiple <= limit; multiple += value) {
                isPrime[multiple] = false;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int value = 2; value <= limit; value++) {
            if (isPrime[value]) {
                primes.add(value);
            }
        }
        return primes;
    }
}
