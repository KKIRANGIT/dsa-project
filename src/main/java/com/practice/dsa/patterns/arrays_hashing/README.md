# Arrays and Hashing Patterns

## What This Folder Covers

Use this folder when the problem is mainly about fast lookup, frequency counting, grouping, or prefix-style preprocessing.

## How To Identify This Topic

Pick this topic when you see signals like:

- duplicates or unique checks
- count frequencies of values or characters
- complement lookup such as `target - current`
- group data by a normalized key
- answer many range-sum style questions quickly

## Study Order

1. `PT1FrequencyMapTemplate`
2. `PT2IndexLookupTemplate`
3. `PT3PrefixSumPatternTemplate`
4. `PT4DifferenceArrayPatternTemplate`
5. `PT5GroupingByKeyTemplate`

## PT1 `PT1FrequencyMapTemplate`

- Solves: counting occurrences, duplicate checks, majority-style counting, character counting.
- Identify: the problem asks "how many times?", "seen before?", or "is there a duplicate?".
- Typical LeetCode problems: `Contains Duplicate`, `Valid Anagram`, `Top K Frequent Elements`, `Majority Element`.
- Reminder: when counts go up and down, map values to frequencies instead of rescanning the array.

## PT2 `PT2IndexLookupTemplate`

- Solves: complement lookup, first valid pair, map value to index for O(1) lookup.
- Identify: you need to find another element quickly while scanning once.
- Typical LeetCode problems: `Two Sum`, `Contains Nearby Duplicate`, `Max Number of K-Sum Pairs`.
- Reminder: decide whether you must store the current element before or after checking the map.

## PT3 `PT3PrefixSumPatternTemplate`

- Solves: range sums, subarray sums, cumulative totals, count of subarrays meeting a target.
- Identify: queries mention subarray `[l, r]`, sum between two indices, or repeated sum lookups.
- Typical LeetCode problems: `Range Sum Query - Immutable`, `Subarray Sum Equals K`, `Find Pivot Index`.
- Reminder: prefix sums trade O(n) preprocessing for O(1) range-sum retrieval.

## PT4 `PT4DifferenceArrayPatternTemplate`

- Solves: many range updates before one final reconstruction.
- Identify: the input gives multiple operations like "add x to all values from l to r".
- Typical LeetCode problems: `Range Addition`, `Corporate Flight Bookings`, `Shifting Letters II`.
- Reminder: update only the boundaries first, then rebuild the final array once.

## PT5 `PT5GroupingByKeyTemplate`

- Solves: grouping items that become equal after transformation or normalization.
- Identify: the problem says different raw inputs belong to the same class after sorting, counting, or encoding.
- Typical LeetCode problems: `Group Anagrams`, `Group Shifted Strings`, `Find Duplicate File in System`.
- Reminder: the choice of key is the whole pattern. If the key is good, grouping becomes easy.