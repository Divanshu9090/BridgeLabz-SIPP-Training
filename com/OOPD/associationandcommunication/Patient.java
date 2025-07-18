package com.OOPD.associationandcommunication;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void viewConsultations() {
        System.out.println("Consultations for " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Consulted " + doctor.getName());
        }
    }

    public String getName() {
        return name;
    }
}