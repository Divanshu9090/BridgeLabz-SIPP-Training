package com.OOPD.associationandcommunication;

public class Main {
	public static void main(String[] args) {
        // Create Hospital
        Hospital cityHospital = new Hospital("City Hospital");

        // Create Doctors and Patients
        Doctor drPrakash = new Doctor("Dr. Prakash");
        Patient anubhav = new Patient("Anubhav");

        // Add to Hospital
        cityHospital.addDoctor(drPrakash);
        cityHospital.addPatient(anubhav);

        // Perform Consultation (Association)
        cityHospital.consult(drPrakash, anubhav);

        // View Consultations
        anubhav.viewConsultations();
    }
}
