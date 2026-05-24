# Enterprise Patterns

Study order:
1. `EP1RepositoryPattern`
2. `EP2SpecificationPattern`
3. `EP3DependencyInjectionPattern`
4. `EP4ServiceLocatorPattern`
5. `EP5UnitOfWorkPattern`
6. `EP6ModelViewControllerPattern`
7. `EP7CircuitBreakerPattern`
8. `EP8CQRSPattern`
9. `EP9SagaPattern`

Use this folder when the main problem is application structure:
- isolating persistence concerns
- expressing business rules cleanly
- managing dependencies
- coordinating transaction-like work
- separating model, presentation, and request-handling responsibilities
- protecting remote calls from repeated failure
- separating write models from read models when they evolve differently
- coordinating multi-step workflows with rollback behavior

When to be careful:
- too many enterprise abstractions can hide simple logic
- choose these patterns when the codebase is large enough to benefit from the separation

## Best First Choices

- Start with `DependencyInjection`, `Repository`, and `ModelViewController`.
- Learn `Specification` when query rules or business filters become combinable.
- Learn `UnitOfWork` when multiple persistence changes must commit consistently.
- Learn `CircuitBreaker` when remote-service failures must be contained.
- Learn `CQRS` and `Saga` when the system becomes distributed or read/write needs diverge strongly.
- Study `ServiceLocator` mainly to understand why dependency injection is usually preferred.

## What To Compare Inside This Folder

- `DependencyInjection` vs `ServiceLocator`: explicit dependency wiring vs hidden runtime lookup.
- `Repository` vs direct ORM or SQL access: domain-friendly persistence boundary vs simpler direct access.
- `Specification` vs ad hoc conditionals: composable rules vs repeated filtering logic.
- `UnitOfWork` vs immediate save calls: coordinated change tracking vs simpler per-call persistence.
- `MVC` vs mixed controller/view logic: separated UI responsibilities vs tightly coupled request handling.
- `CircuitBreaker` vs retry-only logic: fail fast after repeated errors vs keep hammering a broken dependency.
- `CQRS` vs traditional CRUD: separate read/write models vs one shared model for everything.
- `Saga` vs distributed transaction: compensating workflow steps vs one global atomic transaction.

See the full reference in [../PATTERN_CATALOG.md](D:/Tutorials/InterviewPraparation/DSA/dsa-project/src/main/java/com/practice/dsa/designpatterns/PATTERN_CATALOG.md).
