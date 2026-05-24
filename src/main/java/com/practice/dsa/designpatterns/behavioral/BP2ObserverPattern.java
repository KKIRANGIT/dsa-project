package com.practice.dsa.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer broadcasts state changes from one subject to many listeners.
 *
 * Use this when:
 * - one change should notify multiple dependent objects
 * - the publisher should not know subscriber details
 */
public class BP2ObserverPattern {
    // Observer interface for all listeners.
    interface Subscriber {
        void update(String message);
    }

    static class EmailSubscriber implements Subscriber {
        public void update(String message) {
            System.out.println("Email subscriber got: " + message);
        }
    }

    static class Channel {
        private final List<Subscriber> subscribers = new ArrayList<>();

        void subscribe(Subscriber subscriber) {
            subscribers.add(subscriber);
        }

        void publish(String videoTitle) {
            // Notify every subscriber about the same event.
            for (Subscriber subscriber : subscribers) {
                subscriber.update("New upload: " + videoTitle);
            }
        }
    }

    public static void main(String[] args) {
        Channel channel = new Channel();
        channel.subscribe(new EmailSubscriber());
        channel.publish("System Design Basics");
    }
}
