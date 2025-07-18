package com.OOPD.composition;

public class Main {
	public static void main(String[] args) {
        // Create Company
        Company company = new Company("Tech Corp");

        // Add Departments
        company.addDepartment("Engineering");
        company.addDepartment("HR");

        // Add Employees to Departments
        Department engDept = company.getDepartment("Engineering");
        if (engDept != null) {
            engDept.addEmployee(new Employee("Divanshu", "E001"));
            engDept.addEmployee(new Employee("Anubhav", "E002"));
        } else {
            System.out.println("Engineering department not found");
        }

        Department hrDept = company.getDepartment("HR");
        if (hrDept != null) {
            hrDept.addEmployee(new Employee("Prakash", "H001"));
        } else {
            System.out.println("HR department not found");
        }

        // List Departments and Employees
        company.listDepartments();

        // Deleting company (departments and employees are also deleted implicitly)
        company = null;
        System.gc(); // Suggest garbage collection to demonstrate composition
    }
}
