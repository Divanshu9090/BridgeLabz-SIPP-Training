package com.OOPD.compositionandaggregation;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculty;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty facultyMember, String deptName) {
        faculty.add(facultyMember);
        for (Department dept : departments) {
            if (deptName.equals(dept.getName())) {
                dept.addFaculty(facultyMember);
                break;
            }
        }
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            dept.listFaculty();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}