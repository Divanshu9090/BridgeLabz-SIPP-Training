package com.regex;

import java.util.regex.*;

public class EmailVerifier {
	public static void main(String[] args) {
	    String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
	    Pattern pattern = Pattern.compile(regex);
	    String[] emails = {"PrakashOlala@example.com", "ayush@", "divanshu@domain"};
	
	
	    for (String email : emails) {
	        Matcher matcher = pattern.matcher(email);
	        System.out.println(email + " is valid: " + matcher.matches());
	    }
    }
}
