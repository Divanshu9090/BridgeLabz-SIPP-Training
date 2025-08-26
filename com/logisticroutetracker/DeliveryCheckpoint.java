package com.logisticroutetracker;

public class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    public boolean isCritical() { return true; }
    public String getType() { return "Delivery"; }

    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2 : 0;
    }
}
