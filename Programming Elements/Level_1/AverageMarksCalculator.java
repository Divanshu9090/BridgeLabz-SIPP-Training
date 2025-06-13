class AverageMarksCalculator{
	public static void main(String [] args){
		//Creating a variables to store name and different Subjects mark(PCM) obtain out of 100.
		String name = "Sam";
		int math = 94, physics = 95 , chemistry = 96 ;
		
		//Calculate average marks and store in variable name averageMarks
		double averageMarks = (math+physics+chemistry)/3.0 ;
		
		//Display averageMarks
		System.out.println(name+"'s average mark in PCM is "+averageMarks);
	}
}