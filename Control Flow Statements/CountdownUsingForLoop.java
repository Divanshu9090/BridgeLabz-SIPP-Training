import java.util.Scanner;
class CountdownUsingForLoop {
    public static void main(String[] args) {
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get an user input
		int countdown = input.nextInt();
	
        // countdown from number to 1 using for loop
        for (int i = countdown; i >= 1; i--) {
            System.out.println(i);
        }
        //close Scanner stream
		input.close();
    }
}
