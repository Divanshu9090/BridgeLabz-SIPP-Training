package com.OOPD.compositionandaggregation;

public class Main {
	public static void main(String[] args) {
	// Create Faculty (can exist independently) 
	// aggregation
     Faculty drPrakash = new Faculty("Dr. Prakash", "F001");
     Faculty draks=new Faculty("Dr. Anubhav","A001");
     // Create University and Department
     University stateU = new University("State University");
     stateU.addDepartment("CS");
     stateU.addDepartment("CIVIL");

     // Add Faculty to University and Department
     stateU.addFaculty(drPrakash, "CS");
     stateU.addFaculty(draks, "CIVIL");

     // List Departments and Faculty
     stateU.listDepartments();

     // Demonstrate Composition: Deleting University
     stateU = null;
     System.gc(); // Suggest garbage collection (Departments are deleted)
     System.out.println("University deleted, Departments gone, but Faculty persists: " + drPrakash);

     // Faculty still exists (Aggregation)
 }
}
