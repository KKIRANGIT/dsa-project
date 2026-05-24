package com.practice.dsa.patterns.strings;

/**
 * Beginner rolling-hash pattern.
 *
 * Use this when many substring comparisons are needed.
 */
public class PT3RollingHashTemplate {
    private static final long BASE = 31;
    private static final long MOD = 1_000_000_007L;

    public long[] buildPrefixHash(String text) {
        long[] prefix = new long[text.length() + 1];

        for (int i = 0; i < text.length(); i++) {
            prefix[i + 1] = (prefix[i] * BASE + text.charAt(i)) % MOD;
        }

        return prefix;
    }

    public long[] buildPowers(int n) {
        long[] powers = new long[n + 1];
        powers[0] = 1;

        for (int i = 1; i <= n; i++) {
            powers[i] = (powers[i - 1] * BASE) % MOD;
        }

        return powers;
    }

    public long substringHash(long[] prefix, long[] powers, int left, int rightExclusive) {
        long raw = prefix[rightExclusive] - (prefix[left] * powers[rightExclusive - left]) % MOD;
        return (raw + MOD) % MOD;
    }
}
