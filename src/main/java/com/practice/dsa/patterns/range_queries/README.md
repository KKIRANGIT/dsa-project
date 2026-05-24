# Range Query Patterns

## What This Folder Covers

Use this folder when the problem repeatedly asks questions over ranges and sometimes also updates values.

## How To Identify This Topic

Pick this topic when you see signals like:

- many queries over `[l, r]`
- online updates plus queries
- range sum, min, max, xor, or count
- point updates are too many for recomputation

## Study Order

1. `PT1FenwickTreeTemplate`
2. `PT2SegmentTreeTemplate`
3. `PT3LazySegmentTreeTemplate`
4. `PT4SparseTableTemplate`

## PT1 `PT1FenwickTreeTemplate`

- Solves: point update plus prefix/range sum queries.
- Identify: updates affect one index at a time and queries are additive.
- Typical LeetCode problems: `Range Sum Query - Mutable`, inversion-count helper tasks, prefix-frequency tasks.
- Reminder: Fenwick tree is simpler than a segment tree when sums are enough.

## PT2 `PT2SegmentTreeTemplate`

- Solves: flexible range queries with point updates.
- Identify: you need a reusable tree over ranges and the combine operation is associative.
- Typical LeetCode problems: mutable range sum/min/max tasks, advanced query systems.
- Reminder: segment trees are general-purpose but more complex than Fenwick trees.

## PT3 `PT3LazySegmentTreeTemplate`

- Solves: range updates plus range queries efficiently.
- Identify: updates affect large intervals often, so pushing updates to each element is too slow.
- Typical LeetCode problems: interval add/query tasks, advanced range-query interview problems.
- Reminder: store delayed updates and push them only when needed.

## PT4 `PT4SparseTableTemplate`

- Solves: static range minimum/maximum/gcd queries with no updates.
- Identify: the data is fixed after preprocessing and many queries follow.
- Typical LeetCode problems: static RMQ helpers, immutable range-query tasks.
- Reminder: sparse table is fast for immutable data but does not support updates.