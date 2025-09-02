package com.smartCityTransportAndServiceManagementSystem;

@FunctionalInterface
public interface FareCalculator {
 double calculateFare(Trip trip);
}