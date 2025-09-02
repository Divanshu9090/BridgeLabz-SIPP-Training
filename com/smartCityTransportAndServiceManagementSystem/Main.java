package com.smartCityTransportAndServiceManagementSystem;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService(new Schedule(LocalTime.of(9, 0), true)),
            new MetroService(new Schedule(LocalTime.of(8, 30), true)),
            new TaxiService(new Schedule(LocalTime.of(10, 15), false)),
            new AmbulanceService(new Schedule(LocalTime.of(9, 45), true))
        );

        // 1. Filter & Sort Available Services
        List<TransportService> sortedAvailable = services.stream()
            .filter(s -> s.getSchedule().isAvailable())
            .sorted(Comparator.comparing(s -> s.getSchedule().getDepartureTime()))
            .collect(Collectors.toList());

        System.out.println("🚦 Sorted Available Services:");
        sortedAvailable.forEach(TransportService::printServiceDetails);

        // 2. Dashboard Display
        System.out.println("\n📊 Live Dashboard:");
        services.forEach(TransportService::printServiceDetails);

        // 3. Revenue Reporting
        List<Trip> trips = Arrays.asList(
            new Trip("RouteA", 25.0, true),
            new Trip("RouteA", 30.0, false),
            new Trip("RouteB", 40.0, true),
            new Trip("RouteB", 35.0, false)
        );

        Map<String, List<Trip>> groupedByRoute = trips.stream()
            .collect(Collectors.groupingBy(Trip::getRoute));

        Map<Boolean, List<Trip>> partitionedByPeak = trips.stream()
            .collect(Collectors.partitioningBy(Trip::isPeakTime));

        DoubleSummaryStatistics fareStats = trips.stream()
            .collect(Collectors.summarizingDouble(Trip::getFare));

        System.out.println("\n💰 Revenue Summary:");
        System.out.println("Total Fare: " + fareStats.getSum());
        System.out.println("Average Fare: " + fareStats.getAverage());

        // 4. Emergency Detection
        System.out.println("\n🚨 Emergency Services:");
        services.stream()
            .filter(s -> s instanceof EmergencyService)
            .forEach(s -> System.out.println("Priority: " + s.getServiceName()));

        // 5. Fare Calculation using Lambda
        FareCalculator calculator = trip -> trip.getFare() * (trip.isPeakTime() ? 1.2 : 1.0);
        System.out.println("\n🧮 Fare Calculation:");
        trips.forEach(t -> System.out.println("Fare for " + t.getRoute() + ": " + calculator.calculateFare(t)));
    }
}