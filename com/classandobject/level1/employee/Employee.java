package com.classandobject.level1.employee;

public class Employee {
	private String name;
	private int id, salary;
	private static int idgenerator = 1;

	public Employee(int salary, String name) {
		this.name = name;
		this.id = idgenerator;
		this.salary = salary;
		idgenerator++;
	}

	public void display() {
		System.out.println("Employee id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}
