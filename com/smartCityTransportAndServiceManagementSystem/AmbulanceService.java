package com.smartCityTransportAndServiceManagementSystem;

public class AmbulanceService implements TransportService, EmergencyService {
 private Schedule schedule;

 public AmbulanceService(Schedule schedule) {
     this.schedule = schedule;
 }

 public String getServiceName() { 
	 return "Ambulance"; 
 }
 public Schedule getSchedule() { 
	 return schedule; 
 }
}