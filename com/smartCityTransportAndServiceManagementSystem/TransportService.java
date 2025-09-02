package com.smartCityTransportAndServiceManagementSystem;

public interface TransportService {
 String getServiceName();
 Schedule getSchedule();

 default void printServiceDetails() {
     System.out.println("Service: " + getServiceName() + ", Schedule: " + getSchedule());
 }
}