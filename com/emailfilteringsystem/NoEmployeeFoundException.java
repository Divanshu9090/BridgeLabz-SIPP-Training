package com.emailfilteringsystem;

public class NoEmployeeFoundException extends Exception {
	public NoEmployeeFoundException(String message) {
		super("No employees are found for a given domain");
	}
}
