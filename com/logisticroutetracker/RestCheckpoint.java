package com.logisticroutetracker;

public class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    public boolean isCritical() { return false; }
    public String getType() { return "Rest"; }

    public double calculatePenalty() {
        return isDelayed() && (actualDuration - expectedDuration) > 30
            ? (actualDuration - expectedDuration) * 0.5 : 0;
    }
}
