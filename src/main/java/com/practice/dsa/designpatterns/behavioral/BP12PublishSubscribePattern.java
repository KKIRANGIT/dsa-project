package com.practice.dsa.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Publish-Subscribe lets publishers emit events without knowing who is listening.
 *
 * Use this when:
 * - many independent listeners may react to the same event
 * - publishers should stay decoupled from concrete subscribers
 * - topic-based communication is clearer than direct callback wiring
 *
 * Beginner warning:
 * Pub-sub can make control flow harder to trace. Use clear event names and keep
 * side effects easy to follow.
 */
public class BP12PublishSubscribePattern {
    interface EventSubscriber {
        void onEvent(String message);
    }

    static class EmailSubscriber implements EventSubscriber {
        public void onEvent(String message) {
            System.out.println("Email subscriber received: " + message);
        }
    }

    static class AuditSubscriber implements EventSubscriber {
        public void onEvent(String message) {
            System.out.println("Audit subscriber recorded: " + message);
        }
    }

    static class EventBus {
        private final Map<String, List<EventSubscriber>> listenersByTopic = new HashMap<>();

        public void subscribe(String topic, EventSubscriber subscriber) {
            listenersByTopic.computeIfAbsent(topic, ignored -> new ArrayList<>()).add(subscriber);
        }

        public void publish(String topic, String message) {
            List<EventSubscriber> subscribers = listenersByTopic.getOrDefault(topic, List.of());
            for (EventSubscriber subscriber : subscribers) {
                subscriber.onEvent(message);
            }
        }
    }

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.subscribe("order-created", new EmailSubscriber());
        eventBus.subscribe("order-created", new AuditSubscriber());

        eventBus.publish("order-created", "Order #501 was created");
    }
}
