package PracticeProblem;

import java.util.Scanner;

public class Assisted04 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a radius of a circle: ");
		double radius = sc.nextDouble();
		sc.close();
		double area = radius * radius * Math.PI;
		System.out.println(area);
	}
}
