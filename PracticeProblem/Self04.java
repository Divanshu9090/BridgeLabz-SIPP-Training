package PracticeProblem;

import java.util.Scanner;

public class Self04 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double average = (a+b+c)/3.0;
		System.out.println(average);
		sc.close();
	}
}
