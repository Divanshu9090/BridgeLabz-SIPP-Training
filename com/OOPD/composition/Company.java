package com.OOPD.composition;

import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (deptName.equals(dept.getName())) {
                return dept;
            }
        }
        return null;
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            dept.listEmployees();
        }
    }
}