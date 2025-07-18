package com.OOPD.compositionandaggregation;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Faculty> faculty;

    public Department(String name) {
        this.name = name;
        this.faculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty facultyMember) {
        faculty.add(facultyMember);
    }

    public void listFaculty() {
        System.out.println("Faculty in " + getName() + " department:");
        for (Faculty f : faculty) {
            System.out.println("- " + f);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}