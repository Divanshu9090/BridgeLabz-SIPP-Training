package com.OOPD.associationandcommunication;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void consult(Doctor doctor, Patient patient) {
        doctor.consult(patient);
    }
}