# Structural Patterns

Study order:
1. `SP1AdapterPattern`
2. `SP2BridgePattern`
3. `SP3CompositePattern`
4. `SP4DecoratorPattern`
5. `SP5FacadePattern`
6. `SP6FlyweightPattern`
7. `SP7ProxyPattern`
8. `SP8NullObjectPattern`

Use this folder when the main problem is class/object composition:
- making incompatible code work together
- splitting abstraction from implementation
- treating trees of objects uniformly
- adding behavior without rewriting the original class

Common tradeoffs:
- improves composition and reuse
- can add wrapper and indirection layers
- can become harder to trace if overused

## Best First Choices

- Start with `Adapter`, `Decorator`, `Facade`, and `Proxy`.
- Learn `Composite` once tree-shaped object models become common.
- Learn `Bridge` when abstraction and implementation are changing independently.
- Learn `Flyweight` and `NullObject` when memory pressure or null-handling starts to dominate design decisions.

## What To Compare Inside This Folder

- `Adapter` vs `Facade`: make old APIs fit a target interface vs simplify a subsystem interface.
- `Decorator` vs inheritance: dynamic layered behavior vs fixed compile-time extension.
- `Proxy` vs `Decorator`: access control/lazy/remote indirection vs feature extension.
- `Composite` vs plain nesting: treat leaf and group objects uniformly.
- `NullObject` vs `null` checks: polymorphic do-nothing behavior vs conditional absence handling.

See the full reference in [../PATTERN_CATALOG.md](D:/Tutorials/InterviewPraparation/DSA/dsa-project/src/main/java/com/practice/dsa/designpatterns/PATTERN_CATALOG.md).
