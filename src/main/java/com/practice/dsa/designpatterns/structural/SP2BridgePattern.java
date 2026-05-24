package com.practice.dsa.designpatterns.structural;

/**
 * Bridge splits abstraction from implementation so both can vary independently.
 *
 * Use this when:
 * - one dimension is "what the thing does"
 * - another dimension is "how it is implemented"
 * - inheritance combinations would explode
 */
public class SP2BridgePattern {
    // Implementation side of the bridge.
    interface Device {
        void turnOn();
        void turnOff();
    }

    static class Tv implements Device {
        public void turnOn() {
            System.out.println("TV on");
        }

        public void turnOff() {
            System.out.println("TV off");
        }
    }

    // Abstraction side of the bridge.
    static abstract class RemoteControl {
        protected final Device device;

        RemoteControl(Device device) {
            this.device = device;
        }

        abstract void togglePower();
    }

    static class BasicRemote extends RemoteControl {
        private boolean poweredOn;

        BasicRemote(Device device) {
            super(device);
        }

        void togglePower() {
            // Remote behavior is separated from the device implementation.
            if (poweredOn) {
                device.turnOff();
            } else {
                device.turnOn();
            }
            poweredOn = !poweredOn;
        }
    }

    public static void main(String[] args) {
        // One remote abstraction can work with one device implementation.
        RemoteControl remote = new BasicRemote(new Tv());
        remote.togglePower();
        remote.togglePower();
    }
}
