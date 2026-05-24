# Behavioral Patterns

Study order:
1. `BP1StrategyPattern`
2. `BP2ObserverPattern`
3. `BP3CommandPattern`
4. `BP4StatePattern`
5. `BP5TemplateMethodPattern`
6. `BP6ChainOfResponsibilityPattern`
7. `BP7IteratorPattern`
8. `BP8MediatorPattern`
9. `BP9MementoPattern`
10. `BP10VisitorPattern`
11. `BP11InterpreterPattern`
12. `BP12PublishSubscribePattern`

Use this folder when the main problem is object collaboration and behavior flow:
- selecting algorithms
- broadcasting changes
- undoable actions
- state-driven behavior
- traversing or operating on object structures

Common tradeoffs:
- reduces giant conditional logic and tight coupling
- often improves extension ability
- may introduce many tiny classes if used without discipline

## Best First Choices

- Start with `Strategy`, `Observer`, `Command`, `State`, and `TemplateMethod`.
- Learn `ChainOfResponsibility` and `Mediator` when many objects are interacting indirectly.
- Learn `Iterator`, `Memento`, `Visitor`, and `Interpreter` after the higher-value patterns are comfortable.

## What To Compare Inside This Folder

- `Strategy` vs `State`: chosen algorithm vs object behavior changing with internal state.
- `Command` vs `Strategy`: encapsulated request/action vs interchangeable algorithm.
- `Observer` vs `PublishSubscribe`: direct subject-listener relationship vs topic-based event routing.
- `Observer` vs `Mediator`: broadcast notifications vs central coordination between peers.
- `TemplateMethod` vs `Strategy`: inheritance hook points vs composition-based behavior injection.
- `Visitor` vs direct methods: externalized operations on object structures vs changing the object model itself.

See the full reference in [../PATTERN_CATALOG.md](D:/Tutorials/InterviewPraparation/DSA/dsa-project/src/main/java/com/practice/dsa/designpatterns/PATTERN_CATALOG.md).
