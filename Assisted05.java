import java.util.*;
class Assisted05{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a radius of a cylinder: ");
		double radius = sc.nextDouble();
		System.out.print("Enter a height of a cylinder: ");
		double height = sc.nextDouble();
		sc.close();
		double volume = radius * radius * Math.PI * height;
		System.out.println(volume);
	}
}	