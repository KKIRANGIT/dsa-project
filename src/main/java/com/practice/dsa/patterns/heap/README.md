# Heap Patterns

## What This Folder Covers

Use this folder when the solution repeatedly needs the current best, smallest, or largest candidate.

## How To Identify This Topic

Pick this topic when you see signals like:

- top `k`
- streaming median
- choose next item by smallest end time or greatest priority
- keep a rolling set of best candidates

## Study Order

1. `PT1TopKTemplate`
2. `PT2TwoHeapsMedianTemplate`
3. `PT3IntervalMinHeapTemplate`

## PT1 `PT1TopKTemplate`

- Solves: top-k frequent, closest points, keep the best k items seen so far.
- Identify: you only need the best few elements, not a full sort of everything.
- Typical LeetCode problems: `Top K Frequent Elements`, `K Closest Points to Origin`, `Find K Largest Numbers` style tasks.
- Reminder: a heap gives partial order faster than sorting the full input each time.

## PT2 `PT2TwoHeapsMedianTemplate`

- Solves: running median and balanced lower-half / upper-half maintenance.
- Identify: values arrive over time and median is requested repeatedly.
- Typical LeetCode problems: `Find Median from Data Stream`, `Sliding Window Median`.
- Reminder: keep the two heaps balanced in size and ordered across the split.

## PT3 `PT3IntervalMinHeapTemplate`

- Solves: interval scheduling and meeting-room style problems ordered by earliest finish.
- Identify: you need the currently smallest end time among active intervals.
- Typical LeetCode problems: `Meeting Rooms II`, `Employee Free Time`, `Merge K Sorted Lists` heap mindset.
- Reminder: the heap usually stores only active candidates that still matter.