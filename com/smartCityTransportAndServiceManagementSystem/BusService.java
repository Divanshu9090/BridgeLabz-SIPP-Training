package com.smartCityTransportAndServiceManagementSystem;

public class BusService implements TransportService {
 private Schedule schedule;

 public BusService(Schedule schedule) {
     this.schedule = schedule;
 }

 public String getServiceName() { 
	 return "Bus"; 
 }
 public Schedule getSchedule() { 
	 return schedule; 
 }
}
