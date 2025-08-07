package com.emailfilteringsystem;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		EmailManager em = new EmailManager();
		ArrayList<String> name =  new ArrayList<String>();
		ArrayList<String> email =  new ArrayList<String>();
		name.add("Divanshu");email.add("divanshu@company.com");
		name.add("Ayush");email.add("ayush@company.com");
		name.add("Prakash");email.add("prakash123@company.com");
		name.add("Manish");email.add("manish@company.com");
		name.add("Anubhav");email.add("Anubhav@comany.com");
		name.add("Aftab");email.add("aftab786makshad.com");
		for(int i=0 ;i<name.size();i++) {
			em.addEmployee(name.get(i), email.get(i));
		}
		
		try{
			for(Employee n:em.searchByDomain("company.com")) {
				System.out.println(n.toString());
			}
		}catch(NoEmployeeFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
