package com.practice.dsa.designpatterns.behavioral;

/**
 * Mediator centralizes communication between objects.
 *
 * Use this when:
 * - many objects would otherwise reference each other directly
 * - object-to-object communication is getting tangled
 */
public class BP8MediatorPattern {
    // Mediator interface centralizes communication.
    interface ChatMediator {
        void send(String sender, String message);
    }

    static class TeamChatRoom implements ChatMediator {
        public void send(String sender, String message) {
            System.out.println(sender + " says: " + message);
        }
    }

    static class ChatUser {
        private final String name;
        private final ChatMediator mediator;

        ChatUser(String name, ChatMediator mediator) {
            this.name = name;
            this.mediator = mediator;
        }

        void send(String message) {
            // User talks through the mediator instead of knowing other users directly.
            mediator.send(name, message);
        }
    }

    public static void main(String[] args) {
        ChatMediator mediator = new TeamChatRoom();
        new ChatUser("Alice", mediator).send("Build passed");
        new ChatUser("Bob", mediator).send("Deploying now");
    }
}
