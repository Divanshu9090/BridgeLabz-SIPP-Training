package com.smartCityTransportAndServiceManagementSystem;

public class MetroService implements TransportService {
 private Schedule schedule;

 public MetroService(Schedule schedule) {
     this.schedule = schedule;
 }

 public String getServiceName() { 
	 return "Metro"; 
 }
 public Schedule getSchedule() { 
	 return schedule; 
 }
}