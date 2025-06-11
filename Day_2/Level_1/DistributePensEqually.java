class DistributePensEqually{
	public static void main (String [] args){
		//create a variables to Store number of pens and number of students.
		int pens = 14 , students = 3;
		
		//Calculate number of pen get by each student and remaining pens.
		int pensGetByEachStudents = pens/students ;
		int remainingPens = pens%students;
		
		//Display the pensGetByEachStudents and remainingPens.
		System.out.println("The Pen Per Student is "+pensGetByEachStudents+
			" and the remaining pen not distributed is " + remainingPens) ;
	}
}