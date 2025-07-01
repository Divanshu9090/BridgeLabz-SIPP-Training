package PracticeProblem;

import java.util.Scanner;

public class Assisted03 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a temperature in celsius: ");
		double temperature = sc.nextDouble();
		sc.close();
		double fahrenheit = temperature*(9.0/5.0) + 32;
		System.out.println(fahrenheit);
	}
}
