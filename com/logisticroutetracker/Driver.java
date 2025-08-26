package com.logisticroutetracker;

public class Driver {
    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void addCheckpoint(Checkpoint cp) {
        routeHistory.addCheckpoint(cp);
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        System.out.printf("Total Distance: %.1f km\n", totalDistance);
        System.out.printf("Total Penalty: %.1f\n", totalPenalty);
        System.out.printf("Route Score: %.1f\n", totalDistance - totalPenalty);
        System.out.println("Critical Route Check: " +
            (routeHistory.checkCriticalConsistency() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }

    public RouteLinkedList<Checkpoint> getRouteHistory() {
        return routeHistory;
    }
}