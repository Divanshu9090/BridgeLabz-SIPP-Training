package com.OOPD.composition;

class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " (ID: " + id + ")";
    }
}