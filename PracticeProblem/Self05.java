package PracticeProblem;

import java.util.Scanner;

public class Self05 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double Kilometers = sc.nextDouble();
		double Miles = Kilometers * 0.621371;
		System.out.println(Miles);
		sc.close();
	}
}
