package com.smartCityTransportAndServiceManagementSystem;

public class TaxiService implements TransportService {
 private Schedule schedule;

 public TaxiService(Schedule schedule) {
     this.schedule = schedule;
 }

 public String getServiceName() { 
	 return "Taxi"; 
 }
 public Schedule getSchedule() { 
	 return schedule; 
 }
}
