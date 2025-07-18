package com.OOPD.composition;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        System.out.println("Employees in " + name + " department:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}