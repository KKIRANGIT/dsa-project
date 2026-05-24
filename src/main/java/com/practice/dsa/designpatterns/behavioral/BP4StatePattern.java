package com.practice.dsa.designpatterns.behavioral;

/**
 * State moves state-dependent behavior into separate classes.
 *
 * Use this when:
 * - object behavior changes based on internal state
 * - state-related if/else logic is growing hard to maintain
 */
public class BP4StatePattern {
    // State interface:
    // every state decides how to move to the next state.
    interface TrafficLightState {
        void next(TrafficLightContext context);
        String name();
    }

    static class RedState implements TrafficLightState {
        public void next(TrafficLightContext context) {
            context.setState(new GreenState());
        }

        public String name() {
            return "RED";
        }
    }

    static class GreenState implements TrafficLightState {
        public void next(TrafficLightContext context) {
            context.setState(new YellowState());
        }

        public String name() {
            return "GREEN";
        }
    }

    static class YellowState implements TrafficLightState {
        public void next(TrafficLightContext context) {
            context.setState(new RedState());
        }

        public String name() {
            return "YELLOW";
        }
    }

    static class TrafficLightContext {
        private TrafficLightState state = new RedState();

        void setState(TrafficLightState state) {
            this.state = state;
        }

        void next() {
            // Delegate state-dependent behavior to the current state object.
            state.next(this);
        }

        String currentState() {
            return state.name();
        }
    }

    public static void main(String[] args) {
        TrafficLightContext light = new TrafficLightContext();
        System.out.println(light.currentState());
        light.next();
        System.out.println(light.currentState());
        light.next();
        System.out.println(light.currentState());
    }
}
