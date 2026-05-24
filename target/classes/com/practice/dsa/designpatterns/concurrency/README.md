# Concurrency Patterns

Study order:
1. `XP1ProducerConsumerPattern`
2. `XP2ThreadPoolPattern`
3. `XP3ReadWriteLockPattern`
4. `XP4ImmutableObjectPattern`
5. `XP5GuardedSuspensionPattern`
6. `XP6FuturePromisePattern`

Use this folder when the main problem is safe work coordination between threads:
- producers and consumers moving data
- reusing worker threads
- allowing many readers with few writers
- avoiding shared mutable state
- waiting safely for state changes
- handling results that arrive later

When not to use these blindly:
- if the program is single-threaded, simpler code is usually better
- adding threads without a real concurrency need often increases bugs, not performance

## Best First Choices

- Start with `ImmutableObject`, `ProducerConsumer`, and `ThreadPool`.
- Learn `FuturePromise` once asynchronous result handling becomes necessary.
- Learn `ReadWriteLock` and `GuardedSuspension` only when simpler concurrency control is not enough.

## What To Compare Inside This Folder

- `ProducerConsumer` vs direct method calls: buffered decoupling vs synchronous processing.
- `ThreadPool` vs raw thread creation: managed worker reuse vs manual thread lifecycle.
- `ImmutableObject` vs locking: remove shared writes vs coordinate shared writes safely.
- `FuturePromise` vs blocking calls: defer results vs wait immediately.
- `ReadWriteLock` vs simple mutex: reader-heavy optimization vs simpler exclusive locking.

See the full reference in [../PATTERN_CATALOG.md](D:/Tutorials/InterviewPraparation/DSA/dsa-project/src/main/java/com/practice/dsa/designpatterns/PATTERN_CATALOG.md).
