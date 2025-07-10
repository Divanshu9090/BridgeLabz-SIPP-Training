package com.universitycourseenrollmentsystem;

public class Main {
	public static void main(String[] args) {
		// Students
		Undergraduate ugStudent = new Undergraduate("UG001", "Anubhav");
		Postgraduate pgStudent = new Postgraduate("PG001", "Prakash");

		// Courses
		Course course1 = new Course("CS101", "Data Structures", 4);
		Course course2 = new Course("CS501", "Advanced Algorithms", 3);

		// Faculty
		Faculty faculty = new Faculty("F001", "Dr. Sanju Baba");

		// Enrollment
		Enrollment enroll1 = new Enrollment(ugStudent, course1);
		Enrollment enroll2 = new Enrollment(pgStudent, course2);
		
		faculty.assignGrade(enroll1, 3.8);
		faculty.assignGrade(enroll2, 4.0);

		
		ugStudent.viewTranscript();
		pgStudent.viewTranscript();
	}
}