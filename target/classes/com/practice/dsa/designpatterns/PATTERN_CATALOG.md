# Pattern Catalog

Use this file as the quick comparison guide for the full `designpatterns` collection.

For each pattern, ask:

1. What pressure is pushing me toward this pattern?
2. Is there a simpler design that solves the same problem?
3. Will this pattern improve changeability enough to justify the extra abstraction?

## Creational

### `CP7SimpleFactoryPattern`

- Use when: one place should translate a small input or type into a concrete object.
- Avoid when: the creation rules keep growing and subclass extension is the real need.
- Nearby alternatives: direct constructors, `FactoryMethod`, `AbstractFactory`.
- Common Java examples: parser or client creation chosen by config value.

### `CP1SingletonPattern`

- Use when: exactly one shared coordinator is truly required and lifecycle is global.
- Avoid when: it only saves typing and really behaves like hidden global mutable state.
- Nearby alternatives: dependency injection, static utility methods, normal object lifetime management.
- Common Java examples: configuration registry, logging facade, process-wide cache coordinator.

### `CP2FactoryMethodPattern`

- Use when: subclasses should choose which concrete product gets created.
- Avoid when: a simple centralized factory is enough and subclassing adds no real value.
- Nearby alternatives: `SimpleFactory`, `AbstractFactory`, direct constructors.
- Common Java examples: framework hooks that let subclasses create specialized handlers.

### `CP3AbstractFactoryPattern`

- Use when: related families of objects must stay compatible with each other.
- Avoid when: only one product type is varying or product families are not a real concern.
- Nearby alternatives: `FactoryMethod`, `Builder`, dependency injection configuration.
- Common Java examples: themed UI widgets, environment-specific service families.

### `CP4BuilderPattern`

- Use when: object construction has many optional fields or should happen in clear steps.
- Avoid when: the object is tiny and a constructor is already readable.
- Nearby alternatives: telescoping constructors, static factory methods, parameter objects.
- Common Java examples: immutable DTOs, HTTP request objects, configuration objects.

### `CP5PrototypePattern`

- Use when: cloning a configured object is easier than rebuilding it from scratch.
- Avoid when: clone behavior is confusing, deep-copy needs are dangerous, or construction is cheap.
- Nearby alternatives: factories, copy constructors, builders.
- Common Java examples: template-based document or shape duplication.

### `CP6ObjectPoolPattern`

- Use when: objects are expensive to create and can be safely reset and reused.
- Avoid when: allocation is cheap or stale pooled state can leak between users.
- Nearby alternatives: normal allocation, connection pool libraries, resource caching.
- Common Java examples: DB connections, thread pools, large reusable buffers.

## Structural

### `SP1AdapterPattern`

- Use when: an existing class has the wrong interface for your client code.
- Avoid when: you control both sides and can change the interface directly.
- Nearby alternatives: `Facade`, wrapper utility methods, direct refactor.
- Common Java examples: adapting third-party APIs to internal service interfaces.

### `SP2BridgePattern`

- Use when: abstraction and implementation vary independently and should not explode into subclasses.
- Avoid when: the hierarchy is small and unlikely to grow in two dimensions.
- Nearby alternatives: plain composition, `Strategy`, inheritance.
- Common Java examples: shape plus renderer, notification type plus delivery channel.

### `SP3CompositePattern`

- Use when: leaf objects and groups of objects should be treated uniformly.
- Avoid when: tree operations on groups differ too much from leaf behavior.
- Nearby alternatives: direct tree structures without uniform interface, visitor logic.
- Common Java examples: file systems, UI component trees, menu hierarchies.

### `SP4DecoratorPattern`

- Use when: behavior should be layered dynamically around an object.
- Avoid when: the number of wrappers makes debugging or object creation unreadable.
- Nearby alternatives: inheritance, `Proxy`, aspect-oriented tools.
- Common Java examples: Java I/O streams, caching/logging/compression wrappers.

### `SP5FacadePattern`

- Use when: a subsystem is noisy and clients need a simpler entry point.
- Avoid when: the facade becomes a god-object that hides too many unrelated workflows.
- Nearby alternatives: application services, adapter layers, helper utilities.
- Common Java examples: service orchestration layer around several lower-level APIs.

### `SP6FlyweightPattern`

- Use when: many similar objects repeat the same intrinsic state and memory matters.
- Avoid when: memory pressure is low or separating shared vs external state becomes confusing.
- Nearby alternatives: caching, immutable shared value objects, object pooling.
- Common Java examples: character glyphs, tiles, repeated metadata objects.

### `SP7ProxyPattern`

- Use when: access should be controlled, deferred, remote, or instrumented before touching the real object.
- Avoid when: the extra forwarding layer adds latency or indirection with little benefit.
- Nearby alternatives: `Decorator`, `Facade`, direct service calls.
- Common Java examples: lazy-loading ORM proxies, security proxies, remote clients.

### `SP8NullObjectPattern`

- Use when: callers need a safe do-nothing implementation instead of repeated `null` checks.
- Avoid when: the absence of behavior should be explicit and silently doing nothing would hide bugs.
- Nearby alternatives: `Optional`, guard clauses, default strategy objects.
- Common Java examples: no-op logger, no-op notifier, guest permission object.

## Behavioral

### `BP1StrategyPattern`

- Use when: multiple algorithms share one contract and should be swappable.
- Avoid when: there are only one or two branches and a simple conditional is still clearer.
- Nearby alternatives: `State`, higher-order functions, `TemplateMethod`.
- Common Java examples: payment methods, sorting/compression/validation strategies.

### `BP2ObserverPattern`

- Use when: many listeners should react to a subject change.
- Avoid when: the notification graph becomes hard to reason about or order matters too much.
- Nearby alternatives: events/pub-sub, `Mediator`, direct callbacks.
- Common Java examples: UI listeners, domain events, property change listeners.

### `BP3CommandPattern`

- Use when: requests should be packaged as objects for queues, undo, logging, or scheduling.
- Avoid when: action objects add ceremony without any need for delayed or stored execution.
- Nearby alternatives: direct method calls, `Strategy`, lambdas.
- Common Java examples: menu actions, job queues, undoable editor operations.

### `BP4StatePattern`

- Use when: object behavior changes substantially based on internal state.
- Avoid when: the state machine is tiny and conditionals are still clearer.
- Nearby alternatives: `Strategy`, enums with behavior, transition tables.
- Common Java examples: order lifecycle, media player state, connection state.

### `BP5TemplateMethodPattern`

- Use when: an algorithm skeleton is stable but a few steps vary by subclass.
- Avoid when: inheritance is already becoming rigid or the variation points keep growing.
- Nearby alternatives: `Strategy`, hooks via composition, callbacks.
- Common Java examples: framework base classes, parser pipelines, test templates.

### `BP6ChainOfResponsibilityPattern`

- Use when: several handlers may process or pass along a request.
- Avoid when: the flow must be explicit and hidden handoff order would be dangerous.
- Nearby alternatives: pipelines, rule engines, plain ordered method calls.
- Common Java examples: servlet filters, validation chains, middleware pipelines.

### `BP7IteratorPattern`

- Use when: traversal logic should be separated from collection internals.
- Avoid when: language-native iteration already solves the need cleanly.
- Nearby alternatives: enhanced for-loops, streams, direct indexing.
- Common Java examples: Java collections iterators, custom tree traversers.

### `BP8MediatorPattern`

- Use when: many peer objects communicate too directly and form a dense dependency web.
- Avoid when: the mediator becomes a giant central brain with too much knowledge.
- Nearby alternatives: `Observer`, event bus, direct service coordination.
- Common Java examples: dialog coordination, chat room routing, workflow orchestration.

### `BP9MementoPattern`

- Use when: object state snapshots must be stored and restored later.
- Avoid when: snapshots are large, frequent, or expose too much internal data.
- Nearby alternatives: event sourcing, copy constructors, command-based undo.
- Common Java examples: editor undo history, game save points.

### `BP10VisitorPattern`

- Use when: many operations must run over a stable object structure.
- Avoid when: the object structure changes often because every visitor must then change too.
- Nearby alternatives: direct methods on elements, pattern matching, external utilities.
- Common Java examples: compilers, AST processing, report generation over object trees.

### `BP11InterpreterPattern`

- Use when: a tiny grammar or expression language needs a direct object-model interpreter.
- Avoid when: the grammar is large and a parser generator or dedicated engine is more realistic.
- Nearby alternatives: expression evaluators, rule engines, parser libraries.
- Common Java examples: mini filter language, arithmetic expression evaluation.

### `BP12PublishSubscribePattern`

- Use when: publishers should emit events without knowing which subscribers will consume them.
- Avoid when: the event flow must remain explicit and debugging hidden listeners would be too costly.
- Nearby alternatives: `Observer`, `Mediator`, direct callbacks, event bus frameworks.
- Common Java examples: domain-event dispatch, notification topics, audit/event streaming hooks.

## Concurrency

### `XP1ProducerConsumerPattern`

- Use when: producers and consumers should be decoupled by a shared buffer or queue.
- Avoid when: the workload is tiny and thread coordination overhead dominates.
- Nearby alternatives: direct calls, reactive streams, actor-style message passing.
- Common Java examples: blocking queues, work pipelines, logging buffers.

### `XP2ThreadPoolPattern`

- Use when: many short-lived tasks need managed worker reuse.
- Avoid when: tasks block unpredictably and the pool is tuned badly or unnecessary.
- Nearby alternatives: raw threads, virtual threads, event loops.
- Common Java examples: `ExecutorService`, server request handling, async task execution.

### `XP3ReadWriteLockPattern`

- Use when: reads are frequent, writes are rare, and concurrent reads help throughput.
- Avoid when: write contention is high or simpler exclusive locking is sufficient.
- Nearby alternatives: synchronized mutex, immutable snapshots, concurrent collections.
- Common Java examples: shared caches, configuration registries.

### `XP4ImmutableObjectPattern`

- Use when: thread safety should come from removing mutation entirely.
- Avoid when: objects are extremely large and constant copying becomes too expensive.
- Nearby alternatives: defensive copying, locks, actor isolation.
- Common Java examples: value objects, money/date types, shared config records.

### `XP5GuardedSuspensionPattern`

- Use when: a thread should wait until a condition becomes true before continuing.
- Avoid when: async non-blocking flow is cleaner than blocked waiting.
- Nearby alternatives: futures, latches, conditions, callbacks.
- Common Java examples: wait-until-data-arrives queues, response handoff objects.

### `XP6FuturePromisePattern`

- Use when: work finishes later and callers should hold a placeholder for the result.
- Avoid when: forced blocking happens immediately and the async abstraction gives no real benefit.
- Nearby alternatives: callbacks, reactive streams, direct blocking calls.
- Common Java examples: `CompletableFuture`, async HTTP/database tasks.

## Enterprise

### `EP1RepositoryPattern`

- Use when: domain logic should not care about raw persistence details.
- Avoid when: the repository becomes a fake abstraction that only mirrors ORM calls mechanically.
- Nearby alternatives: direct ORM usage, DAO, query services.
- Common Java examples: Spring Data repositories, aggregate persistence boundaries.

### `EP2SpecificationPattern`

- Use when: business rules or query filters must be composed and reused.
- Avoid when: the rule set is tiny and specifications add more ceremony than clarity.
- Nearby alternatives: predicates, query builders, plain conditional methods.
- Common Java examples: reusable search filters, eligibility checks.

### `EP3DependencyInjectionPattern`

- Use when: object creation and dependency wiring should be externalized.
- Avoid when: the project is tiny and framework-style injection would hide more than it helps.
- Nearby alternatives: manual composition root, factories, `ServiceLocator`.
- Common Java examples: Spring beans, constructor injection, test doubles.

### `EP4ServiceLocatorPattern`

- Use when: legacy code or plugin systems need runtime lookup of services.
- Avoid when: dependencies should be explicit and testable, which is most modern application code.
- Nearby alternatives: dependency injection, factories, explicit parameters.
- Common Java examples: legacy registries, framework service registries.

### `EP5UnitOfWorkPattern`

- Use when: several changes should be tracked and committed as one logical persistence unit.
- Avoid when: the persistence layer already manages this clearly and another abstraction adds duplication.
- Nearby alternatives: transaction scripts, ORM session tracking, explicit transaction services.
- Common Java examples: ORM session flush/commit boundaries, aggregate save batches.

### `EP6ModelViewControllerPattern`

- Use when: input handling, business state, and presentation should stay separated.
- Avoid when: the application is too small for the layers or the framework already imposes a different model.
- Nearby alternatives: MVVM, MVP, layered controllers without full MVC terminology.
- Common Java examples: Spring MVC, server-rendered web apps, desktop UI apps.

### `EP7CircuitBreakerPattern`

- Use when: repeated remote failures should trigger fast rejection instead of endless retries.
- Avoid when: the dependency is local and cheap or the failure pattern does not justify the extra state logic.
- Nearby alternatives: retry, timeout, bulkhead, fallback policies.
- Common Java examples: payment gateway clients, partner API calls, microservice HTTP clients.

### `EP8CQRSPattern`

- Use when: read and write workflows have different scaling, models, or complexity needs.
- Avoid when: CRUD is simple and splitting read/write models would only duplicate logic.
- Nearby alternatives: layered CRUD services, repository plus projection methods, event sourcing.
- Common Java examples: dashboards optimized for reads while commands enforce strict business rules.

### `EP9SagaPattern`

- Use when: a business workflow spans multiple services and needs compensating actions on failure.
- Avoid when: a normal local transaction is enough or compensation rules would be too fragile.
- Nearby alternatives: distributed transactions, orchestration workflows, outbox/event-driven coordination.
- Common Java examples: order placement across inventory, payment, and shipping services.
