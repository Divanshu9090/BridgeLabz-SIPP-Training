package com.smartCityTransportAndServiceManagementSystem;

public class Passenger {
 private String name;
 private String route;

 public Passenger(String name, String route) {
     this.name = name;
     this.route = route;
 }
 
 public String getName() {
	 return this.name;
 }

 public String getRoute() { 
	 return this.route; 
 }
}