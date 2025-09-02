package com.smartCityTransportAndServiceManagementSystem;

import java.time.LocalTime;

public class Schedule {
 private LocalTime departureTime;
 private boolean available;

 public Schedule(LocalTime departureTime, boolean available) {
     this.departureTime = departureTime;
     this.available = available;
 }

 public LocalTime getDepartureTime() { return departureTime; }
 public boolean isAvailable() { return available; }

 @Override
 public String toString() {
     return "Departure: " + departureTime + ", Available: " + available;
 }
}