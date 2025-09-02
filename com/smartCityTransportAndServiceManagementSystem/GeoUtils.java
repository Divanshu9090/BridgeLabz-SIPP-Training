package com.smartCityTransportAndServiceManagementSystem;

public interface GeoUtils {
    static double calculateDistance(Location a, Location b) {
    	return Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
    }
}