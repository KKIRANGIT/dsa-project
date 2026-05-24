package com.practice.dsa.designpatterns.enterprise;

/**
 * Dependency Injection gives an object its dependencies from outside instead of making it create them itself.
 *
 * Use this when:
 * - dependencies should be replaceable
 * - testing should be easier
 * - object wiring should stay outside business logic
 */
public class EP3DependencyInjectionPattern {
    // Dependency contract.
    interface MessageSender {
        void send(String message);
    }

    static class ConsoleSender implements MessageSender {
        public void send(String message) {
            System.out.println(message);
        }
    }

    static class WelcomeService {
        private final MessageSender sender;

        WelcomeService(MessageSender sender) {
            // Dependency arrives from outside instead of being created internally.
            this.sender = sender;
        }

        void welcome(String user) {
            sender.send("Welcome, " + user);
        }
    }

    public static void main(String[] args) {
        // Wiring happens here.
        // Business class receives what it needs from the outside.
        WelcomeService service = new WelcomeService(new ConsoleSender());
        service.welcome("Alice");
    }
}
