import java.util.*;
public class Self01{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double Principal = sc.nextDouble();
		double Rate = sc.nextDouble();
		int Time = sc.nextInt();
		double Simple_Interest = (Principal * Rate * Time) / 100;
		System.out.println(Simple_Interest);
	}
}